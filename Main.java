// arr=[4,5,7,3,1]

class Main{
	public static void main(String[] args){
		int[] nums = {-5,-1,5,-3,-1,2,3,-6};
		int n = nums.length-1;
		int resultSum = subarraySum(nums, n);
		System.out.println("SubArray sum:"+" "+resultSum);
	}

	static int subarraySum(int[] nums, int n){
		int curr = 0;
		int maxTillNow = Integer.MIN_VALUE;
 
		for(int i = 0; i< n; i++){
			curr += nums[i];
			maxTillNow = Math.max(curr, maxTillNow);

			if(curr <= 0){
				curr = 0;
			}
		}
		
		return maxTillNow;
	}
}