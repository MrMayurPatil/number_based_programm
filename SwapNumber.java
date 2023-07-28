package LogicalPrograms;

import java.util.Scanner;


public class SwapNumber {
	public static void swapNumber(int num1,int num2) {
		int temp;
		temp=num1;
		num1=num2;
		num2=temp;
		
		System.out.println("num1  "+num1);
		System.out.println("num1  "+num2);
		
		}
	
		public static void swapNumberWithoutThirdVariable(int a, int b) {
			a=a+b;
			b=a-b;
			a=a-b;
			
			System.out.println("Number1 " +a);
			System.out.println("Number2 "+ b);
		}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number for swap");
		System.out.println("Enter number 1");
		int num1=sc.nextInt();
		System.out.println("Enter number 2");
		int num2=sc.nextInt();
		
		swapNumber(num1,num2);
		
		System.out.println("Enter the number for swap number  without using third veriable");
		System.out.println("Enter number 1");
		int a=sc.nextInt();
		System.out.println("Enter number 2");
		int b=sc.nextInt();
		
		swapNumberWithoutThirdVariable(a,b);
	}

}
