class CountSubarrays{
	
	public static void main(String[] args){
		int[] a = {3,1,2,4};
		int ts = 6;
		int n = a.length;
		int res = countSubarrays(a, ts, n);
		System.out.println(res);
	}
	static int countSubarrays(int[] a, int ts, int n){
		
		int count = 0;

		for(int i = 0; i < n; i++){ //3
			for(int j = 1; j < n ; j++){ //2,1,4...
				int sum = 0;
				for(int k = i; k <= j; k++){ //sum
					sum += a[k];
					
				}
				if(sum == ts){
					count++;
					}
			}
		}
		return count;
	}

}



