package LogicalPrograms;

import java.util.Scanner;

public class NeonNumber {
	public static boolean isNeon(int n) {
		int squre =n*n;
		int sum=0;
		
		while(squre!=0) {
			int lastdigit=squre%10;
			sum=sum+lastdigit;
			
			squre=squre/10;
		}if(sum==n) {
			return true;
		}else {
			return false;
		}
		
	}
		
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to check neon or not ");
		int n=sc.nextInt();
		System.out.println(isNeon(n));

	}

}
