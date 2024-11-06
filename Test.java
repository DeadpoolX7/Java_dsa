class Test {


	public static void main(String[] args){
		int arr1[] = {3,5,8,9,15,19}; 
		int t = 7;
		int res = searchIdx(arr1, t); 
		System.out.println(res);
				
	}
	static int searchIdx(int[] arr1, int x){
		int left = 0, right = arr1.length-1;
		int ans = arr1.length;
		while(left <= right){
		int mid = left + (right - left)/2;
			if(arr1[mid] >= x){
				ans = mid;
				right = mid - 1;
			}else{
				left = mid + 1;
			}			
		}
	return ans;
	}
}
//arr1[] = {1,2,3,4,5}  
//arr2[] = {2,3,4,4,5}