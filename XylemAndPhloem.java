package LogicalPrograms;

import java.util.Scanner;

public class XylemAndPhloem {

	public static String isXylemPholem(int n) {
		int sum1=0; int sum2=0;
		int count1=0; int count2=0;
		int temp=n;
		while(n>0) {
			int lastdigt=n%10;
			count1++;
			n=n/10;
		}
		
		while(temp>0) {
			int lastdigit=temp%10;
			count2++;
			if(count2==1 || count2==count1) {
				sum1=sum1+lastdigit;
			}else {
				sum2=sum2+lastdigit;
			}
			temp=temp/10;
		}
		if(sum1==sum2) {
			return "it is xyleam";
		}else {
			return "it is pholem";
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number one to check xyleam or floem number");
		int n=sc.nextInt();
		System.out.println(isXylemPholem(n));
	}

}
