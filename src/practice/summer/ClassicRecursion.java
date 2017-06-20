package practice.summer;

import java.util.ArrayList;

public class ClassicRecursion {

	private final static  int TARGET = 100;
	
	private final static int[] nums = {1,2,3,4,5,6,7,8,9};
	
	static ArrayList<String> f(int target, int firstNum, int firstIndex){
		
		int digit = Math.abs(firstNum%10);
		
		if(firstIndex >= nums.length){
			if(firstNum == target){
				
				ArrayList<String> result = new ArrayList<String>();
				
				result.add(Integer.toString(digit));
				
				return result;
				
			}else{
				
				return new ArrayList<String>();
			}
		}
		
		ArrayList<String> branch1 = f(target-firstNum, nums[firstIndex], firstIndex+1);
		
		ArrayList<String> branch2 = f(target-firstNum, -nums[firstIndex], firstIndex+1);
		
		
		int concate = firstNum >= 0 ? firstNum * 10 + nums[firstIndex] : firstNum * 10 - nums[firstIndex] ;
		
		ArrayList<String> branch3 = f(target, concate, firstIndex+1);
		
		ArrayList<String> results = new ArrayList<String>();

        results.addAll(add(digit, "+", branch1));
        results.addAll(add(digit, "-", branch2));
        results.addAll(add(digit, "", branch3));

        return results;
		
	}
	
	static ArrayList<String> add(int digit, String sign, ArrayList<String> branches) {
        for (int i = 0; i < branches.size(); i++) {
            branches.set(i, digit + sign + branches.get(i));
        }

        return branches;
    }
	
	public static void main(String[] args){
		
		System.out.println(f(TARGET, nums[0] , 1));
	}
	
	

}
