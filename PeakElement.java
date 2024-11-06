class PeakElement{
	public static void main(String[] args){
		int[] a = {1,2,3,4,5,4};
		int n = a.length;
		int res = peakOne(a,n); 
		System.out.println(res);
	}	
	static int peakOne(int[] a, int n){
		int p = 1;
		for(int i = 0; i<n; i++){
			if(a[i]<a[p] && a[i+p] < a[p]){
				return p;
			}else{
				p++;
			}	
		}
		return -1;
	}
}