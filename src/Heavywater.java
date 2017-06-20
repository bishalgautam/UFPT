import java.util.*;

public class Heavywater {
	
	public static void getPower(int n , int p){
		try{
			if( n < 0 || p < 0)
				throw new Exception("can't be negative");
			else
				System.out.println(Math.pow(n, p));
		}catch(Exception e){
				System.out.println(e);
		}
		
	}
	
	
	public static void main(String[] args){
		
		getPower(-1,2);
		getPower(3,5);
		
	}

}
