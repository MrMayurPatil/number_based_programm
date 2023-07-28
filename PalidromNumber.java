package LogicalPrograms;

import java.util.Scanner;

public class PalidromNumber {
	public static boolean isPalidrom(int n) {
		int temp=n;
		int rev=0;
		while(n>0) {
			int lastdigit=n%10;
			rev=rev*10+lastdigit;
			n=n/10;
		}
		
		if(temp==rev) {
			return true;
		}else {
			return false;
		}
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in)
		;System.out.println("Enter the  number");
    	int n=sc.nextInt();
    	System.out.println(isPalidrom(n));
	}
}
