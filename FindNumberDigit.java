package LogicalPrograms;

import java.util.Scanner;

public class FindNumberDigit {

	public static int findDigit(int digit) {
		int count=0;
		
		for(;digit>0;digit=digit/10) {
			count++;
			
		}
		return count;
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the find no. of digit present inn a given number");	
		int digit = sc.nextInt();		
		System.out.println(findDigit(digit));

	}

}
