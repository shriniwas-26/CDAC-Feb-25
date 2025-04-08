class LinkedListDemo{
	Node head;
	int count=0;
	static class Node{
		
		int data;
		Node next;
		Node(int data){
			this.data = data;
			this.next = null;
		}
	}
	void addFirst(int data){
		Node newNode = new Node(data);
		if(head==null){
			head = newNode;
		}else{
			newNode.next = head;
			head = newNode;
		}
	}
	
	void addLast(int data){
		Node newNode = new Node(data);
		Node t = head;
		if(head==null){
			head = newNode;
			return;
		}
		while(t.next!=null){
			t = t.next;
		}
		t.next = newNode;
	}
	
	int getCount(){
		Node t = head;
		while(t!=null){
			this.count++;
			t = t.next;
		}
		return count;
	}
	
	void insert(int data, int index){
		Node newNode = new Node(data);
		Node t = head;
		if(index>getCount()){
			System.out.println("Cant insert at this index.");
			return;
		}
		if(head==null){
			head = newNode;
			return;
		}
		for(int i=1; i<index; i++){
			t = t.next;
		}
		newNode.next = t.next;
		t.next = newNode;
	}
	
	void delete(int key){
		Node temp = head;
		Node prev = null;
		// delete at begining
		if(temp!=null && temp.data==key){
			head = temp.next;
			return;
		}
		// delete in between
		while(temp!=null && temp.data != key){
			prev = temp;
			temp = temp.next;
		}
		if(temp == null){
			return;
		}
		
		prev.next = temp.next;
		
	}
	
	public Node reverseList(Node head) {
        Node prev = null;
        Node current = head;
        Node next = null;

        while(current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        this.head = prev;
        return head;

    }
	
	boolean search(int data){
		Node temp = head;
		while(temp!=null){
			if(temp.data==data){
				return true;
			}
			temp = temp.next;
		}
		return false;
	}
	
	void display(){
		Node t = head;
		while(t!=null){
			System.out.print(t.data+" ==> ");
			t = t.next;
		}
	}
	public static void main(String[] args){
		LinkedListDemo ld = new LinkedListDemo();
		ld.addFirst(1);
		ld.addFirst(2);
		ld.addFirst(3);
		ld.addFirst(4);
		ld.addFirst(5);
		ld.addLast(20);
		ld.addLast(30);
		ld.display();
		System.out.println();
		ld.insert(15,7);
		ld.display();
		System.out.println();
		ld.delete(55);
		ld.display();
		System.out.println();
		System.out.println(ld.search(5));
		System.out.println(ld.search(80));
		ld.reverseList(ld.head);
		ld.display();
	}
}