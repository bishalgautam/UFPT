package practice.summer;
import java.util.Stack;

public class StackSort {
	
	//Stack<Integer> stackOne = new Stack<Integer>();
	
	
	Stack<Integer> sort(Stack<Integer> stackOne){
		Stack<Integer> stackTwo = new Stack<Integer>();
		
		while(!stackOne.isEmpty()){
			int curr = stackOne.pop();
			
			while(!stackTwo.isEmpty() && stackTwo.peek() < curr){
				stackOne.push(stackTwo.pop());
			}
			
			stackTwo.push(curr);
		}
		
		
		return stackTwo;
		
	}

}
