package practice.summer;


/*
 * Design an algorithm and write code to  find the first common ancestor of two nodes in a binary tree. 
 * Avoid storing additional nodes in a data structure. NOTE: This is not necessarily a binary search tree.
 * 
 * 
 * */

public class FirstCommonAncestor {
	private class TreeNode{
		 int val;
		 TreeNode left;
		 TreeNode right;
		 TreeNode parent;
		 
	   public TreeNode(int val){
		   this.val = val;
		   this.left = null;
		   this.right = null;
		   this.parent = null;
	   }
	}
	
	public TreeNode getBST(TreeNode root, TreeNode p , TreeNode q){
		// search tree 
		
		if( p.val < root.val && q.val < root.val ){
			return getBST(root.left, p, q);
		}
		else if(p.val > root.val && q.val > root.val){
			return getBST(root.right, p, q);
		}
		
		return root;
	}
	
	public TreeNode getBT(TreeNode root, TreeNode p, TreeNode q){
		
		if(root == p || root == q || root == null)
			return root;
		
		TreeNode left = getBT(root.left, p, q);
		
		TreeNode right = getBT(root.right, p, q);
		
		
		if(left == null && root == null) return null;
		
		if (left == null || right == null) return left == null ? right : left;
		
		return root;
	}
}
