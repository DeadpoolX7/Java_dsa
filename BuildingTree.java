class Node{
	int data;
	Node left, right;
	Node(int data){
		this.data = data;
		left = right = null;
	}

}

class BuildingTree{

	static void postOrder(Node node){
		//Base case
		if(node == null) return;
		postOrder(node.left);
		postOrder(node.right);
		System.out.print(node.data+" ");

	}

	public static void main(String[] args){

		Node root = new Node(2);
		root.left = new Node(4);
		root.right = new Node(5);
		root.left.left = new Node(3);
		root.left.right = new Node(14);

		System.out.println("\nBinary Tree: ");
		postOrder(root);
	
	}	


}