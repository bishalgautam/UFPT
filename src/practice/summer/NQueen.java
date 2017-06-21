package practice.summer;

import java.util.Arrays;

public class NQueen {
	
	int[] columnForRow;
	int size;
	public NQueen(int N){
		this.size = N;
		columnForRow = new int[N];
	}
	
	public boolean check(int row){
		for(int i = 0 ; i < row; i++){
			int diff = Math.abs(columnForRow[i] - columnForRow[row]);
			if(diff == 0 || diff == row - i) return false;
		}
		return true;
	}
	
	public void printGrid(){
		int[][] grid = new int[size][size];
		for(int i = 0 ; i< size ; i++){
			for(int j = 0 ; j < size ; j++){
				if(j == columnForRow[i]) 
					grid[i][j] = 1;
			}
		}
		System.out.println(Arrays.deepToString(grid));
	}
	
	
	public void placeQueen(int row){
		if(row == size){
			printGrid();
			return;
		}
		
		for(int i= 0; i < size ; i++){
			columnForRow[row] = i;
			if(check(row)){
				placeQueen(row+1);
			}
		}
		
	}
	
	public static void main (String[] args){
		NQueen q = new NQueen(4);
		q.placeQueen(0);
		
	}

}
