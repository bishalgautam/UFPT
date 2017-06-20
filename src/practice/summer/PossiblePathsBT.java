package practice.summer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/*You are given a binary tree in which each node contains a value.
 *  Design an algorithm to print all paths which sum up to that value. 
 * Note that it can be any path in the tree - it does not have to start at the root.
 * 
 * */

public class PossiblePathsBT {

	private static class TreeNode{
		 int val;
		 TreeNode left;
		 TreeNode right;
//		 TreeNode parent;
		 
	   public TreeNode(int val){
		   this.val = val;
		   this.left = null;
		   this.right = null;
//		   this.parent = null;
	   }
	}
	
	public static void printPath(TreeNode root, int val){
		helper(root, new ArrayList(), val);
	}
	
	public static void helper(TreeNode root, ArrayList<Integer> path, int val){
		
		if(root == null) return;
		
		path.add(root.val);
		
		helper(root.left, path,val);
		
		helper(root.right, path, val);
		
		int sum = 0;
		
		for(int i = path.size()-1; i >= 0; i--){
			sum += path.get(i);
			
			if(sum == val) {
				printPath(path, i);
			}
			
		}
		
		path.remove(path.size()-1);
	}
	
	public static void printPath(ArrayList<Integer> path, int i){
		for(int j = i; j < path.size(); j++){
			System.out.print( path.get(j) + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args){
		
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(3);
	    root.left.left = new TreeNode(2);
	    root.left.right = new TreeNode(1);
	    root.left.right.left = new TreeNode(1);
	    root.right = new TreeNode(-1);
	    root.right.left = new TreeNode(4);
	    root.right.left.left = new TreeNode(1);
	    root.right.left.right = new TreeNode(2);
	    root.right.right = new TreeNode(5);
	    root.right.right.right = new TreeNode(2);
        
	    printPath(root, 5);
	    
	}
}
