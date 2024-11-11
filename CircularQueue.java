class CircularQueue{
	private int front;
	private int rear;
	private int[] arr;
	private int size;

	CircularQueue(int size){
		this.size = size;
		this.arr = new int[size];
		this.front = -1;
		this.rear = -1;
	}
	
	void enqueue(int x){
	
		if(isFull()){
			System.out.println("Queue Overflow!");
			return;
		}
		if(isEmpty()){
			front = 0;
		}
		//move in circular way & insert
		rear = (rear + 1) % size;
		arr[rear] = x;
		System.out.println("Enqueued:"+" "+x);
	}
	int dequeue(){

		if(isEmpty()){
			System.out.println("Queue underflow.");
			return -1;
		}

		int item = arr[front];
		
		if(front == rear){
			front = -1;
			rear = -1;
		}else{
			//move in circular way
			front = (front + 1) % size;
		}
		System.out.println("Dequeued:"+" "+item);
		return item;
	}

	boolean isFull(){
		return (rear+1) % size == front;
	}	
	
	boolean isEmpty(){
		return front == -1;
	}
	
	public static void main(String[] args){
	
	CircularQueue myQueue = new CircularQueue(5);

	//testing enqueue fn
	myQueue.enqueue(19);
 	myQueue.enqueue(10);
        myQueue.enqueue(20);
        myQueue.enqueue(30);
	myQueue.enqueue(57);
	myQueue.enqueue(87);
	myQueue.enqueue(12);

	//testing dequeue fn
	
	myQueue.dequeue();
		
	}	
	
}