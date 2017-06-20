package practice.summer;

public class BalancedTreeFromSortedArray {
	private class TreeNode{
		 int val;
		 TreeNode left;
		 TreeNode right;
		
	   public TreeNode(int val){
		   this.val = val;
		   this.left = null;
		   this.right = null;
	   }
	}
	public TreeNode getTree(int[] arr, int start , int end){
		
		TreeNode root = null; 
		
		while(start <= end){
			int mid = start + end >>> 1;
			
			root = new TreeNode(arr[mid]);
			
			root.left = getTree(arr, start, mid -1);
			
			root.right = getTree(arr, mid+1, end);
		}
		return root;
	}
	
	
}
