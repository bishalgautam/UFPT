package practice.summer;

public class Parenthesis {

	
	public static void main(String [] args){
		printPar(3);
	}
	
	public static void printPar(int count) { 
//		char[] str = new char[count*2];
		StringBuilder sb = new StringBuilder();
//		printPar(count, count, str, 0);
		printPar(count, count, sb);
	}
	public static void printPar(int l, int r, StringBuilder sb ){
		
		if (l < 0 || r < l) return;
		
		if( l == 0 && r == 0){
			System.out.println(sb.toString());
		}else{
			
			if(l > 0){
//				str[count] = '(';
//				printPar(l-1, r, str, count +1);
				int len = sb.length();
				sb.append('(');
				printPar(l-1, r, sb);
				sb.setLength(len);
			}
			
			if(r > 0){
//				str[count] = ')';
//				printPar(l, r-1, str, count +1);
				int len = sb.length();
				sb.append(')');
				printPar(l, r-1, sb);
				sb.setLength(len);
			}
		}
	}

}
