package practice.summer;

import java.util.ArrayList;

public class Permutation {
	
	
	public static ArrayList<String> getPerms(String s) {
		
		ArrayList<String> list = new ArrayList<>();
		
		if(s.length() == 0){
			list.add("");
			return list;
		}
	
		char first = s.charAt(0);
		
		ArrayList<String> words = getPerms(s.substring(1));
		for(String word : words){
			for(int i = 0 ; i <= word.length() ; i++){
				 word  = insert(word,i,first);
				 list.add(word);
			}
		}
		
		return list;
	}
	
	public static String  insert(String word, int offset , char first){
		
		String start = word.substring(0, offset);
		String end = word.substring(offset);
		return start + first + end;	
	}
	
	public static void main(String[] args){
		String s  = "abcd";	
		System.out.println(getPerms(s));
	}

}
