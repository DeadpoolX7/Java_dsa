class DLNode{
	int data;
	Node next;
	Node back;
	DLNode(int data, Node next, Node back){
		this.data  = data;
		this.next = next;
		this.back = back;
	}
	DLNode(int data){
		this.data =  data;
		this.next = null;
		this.back = null;
	}

}

public class DoublyLinkedList{
	public static Node convertArr2DLL(int[] arr){
		DLNode head = new DLNode(arr[0]);
		DLNode current = head;
		DLNode prev = head;
		for(int i =1; i< arr.length; i++){
			current.next = new Node(arr[i]);
			current = current.next;
			DLNode temp = new Node(arr[i], null, prev);
			prev.next = temp;
			prev = temp;
		}
		return head;
	}
	public static void printDLL(Node head){
		DLNode current = head;
		while(current.next != null){
		System.out.print(current.data+" <-> ");
		current = current.next;
		}
		System.out.print("null");
	}
	
	public static void main(String[] args){
		int[] arr = {12.7,17,97,5,2};
		DLNode head  = converArr2DLL(arr);
		
		printDLL(head);
	}
	

}