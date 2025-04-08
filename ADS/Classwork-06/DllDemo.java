class DllDemo{

	Node head;
	static class Node{
		int data;
		Node next;
		Node prev;
		
		Node(int data){
			this.data = data;
			next = null;
			prev = null;
		}
	}
	
	void insertFirst(int data){
		Node newNode = new Node(data);
		if(head == null){
			head = newNode;
			return;
		}
		newNode.next = head;
		head.prev = newNode;
		head = newNode;
	}
	
	void insertLast(int data){
		Node newNode = new Node(data);
		Node t = head;
		if(head == null){
			head = newNode;
			return;
		}
		while(t.next != null){
			t = t.next;
		}
		t.next = newNode;
		newNode.prev = t;
	}
	
	void display(){
		Node t = head;
		if(t==null){
			System.out.println("The doubly linked list is empty.");
			return;
		}
		while(t!=null){
			System.out.print("("+t.prev+","+t.data+" ==> "+t.next+") ");
			t = t.next;
		}
	}
	
	public static void main(String[] args){
		DllDemo dll = new DllDemo();
		dll.display();
		dll.insertLast(1);
		dll.insertLast(2);
		dll.insertLast(3);
		System.out.println();
		dll.display();
	}
}