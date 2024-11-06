class RotateArray{

	static void rotatingArray(int[] nums, int n, int k){
		int[] arr = new int[k];
		int j = 0;
		//taking last k elements
		for(int i = k; i > 0; --i){
			arr[j++] = nums[i];
		}
		//pushing it forward
		for(int i = 0; i < k; i++){
			nums[i++] = arr[i];
		}
		for(int e : nums){
			System.out.println(e);
		}	
	}	

	public static void main(String[] args){
		int[] nums = {1,2,3,4,5,6,7};
		int n = nums.length;
		int k = 3;
		rotatingArray(nums, n, k);
	}

}



/*Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.

Example 1:

Input: nums = [1,2,3,4,5,6,7], k = 3
Output: [5,6,7,1,2,3,4]
Explanation:
rotate 1 steps to the right: [7,1,2,3,4,5,6]
rotate 2 steps to the right: [6,7,1,2,3,4,5]
rotate 3 steps to the right: [5,6,7,1,2,3,4]*/