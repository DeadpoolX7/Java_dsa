class TwoSum{
	public static void main(String[] args){
		int[] arr = {2,4,7,11,15};
		int t = 13;
		int left =0;
		int right = arr.length-1;
		int[] RetArr = new int[2];
		while(left < right){
			int total = arr[left] + arr[right];
			if(total == t){
				RetArr[0] = left+1;
				RetArr[1] = right+1;
				return RetArr; 
			}else if(total < t){
				left++;
			}else{
				right--;
			}
		}
		RetArr[0] = -1;
		RetArr[1] = -1;
		return RetArr;
	}
}

//[2,7,11,15], t = 9
// L	   R