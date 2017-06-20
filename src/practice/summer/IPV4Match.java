package practice.summer;

import java.util.regex.Pattern;

public class IPV4Match {
	
	public static  boolean isMatch(String ip){
		 String  str = "^(([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.){3}([01]?\\d\\d?|2[0-4]\\d|25[0-5])$";
		 
	     Pattern pattern = Pattern.compile(str);
	     
	     return pattern.matcher(ip).matches();	
	}
	
	public static boolean print(StringBuilder sb, int d){
		
		if(d == 3) return isMatch(sb.toString());
		int n = sb.length();
		int i = sb.lastIndexOf(".") + 2;
		
		for( ; i < n ; i++){
			sb.insert(i, '.');
			if(print(sb,d+1)){
				System.out.println(sb);
			}
			sb.deleteCharAt(i);
		}
		return false;	
	}
	
	public static  void main(String[] args){
		String ip = "145.234.234.0";
		System.out.println(isMatch(ip));
		String s = "25525511134";
		StringBuilder sb = new StringBuilder(s);
		print(sb, 0); 
	}
	
}
