
//abbcbba --> aca
class pcp{
	
	public static void main(String[] args){
		String str  = "abbcbba";
		
		String res = processStr(str);
		System.out.println(res);	
	}

	private static String processStr(String up){
		if(up.isEmpty()){
			return "";
		}
		
		char ch = up.charAt(0);
		if(ch == 'b'){
			return processStr(up.substring(1));
		}else{
			return ch + processStr(up.substring(1));	
		}
		
	}	
}