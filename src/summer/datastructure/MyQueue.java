package summer.datastructure;

import java.util.NoSuchElementException;

public class MyQueue<T> {
	
	private static class QueueNode<T>{	
		QueueNode next;
		T value;
		
		public QueueNode(T val){
			this.value = val;
		}
	}
	
	private QueueNode<T> head;
	private QueueNode<T> tail;
	
	public void add(T item){
		QueueNode<T> node = new QueueNode<T>(item);
		if(tail != null){
			tail.next = node;
		}
		tail = node;
		if(head == null){
			head = tail;
		}
	}
	
	public T remove(){
		
		if(head == null) throw new NoSuchElementException("The Queue is Empty");
		T item = head.value;
		head = head.next;
		if(head == null){
			tail = null;
		}
		return item;
	}
	
	public T peek(){
		if(head == null) throw new NoSuchElementException("The Queue is Empty");
		return head.value;
	}
	
	public boolean isEmpty(){
		return head == null;
	}
	
}
