import java.util.Stack;

class StackQueue{
	private Stack<Integer> stack1;
	private Stack<Integer> stack2;
	
	
	StackQueue(){
		this.stack1 = new Stack<>();
		this.stack2 = new Stack<>();
	}
	public void enqueue(int x){
		stack1.push(x);
		System.out.println("Enqueued:"+" "+x);
	}	

	public void dequeue(){

		if(isEmpty()){
			System.out.println("Queue underflow!");
		}

		if(stack2.isEmpty()){
			while(!stack1.isEmpty()){
				stack2.push(stack1.pop());
			}
		}
		int item = stack2.pop();
		System.out.println("Dequeued: "+" "+item);
	}

	boolean isEmpty(){
		return stack1.isEmpty() && stack2.isEmpty();
	}

	public static void main(String[] args){
		StackQueue myStackQueue = new StackQueue();
		
		//testing enqueue fn
		myStackQueue.enqueue(9);
 		myStackQueue.enqueue(10);
        	myStackQueue.enqueue(20);
        	myStackQueue.enqueue(30);
		
		//testing dequeue fn
		 myStackQueue.dequeue();
		 myStackQueue.dequeue();

	}
}