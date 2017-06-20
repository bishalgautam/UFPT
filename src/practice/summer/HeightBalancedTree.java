package practice.summer;

public class HeightBalancedTree {

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
	public boolean isBalanced(TreeNode root){
		if(helper(root) != -1) 
			return true;
		return false;
	}
	
	public int helper(TreeNode root){
		
		if(root == null) return 0;
		
		int left = helper(root.left) + 1;
		if(left == -1) return -1;
		
		int right = helper(root.right) + 1;
		if(right == -1) return -1;
		
		if(Math.abs(left - right) > 1) return -1;	
		return Math.max(left, right);
		
	}
	
}
