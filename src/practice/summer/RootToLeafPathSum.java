package practice.summer;

public class RootToLeafPathSum {
	
	private static class TreeNode{
		 int val;
		 TreeNode left;
		 TreeNode right;
	//	 TreeNode parent;
		 
	   public TreeNode(int val){
		   this.val = val;
		   this.left = null;
		   this.right = null;
		//   this.parent = null;
	   }
	}
	
	static boolean hasPath(TreeNode root, int sum){
		
		if(root == null) return sum == 0;
		
		return hasPath(root.left, sum - root.val) || hasPath(root.right, sum-root.val);
	}
	
	public static void main(String[] args){	
		
		 TreeNode root = new TreeNode(10);
         root.left = new TreeNode(8);
         root.right = new TreeNode(2);
         root.left.left = new TreeNode(3);
         root.left.right = new TreeNode(5);
         root.right.left = new TreeNode(2);
         
         System.out.println(hasPath(root, 21));
         System.out.println(hasPath(root, 23));
         System.out.println(hasPath(root, 14));
         System.out.println(hasPath(root, 20));
	}

}
