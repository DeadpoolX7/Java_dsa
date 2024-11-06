//Singly Linked-List

class Node{
	 int data;
	 Node next;
	
	Node(int data){
		this.data = data;
		this.next = null;
	}
	
	
	public static void main(String[] args){
		int[] arr = {5,7,8,3,4};
		int length = 0, pos = 0;
		int target = 8; //search this element
		Node head = new Node(arr[0]);
		Node current = head;
		for(int i = 1; i< arr.length; i++){
			current.next = new Node(arr[i]);
			current = current.next; //move to next node
		}
		System.out.println("Printing the LinkedList: ");
		current = head;
		while(current != null){
			length++;
			if(current.data == target){
				pos = length;
			}
			
			System.out.print(current.data+" -> ");
			current = current.next;
		}
		System.out.print("null");

		//Length of the List
		System.out.println("\nLength of the Linked List: "+length);
		//printing the position
		System.out.print("Index of 8 is: "+pos);
	}
}