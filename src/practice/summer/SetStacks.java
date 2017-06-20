package practice.summer;

import java.util.ArrayList;

public class SetStacks {
	
	ArrayList<Stack> stacks = new ArrayList<Stack>();
	
	public void push(int v){
		
	}
	
	public int popAt(int index){
		return leftShift(index, true);
	}
	
	public int leftShift(int index, boolean removeTop){
		Stack lstack = stacks.get(index);
		int removed_item;
		if(removeTop) removed_item = lstack.pop();
		else removed_item = lstack.removeBottom();
		if(lstack.size == 0){
			stacks.remove(index);
		}else if(index+1 < stacks.size()){
			int v = leftShift(index+1, false);
			lstack.push(v);
		}
		
		return removed_item;
	}
	
	private class Stack{
		
		private class Node{
			int value;
			Node below;
			Node above;	
			
			public Node(int val){
				this.value = val;
				this.below = null;
				this.above = null;
				
			}
		}
		
		final int CAPACITY = 10;
		Node top , bottom;
		int size = 0;
		
		
	    boolean isAtCapacity(){
			return size == CAPACITY;
		}
		
		 boolean push(int v){
			if(size >= CAPACITY) return false;
			size++;
			Node temp = new Node(v);
			if(size == 1) bottom = temp;
			join( temp, top);
			top = temp;
			return true;
		}
		
		 int pop(){
			 int value = top.value;
			 top = top.below;
			 size--;
			 return value;
		 }
		 
		 int removeBottom(){
			 Node b = bottom;
			 if(b != null) b = b.above;
			 if(b != null) b.below = null;
			 size--;
			 return b.value;
		 }
		
		  void join(Node below, Node above){
			if(below != null) below.above = above;
			if(above != null) above.below = below;
		}
	}

}
