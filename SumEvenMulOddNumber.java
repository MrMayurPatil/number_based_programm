package LogicalPrograms;

import java.util.Scanner;

public class SumEvenMulOddNumber {

	public static  void sumEvenMulOdd(int n) {
		int sum=0;
		int pro=1;
		for(int i=1;i<=n;i++) {
			if(i%2==0) {
				sum=sum+i;
				
			}
			else
			{
				
				pro=pro*i;
				
			}
		
		}
		System.out.println("the sum of even number is "+ sum);
		System.out.println("the product of given number is " +pro);
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		sumEvenMulOdd(n);

	}

}
