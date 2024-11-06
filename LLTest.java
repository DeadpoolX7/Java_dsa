class LLNode{
	public int data;
	public LLNode next;
	
	public LLNode(int data){
		this.data  = data;
		this.next = null;	
	}	
	public LLNode(int data, LLNode next){
		this.data  = data;
 		this.next  = next;	
	}

}
public class LLTest{

	public static void printLL(LLNode head){
		while(head != null){
			System.out.print(head.data+" -> ");
			head = head.next;
		}
		System.out.print("null");
	}

	public static LLNode insertVal(LLNode head, int val){
		LLNode newNode = new LLNode(val);
		LLNode current = head;
		while(current.next != null){
			current = current.next;

		}
		current.next = newNode;		return head;
	}
	public static void main(String[] args){
		int[] arr1 = {15,48,9,12,7};
		int val = 100;
		LLNode head = new LLNode(arr1[0]);
		LLNode current  = head; 
		for(int i = 1; i < arr1.length; i++){
			current.next = new LLNode(arr1[i]);
			current = current.next;
		}
		head = insertVal(head, val);
		printLL(head);
	}
		
}