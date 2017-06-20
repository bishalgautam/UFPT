package summer.datastructure;

public class LinkedListNode {
	
	LinkedListNode prev, next, last;
	int data;
	
	public LinkedListNode(){
		
	}
	
	public LinkedListNode(int data){
		this.data = data;
	}
	
	public LinkedListNode(int data, LinkedListNode p , LinkedListNode n){
		this.data = data;
		setNext(n);
		setPrev(p);
	}
	
	public void setPrev(LinkedListNode p){
		this.prev = p;
		if(p != null){
			p.next = this;
		}
	}
	
	public void setNext(LinkedListNode n){
		this.next = n;	
		if(n != null){
			n.prev = this;
		}
	}
	
	public LinkedListNode clone(){
		
		LinkedListNode node = null;
		
		while(next != null){
			node = next.clone();
		}	
		return new LinkedListNode(this.data, node , this.next);
	}
}
