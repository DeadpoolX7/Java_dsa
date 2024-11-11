class CustomStack{

	private int top = -1;
	private final int DEFAULT_SIZE = 10;
	private int[] arr;

	CustomStack(){
		this.arr = new int[DEFAULT_SIZE];
	}
	
	CustomStack(int size){
		this.arr = new int[size];
	}
	
	void push(int x){
		if(!isFull()){
			arr[++top] = x;
			System.out.println("Item,"+" "+x+" "+"is pushed.");
		}else{
			System.out.println("Stack Overflow!");
		}
		
	}

	void pop(){
		if(isEmpty()){
			System.out.println("Stack is Empty.");	
		}else{
			int poppedElem  = arr[top--];
			System.out.println("Popped element is"+" "+poppedElem);
		}
	}
	
	int peek(){
		if(isEmpty()){
			System.out.println("Stack is Empty.");
			return -1;
		}else{
			int elem = arr[top];
			return elem;
		}
	}

	void printStack(){
		if(isEmpty()){
			System.out.println("Stack is Empty.");	
		}else{
			int i = top;
			while(i >= 0){
				System.out.println("Element: "+" "+ arr[i]);
				i--;
			}
		}
	}
	
	 boolean isFull(){
		return top == arr.length -1;
	}
	boolean isEmpty(){
		return top == -1;
	}
	
	public static void main(String[] args){
		CustomStack myStack = new CustomStack();
	
		//testing push() fn
		myStack.push(2);
		myStack.push(4);
		myStack.push(-1);
		myStack.push(171);
	
		//testing peek() fn
		int topElem = myStack.peek();
		System.out.println("Current, Top element is"+" "+ topElem);
		//testing pop() function
		myStack.pop();

		//testing print fn
		myStack.printStack();

	}


}