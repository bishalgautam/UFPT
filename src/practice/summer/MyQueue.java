package practice.summer;
import java.util.Stack;

public class MyQueue<T> {
	// primary stack 
	Stack<T> stackOne ;
	// secondary stack
	Stack<T> stackTwo ;
	
	public MyQueue(){
		stackOne = new Stack<T>();
		stackTwo = new Stack<T>();
	}
	
	int size(){
		return stackOne.size() + stackTwo.size();
	}
	
	void add(T val){
		stackOne.push(val);
	}
	
	T peek(){
		if(stackTwo.isEmpty()){
			while(!stackOne.isEmpty()){
				stackTwo.push(stackOne.pop());
			}
		}
		return stackTwo.peek();
	}
	
	T remove(){
		if(stackTwo.isEmpty()){
			while(!stackOne.isEmpty()){
				stackTwo.push(stackOne.pop());
			}
		}
		return stackTwo.pop();
		
	}

}
