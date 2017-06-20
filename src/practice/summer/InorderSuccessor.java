package practice.summer;


/*Write an algorithm to find the ‘next’ node (e.g., in-order successor) of a given node in a binary search tree 
 * where each node has a link to its parent.
 * 
 * 
 * */
public class InorderSuccessor {
	
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
	
	public TreeNode getInorderSuccessor(TreeNode root){
		
		if(root == null) return root;
		
		if(root.right != null){
			return getLeftest(root.right);
		}
		
		TreeNode p = root.parent;
		
		while(p != null && p.right == root){
			root = p;
			p = p.parent;
		}
		return p;
		
	}
	
	public TreeNode getLeftest(TreeNode root){
		
		if(root ==null) return null;
		
		while(root.left != null){
			root = root.left;
		}
		
		return root;
	}
	
}
