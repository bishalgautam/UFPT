package practice.summer;

/*You have two very large binary trees: 
 * T1, with millions of nodes, and T2, with hun- dreds of nodes. Create an algorithm to decide if T2 is a subtree of T1.
 * 
 * 
 * */

public class SubtreeOrNot {
	
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
	
	public boolean isSubTree(TreeNode T1, TreeNode T2){
		
		if(T1 == null) return false;
		
		if (isSame(T1, T2)){
			return true;
		} 
		 return isSubTree(T1.left, T2) || isSubTree(T1.right, T2);
		
	}
	
	public boolean isSame(TreeNode T1, TreeNode T2){
		
		if(T1 == null  && T2 == null) return true;
		
		if(T1 == null || T2 == null) return false;
		
		if (T1.val != T2.val) return false;
		
		return isSame(T1.left, T2.left) && isSame(T1.right , T2.right);
	}

}
