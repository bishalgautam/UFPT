package summer.datastructure;

public class TreeNode {
	
	/**
	 * 	TreeNode 
	 *  
	 * 
	 * */
	
	// instance variables 
	
	int val;
	TreeNode left, right , parent;
	private int size = 0;
	
	public TreeNode(int data){
		this.val = data;
		this.size = 1;
	}
	
	public void insertInOrder(int d){
		
		if(d <= val){
			
			if(left != null)
				left.insertInOrder(d);
			else
				setLeft(new TreeNode(d));
				
		}else{
			
			if(right != null)
				right.insertInOrder(d);
			else
				setRight(new TreeNode(d));
		}
		
		size++;
	}
	
	public int size(){
		return this.size;
	}
	
	public TreeNode find(int d){
		if (d == val){
			return this;
		}else if( d <= val){
			 return left != null ? left.find(d) : null;
		}else if( d > val){
			 return right != null ? right.find(d) : null;
		}
		
		return null;
	}
	
	
	public void setLeft(TreeNode root){
		this.left = root;
		if(root != null)
			root.parent = this.left;
	}
	
	public void setRight(TreeNode root){
		this.right = root;	
		if(root != null)
			root.parent = this.right;
		
	}
}
