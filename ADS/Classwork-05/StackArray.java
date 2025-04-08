class StackArray{
	private int[] arr;
	private int top;
	private int capacity;
	
	StackArray(int size){
		arr = new int[size];
		capacity = size;
		top = -1;
	}
	
	boolean isFull(){
		return top == capacity-1;
	}
	
	boolean isEmpty(){
		return top == -1;
	}
	
	void push(int item){
		if(isFull()){
			System.out.println("Stack Overflow! Cannot insert " + item);
            return;
		}
		arr[++top] = item;
	}
	
	int pop(){
		if (isEmpty()) {
            System.out.println("Stack Underflow! No elements to pop.");
            return -1;
        }
        return arr[top--];
	}
	
	int peek(){
		if (isEmpty()) {
            System.out.println("Stack is empty!");
            return -1;
        }
		return arr[top];
	}
	
	public static void main(String[] args){
		StackArray stack = new StackArray(5);
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		System.out.println(stack.isFull());
		System.out.println(stack.pop());
		System.out.println(stack.isFull());
		System.out.println(stack.peek());
	}
}