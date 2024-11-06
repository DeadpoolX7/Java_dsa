import java.util.Arrays;

class countingSort{
	public static void main(String[] args){
		int[] arr = {4,2,2,8,3,3,1};
		int n = arr.length;
		int maxElem = Arrays.stream(arr).max().getAsInt();
		int[] res = sortIt(arr,maxElem,n);
		for(int i : res){
			System.out.print(i +" ");
		}
	}
	static int[] sortIt(int[] arr, int maxElem, int n){
		int[] countArray = new int[maxElem+1];
		int[] output = new int[n];
		for(int i = 0; i < maxElem-1; i++){
			countArray[i] = 0;
		}
		//store the count of element
		for(int j = 0; j < n; j++){
			countArray[arr[j]]++;
		}
		//culminative sum
		for(int k = 1; k <= maxElem; k++){
			countArray[k]+= countArray[k-1];	
		}
		for(int s = n-1; s>=0; s-- ){
			output[countArray[arr[s]] - 1] = arr[s];
			countArray[arr[s]]--;
		}
		return output;
	}
		
}