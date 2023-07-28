package LogicalPrograms;

import java.util.Scanner;

public class PrimeNumber {

	public static boolean isPrimeNumber(int num) {
		int count=0;
		for(int i=1;i <=num;i++) {
			
			if( num%i==0) {
				count++;
			}
			
		}
		if(count==2) {
			return true;
		}else {
			return false;
		}
		
		}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to check number is prime or not");
		int n=sc.nextInt();
		System.out.println(isPrimeNumber(n));

	}

}
