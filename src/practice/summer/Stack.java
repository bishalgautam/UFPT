package practice.summer;
import java.util.*;

public class Stack<T> {
	private ArrayList<T> list;
	public Stack(){
		list = new ArrayList<T>();
	}

	public void push(T addNum){
		list.add(addNum);
	}
	
	public T pop(){
		if (list.size() <  1) throw new IllegalArgumentException("The Stack is Empty");
		T result = list.remove(list.size()-1);		
		return result;
	}
	
	public T peek(){
		if (list.size() <  1) throw new IllegalArgumentException("The Stack is Empty");
		return list.get(list.size()-1);
	}
    
	
}
