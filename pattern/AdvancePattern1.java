package pattern;

import java.util.Scanner;

public class AdvancePattern1 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in)	;
		
		System.out.println("Enter the number");
		int n=sc.nextInt();
		
		int row= (2 * n)-1;
		 
		for(int j=1;j<=n;j++) {
			
			for(int i=1;i<=j;i++) {
				System.out.print("* ");
			}
			System.out.println(" ");
		}
		
		for(int j=1;j<=n;j++) {
			
			for(int i=1;i<=n-j;i++) {
				System.out.print("* ");
			}
		System.out.println(" ");	
		}
//	
		/// 2ND METHOD
		
//		for(int j=1;j<=row;j++) {
//			
//			if(j<=n) {
//				
//				for(int i=1;i<=j;i++) {
//				
//					System.out.print("* ");
//				}
//			}
//			else {
//				
//				for(int i=1;i<=row-j+1;i++) {
//					
//					System.out.print("* ");
//				}
//			}
//			System.out.println(" ");	
//		}

	}

}
