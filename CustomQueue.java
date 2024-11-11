class CustomQueue{
	private int front;
	private int rear;
	private int[] arr;
	private final int DEFAULT_SIZE = 10;
	
	CustomQueue(){
		this.front = -1;
		this.rear = -1;
		this.arr = new int[DEFAULT_SIZE];
	}	
	CustomQueue(int size){
		this.arr = new int[size];
		this.front = -1;
		this.rear = -1;
	}

	void enqueue(int x){
		if(isFull()){
			System.out.println("Queue overflow.");
		}
		if(isEmpty()){
			front = 0; //initialize when first elem is added
		}
		arr[++rear] = x;
		System.out.println("Item Enqueued.");
	}
	
	int dequeue(){
		if(isEmpty()){
			return -1;
		}
		int item = arr[front];
		if(front == rear){
			front = rear = -1;
		}else{
			front++;	
		}
		return item;
	}
	
	boolean isFull(){
		return rear == arr.length - 1;
	}
	boolean isEmpty(){
		return front == -1;
	}

	public static void main(String[] args){
		CustomQueue myQueue = new CustomQueue();
		
		//testing Enqueue fn
		myQueue.enqueue(4);
	 	myQueue.enqueue(10);
        	myQueue.enqueue(20);
        	myQueue.enqueue(30);

		//testing dequeue fn
		int poll = myQueue.dequeue();
		System.out.println(poll);
	}	

}