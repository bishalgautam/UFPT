package practice.summer;

public class MaxStack {
	
	Stack<Integer> stack = new Stack<Integer>();
	Stack<Integer> maxStack = new Stack<Integer>();
	int max = Integer.MIN_VALUE;
	
	public void push(int addNum){
		stack.push(addNum);	
		if( max <= addNum){
			max = addNum;
			maxStack.push(max);
		}
			
	}
	
	public Integer pop(){
		Integer temp = stack.pop();
		if(temp == maxStack.peek())
			maxStack.pop();
		return temp;
	}
	
	public Integer peek(){
		return stack.peek();
	}
	
	public int getMax(){
		return maxStack.peek();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MaxStack st = new MaxStack();
	
		st.push(2);
		st.push(5);
		st.push(-1);
		System.out.println(st.getMax());
		st.pop();
		System.out.println(st.getMax());
		st.pop();
		System.out.println(st.getMax());
	}

}
