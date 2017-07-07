package summer.datastructure;

import java.util.EmptyStackException;

public class MyStack<T> {
	
	private static class StackNode<T>{
		T val;
		StackNode next;
		
		public StackNode(T value){
			this.val = value;
		}
	}
	int size;
	StackNode<T> head;
	//StackNode<T> tail;
	
	public T pop(){
		if(head == null) throw new EmptyStackException();
		T item = head.val;
		head = head.next;
		size--;
		return item;
	}
	
	public void push(T item){
		StackNode<T> node = new StackNode<T>(item);
		node.next = head;
		head = node;
		size++;
	}
	
	public T peek(){
		if(head == null) throw new EmptyStackException();
		return head.val;
	}
	
	public boolean isEmpty(){
	//	return head == null
		return size == 0;
	}

}
