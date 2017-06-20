package practice.summer;

import java.util.Arrays;

public class rotateImage {
	
	public static void rotate(int[][] matrix, int n){
		
		for(int layer = 0; layer < n/2 ; layer++){
			
			int left = layer;
			int top = layer;
			int right = n - 1 - layer;
			int bottom = n - 1 -layer;
			
			for(int i = 0 ; i < n ; i++){
				
				int temp = matrix[top][left+i];
				
				matrix[top][left+i] = matrix[top+i][left];
				
				matrix[top+i][left] = matrix[bottom][left+i];
				
				matrix[bottom][left+i] = matrix[top+i][right];
				
				matrix[top+i][right] = temp;
				
			}
			
			top++;
			left++;
			bottom--;
			right--;
			
			
		}
		
	}
	
	public static void main(String[] args){
		int[][] arr = {{1, 2, 3,} , {4,5,6} ,{7,8,9}		
					  };
		System.out.println(Arrays.deepToString(arr));
		rotate(arr, 3);
		System.out.println(Arrays.deepToString(arr));
	
		
	}

}
