package pattern;

import java.util.Scanner;

public class Pattern1 {
	
	public static void main(String[] args) {
	
		Scanner sc= new Scanner(System.in)	;
	
		System.out.println("Enter the number");
		int n=sc.nextInt();
		
//		for(int j=1;j<=n;j++) {
//			
//			for(int i=1;i<=j;i++) {
		
		///PATTEREN 2ND
		
		for(int j=1;j<=n;j++) {
			
			for(int i=1;i<=j-1;i++) {
				System.out.print("  ");
			}
			for(int i=1;i<=n-j+1;i++) {
				System.out.print("* ");
			}
		System.out.println(" ");	
		}	
		
	}

}
