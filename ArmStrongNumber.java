package LogicalPrograms;

import java.util.Scanner;

public class ArmStrongNumber {
	public static boolean isArmstrong(int n) {
		int sum=0; int temp=n;
		while(n>0) {
			int lastdigit= n%10;
			
			sum=sum+lastdigit*lastdigit*lastdigit;
			n=n/10;
		}if(sum==temp) {
			return true;
		}else {
			return false;
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to check ARMSTRONG or not ");
		int n=sc.nextInt();
		boolean res=isArmstrong(n);
		System.out.println(res);
		
	}

}
