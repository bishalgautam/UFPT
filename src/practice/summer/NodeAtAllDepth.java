package practice.summer;
import java.util.*;

public class NodeAtAllDepth {
	
	private class TreeNode{
		 int val;
		 TreeNode left;
		 TreeNode right;
		
	   public TreeNode(int val){
		   this.val = val;
		   this.left = null;
		   this.right = null;
	   }
	
	public ArrayList<LinkedList<TreeNode>> getLevelList(TreeNode root){
		
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		ArrayList<LinkedList<TreeNode>> result = new ArrayList<LinkedList<TreeNode>>();
		queue.add(root);
		
		while(!queue.isEmpty()){
			
			int queueSize = queue.size();
			
			LinkedList<TreeNode> temp = new LinkedList<TreeNode>();
			
			for(int i = 0 ; i < queueSize ; i++){
				TreeNode currNode = queue.remove();
				temp.addLast(currNode);
				if(currNode.left != null){
					queue.add(currNode.left);
				}
				if(currNode.right != null){
					queue.add(currNode.right);
				}
				
			}
				result.add(temp);
			 
			}
			return result;
		}
		
	}

}
