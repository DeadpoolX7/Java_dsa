public class pallindromeTest{

	static boolean isPallindrome(String str1){
		int l = 0;
		int r = str1.length() - 1;
		while(l <= r){
			if(str1.charAt(l) != str1.charAt(r)){
				return false;
			}
			l++;
			r--;
		}
		return true;
	}
	
	public static void main(String[] args){
		String str1 = "racecar";
		String str2 = "petmep";
		boolean res = isPallindrome(str2);
		System.out.println("Pallindrome: "+res);
	}
}