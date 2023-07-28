package LogicalPrograms;

import java.util.Scanner;

public class RevrseNumber {

	public static int reverseNumber(int num) {
		int rev=0;
		while(num>0) {
			int lastdigit= num%10;
			rev= rev*10+lastdigit;
			num=num/10;
		}
		return rev;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number to reverse");
		int num=sc.nextInt();
		
		System.out.println(reverseNumber(num));

	}

}
