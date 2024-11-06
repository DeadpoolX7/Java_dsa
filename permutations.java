import java.util.ArrayList;
public class permutations{
	
	public static void main(String[] args){
		int n = 4;
		String up = "";
		for(int i = 1; i <= n; i++){	
			up += i;
		}
		ArrayList<String> ans = getPermutations("",up);
		System.out.println(ans);
	
	int k = 9;
	System.out.println(ans.get(k-2));	

	}	
	private static ArrayList<String> getPermutations( String p, String up){
		if(up.isEmpty()){
			ArrayList<String> list = new ArrayList<>();
			list.add(p);
			return list;
		}
		ArrayList<String> ans = new ArrayList<>();
	
	char ch = up.charAt(0);
	
	for(int i = 0; i <= p.length(); i++){
		String f = p.substring(0,i);
		String s = p.substring(i,p.length());
		ans.addAll(getPermutations(f + ch + s, up.substring(1)));
	}
	return ans;
		
	}
}