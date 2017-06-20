package practice.summer;

import java.util.ArrayList;
import java.util.Stack;

public class SetofStacks {
	
	ArrayList<Stack> stacks = new ArrayList<Stack>();
	final static int CAPACITY = 10;
	
	public SetofStacks(){
		Stack<Integer> stack = new Stack<Integer>();
		stacks.add(stack);
	}
	public void push(int v){
		Stack<Integer> last = stacks.get(stacks.size()- 1);
		if(last.size() < CAPACITY){
			last.push(v);
		}else{
			Stack<Integer> temp = new Stack<Integer>();
			temp.push(v);
			stacks.add(temp);
		}
		
	}
	
	public int pop(){
		Stack<Integer> last = stacks.get(stacks.size()- 1);
		return last.pop();	
	}
	
	
	
	
}
