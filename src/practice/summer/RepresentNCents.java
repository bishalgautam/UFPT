package practice.summer;

public class RepresentNCents {
	
	// Dynamic Programming Approach 
	
	public static int makeChange(int[] coins, int total){		
	int[] T = new int[total+1];
	T[0] = 1;
	for(int i = 0 ; i < coins.length ; i++){
		for(int j = 0; j <= total ; j++){
			if(coins[i] <= j){
				T[j] = T[j]+ T[j - coins[i]];
			}
		}
	}
	return T[total];
	}
	
	
	// Recursive Approach 
	
	
	
	
	
}