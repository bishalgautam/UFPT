import java.util.Scanner;
import java.util.*;

public class CSUMQ {

//	public static double querySum(int[] arr, int i , int j ){
//		double[] sum = new double[arr.length] ;
//		int temp = 0;
//		for(int k= 1 ; k < arr.length; k++){
//			temp += arr[k];
//			sum[k] = temp;
//		}
//		
//		return sum[j] - sum[i-1];
//	}
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] nums = new int[n];
		int j = 0;
		while(n>0){
			nums[j]= sc.nextInt();
			j++;
			n--;
		}
		double[] sum = new double[nums.length] ;
		int temp = 0;
		sum[0] = 0.0;
		for(int k= 1 ; k < nums.length; k++){
//			temp += nums[k];
			sum[k] = nums[k] + sum[k-1];
		}
		int loop = sc.nextInt();
	
		while(loop > 0){
			System.out.println("loop:"+loop);
			
			int k = sc.nextInt();
			int l = sc.nextInt();
			System.out.println(k+":"+ l);
			
			if(k==0) System.out.println(sum[l]);
			
			else {
				double res =  sum[l] - sum[k-1]; 
				System.out.println(res);
			}
			loop--;
		}
		
	}
	
}
