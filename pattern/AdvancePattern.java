package pattern;

import java.util.Scanner;

public class AdvancePattern {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in)	;
		
		System.out.println("Enter the number");
		int n=sc.nextInt();
		
		int numb=1;
    
//		for(int j=1;j<=n;j++) {
//			
//			for(int i=1;i<=n-j;i++) {
//				System.out.print("  ");
//			}
//			for(int i=1;i<=j;i++) {
//				System.out.print("*   ");
//			}
//			System.out.println(" ");
		
		for(int j=1;j<=n;j++) {
			
			for(int i=1;i<=n-j;i++) {
				System.out.print("  ");
			}
			for(int i=1;i<=j;i++) {
				System.out.print(numb+"   " );
				numb++;
			}
			System.out.println(" ");
			
		}
	
	}


}