package practice.summer;

/* 
 * 
 * 
 * 
 * 
 * */

public class NthFibonacci {
	
	static void getFibonacci(int n){
		
		int[][] M = new int[][]{{1,1},{1,0}};
		
		System.out.println(function(M , n-1));
	}
	

	static int function(int[][] M, int n){
		
		int[][] result = M.clone();
		
		while(n > 1){
			result = multiply(result , M);	
			n--;
		}
		
		return result[0][0];
	}
	static int[][] multiply(int[][] F , int[][] M){
		
		int[][] result = new int[2][2];
		
		result[0][0] = F[0][0] * M[0][0] + F[0][1] * M[1][0];
		result[0][1] = F[0][0] * M[0][1] + F[0][1] * M[1][1];
		
		result[1][0] = F[1][0] * M[0][0] + F[1][1] * M[1][0];
		result[1][1] = F[1][0] * M[0][1] + F[1][1] * M[1][1];
		
		return result;
	}
	
	public static void main(String[] args){
		getFibonacci(9);
	}
}
