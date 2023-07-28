package LogicalPrograms;

import java.util.Scanner;

public class DiseriumNumber {

	public static boolean isDiserium(int n) {
		int count =0;
		int temp=n;
		int sum=0;
		int temp2=temp;
		while(n>0) {
			n=n/10;
			count++;
		}
		
		while(temp>0) {
			int lastdigit=temp%10;
			int pro=1;
			
			for(int i=1; i<=count; i++) {
				pro=pro*lastdigit;
			}
			
			count--;
			sum=sum+pro;
			
			temp=temp/10;
			
		}
		if(temp2==sum) {
			return true;
		}else {
			return false;
		}
		
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in); 
		System.out.println("Enter the number");
		int n=sc.nextInt();
		
		System.out.println(isDiserium(n));
	
		
		
	
	}
}
