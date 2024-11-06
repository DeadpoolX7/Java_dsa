import java.util.HashMap;

class Lcp{
	
	static int push(int num, int[] arr, int top){
		arr[top++] = num;
		return num;
	}	

	public static void main(String[] args){
		int[] arr = new int[10];
		int top = -1;
		for(int i = 10; i< 15; i++){
			int res = push(i,arr,top);
			System.out.println("Pushed: "+res);
		}
	}

}