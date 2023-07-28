package LogicalPrograms;

import java.util.Scanner;	



public class FindFactorial {

	public static void findFactorial(int factnum) {
		int pro=1;
		System.out.println("the factorials of given number is");
			for(int i=1;i<=factnum ;i++) {
				pro=pro*i;
			
		}
			System.out.println(pro);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to find factorial of given number");
		int factnum=sc.nextInt();	
		findFactorial(factnum);

	}

}
