package practice.summer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subsets {
	
	static void print_subsets(String[] arr){
		int len = arr.length;
		int upperlimit = 1 << len;
		
		for(int mask = 0 ; mask < upperlimit; mask++ ){
			print(arr, mask);
		}
	}
	
	static void print(String[] arr, int mask){
		
		String result = "";
		for(int i = 0 ; i < arr.length ; i++){
				
			int bitmask = 1 << i;
			
			int bit = bitmask & mask;
			
			if(bit > 0){
				result += arr[i];
			}
			
		}
		
		System.out.println(result);
	}
	

	static ArrayList<ArrayList<Integer>> getSubsets2(ArrayList<Integer> set) {
		
		int max = 1 << set.size();
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		
		for(int i = 0 ; i < max ; i++){
		
			ArrayList<Integer> subset = new ArrayList<Integer>();
			
			int k = i;
			int index = set.size() -1;
			
			while(k > 0){
				if(( k & 1) > 0) 
					subset.add(set.get(index));
				k >>= 1;
				index--;
			}
			result.add(subset);
		}
		
		return result;
		
	}
	
	// recursive approach 
	
	public static ArrayList<String> getpowerset(int a[],int n,ArrayList<String> ps)
    {
        if(n<0)
        {
            return null;
        }
        
        if(n==0)
        {
            if(ps==null)
                ps=new ArrayList<String>();
            ps.add(" ");
            return ps;
        }
        
        ps=getpowerset(a, n-1, ps);
        ArrayList<String> tmp=new ArrayList<String>();
        for(String s:ps)
        {
            if(s.equals(" "))
                tmp.add(""+a[n-1]);
            else
                tmp.add(s+a[n-1]);
        }
        ps.addAll(tmp);
        return ps;
    }
	
	public static void main(String[] args){
//		String[] arr = {"a" , "b" , "c" };
//		print_subsets(arr);	
//		
//		ArrayList<Integer> list = new ArrayList<Integer>();
//		int[] arr1 = {1,2,3};
//		for(int ar : arr1)
//			list.add(ar);
//		
//		ArrayList<ArrayList<Integer>> result = getSubsets2(list);
////		result = getSubsets2(list);
//		System.out.println(result);
//		
		int[] a = {1,2,3};
		ArrayList<String> ps = new ArrayList<String>();
		ArrayList<String> result = getpowerset(a, 3, ps);
		
		System.out.println(result);
		
//		for (ArrayList<Integer> a : result)
//			System.out.println(Arrays.toString(a.toArray()));
		  
	}

}
