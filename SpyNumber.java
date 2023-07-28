package LogicalPrograms;

import java.util.Scanner;

public class SpyNumber {
	
	public static boolean isSpyNumber(int n) {
		int sum=0; 
		int pro=1;
		
		while(n>0) {
			int lastdigit=n%10;
			sum=lastdigit +sum;
			pro=lastdigit*pro;
			n=n/10;
		}
		if(sum==pro) {
			return true;
			
		}else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to check SPY or not ");
		int n=sc.nextInt();
//		//isSpine(n);
//		boolean res=isSpy(n);
	    System.out.println(isSpyNumber(n));
		
	}

}
