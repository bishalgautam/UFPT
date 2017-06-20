package practice.summer;

import java.util.ArrayList;
import java.util.Arrays;

/*Imagine a robot sitting on the upper left hand corner of an NxN grid. The robot can only move in two directions: right and down. 
 * How many possible paths are there for the robot?
	FOLLOW UP
	Imagine certain squares are “o  limits”, such that the robot can not step on them. 
	Design an algorithm to get all possible paths for the robot
 * 
 * */

public class RobotPath {
	/*
	 * *  1 -1 1 
	 * 	  1 -1 1
	 *    1  1 1
	 */	
	
	
	// remember if the obstruction lies in the left most column and and top row we need to set all the value to ) after that obstruction
	
	
	static int getPathObs(int[][] grid){
		
		int m = grid.length;
		int n = grid[0].length;
		
		boolean obs = false;
		for(int row = 0; row < n ; row++){
			
			if(obs == false && grid[row][0] == -1){
				obs = true;
			}
			
			if (obs) grid[row][0] = 0;
			
		}
		
		obs = false;
		for(int row = 0; row < n ; row++){
			
			if(obs == false && grid[0][row] == -1){
				obs = true;
			}
			
			if (obs) grid[0][row] = 0;
			
		}
		
		for(int row = 1 ; row < m ; row++){
			for(int col = 1 ; col < n; col++){
				
				if(grid[row][col] != -1){
					grid[row][col] = 0;
					
					if(grid[row-1][col] > 0){
						grid[row][col] += grid[row-1][col];
					}
					
					if(grid[row][col-1] > 0){
						grid[row][col] += grid[row][col-1];
					}
				}
				
			}
		}
		
		return grid[m-1][n-1];
	}
	
	static int getTotalPath(int[][] grid){
		
		int m = grid.length;
		int n = grid[0].length;
		
		for(int i = m -1; i >=0 ; i--){
			for(int j= n-1; j >=0; j--){
				if(i == m -1 || j == n - 1){
					grid[i][j] = 1;
				}else{
						grid[i][j] = grid[i][j+1] + grid[i+1][j];
				}
			}
		}
		
		return grid[0][0];
	}
	
//	private class Point{
//		int X;
//		int Y;
//		public Point(int x, int y){
//			this.X = x;
//			this.Y = y;
//		}
//	}
	
	
	static void getPath(int[][] grid){
		
		getpath(0,0,grid,"");
	}
	
	static void getpath(int row, int col, int[][] grid,  String path ){
			
		System.out.println("row :"+ row);
		System.out.println("col :"+ col);
		
		if(row == grid.length-1 && col == grid[0].length-1){
			System.out.println(path + "-"+ grid[row][col]);
			return;
		}
		
		if( row >= grid.length | col >= grid[0].length) return;
		
		path = (path == "") ? grid[row][col]+"" : path + "-" + grid[row][col];
		
		getpath(row ,col+1, grid, path);
		getpath(row+1, col, grid, path);	
		
	}
	
	public static void main(String[] args){
//		int[][] grid = new int[4][4];
//		
//		System.out.println(getTotalPath(grid));
//		int[][] arr = {{1,1,1,-1},{1,-1,1,1},{-1,1,1,1},{1,1,1,1}};
//		System.out.println(getPathObs(arr));
		
		int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 },{7,8,9} };	
		getPath(arr);
	}

}
