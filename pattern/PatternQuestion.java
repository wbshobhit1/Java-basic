package pattern;

import java.util.Scanner;

public class PatternQuestion {
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in)	;
	
		System.out.println("Enter the number");
		int n=sc.nextInt();
/// QUESTION 2:::::
 // __________
//		for(int j=1;j<=n;j++) {
//			
//			for(int i=1;i<=j-1;i++) {
//				System.out.print("    ");
//			}
//			for(int i=1;i<=n-j+1;i++) {
//				System.out.print("* ");
//			}
//		System.out.println("");	
//		}	
		
/// QUESTION 3:::::
		
//		for(int j=1;j<=n;j++) {
//		
//		for(int i=1;i<=n-j;i++) {
//			System.out.print("  ");
//		}
//		for(int i=1;i<=j;i++) {
//			System.out.print("*   ");
//		}
//		System.out.println(" ");
//		}

/// QUESTION 4:::::		
		
//	    for(int j=1;j<=n;j++) {
//			
//			for(int i=1;i<=n-j;i++) {
//				System.out.print("  ");
//			}
//			for(int i=1;i<=j;i++) {
//			
//				System.out.print("* ");
//			}
//		System.out.println(" ");
//		}
//
//		for(int j=1;j<=n;j++) {
//			
//			for(int i=1;i<=j;i++) {
//				System.out.print("  ");
//			}
//			for(int i=1;i<=n-j;i++) {
//				System.out.print("* ");
//			}
//		System.out.println(" ");	
//		}	
		
/// QUESTION 5:::::			
		int column=(n*2)+2;
		
	     for(int j=n;j>=0;j--) {
			
			for(int i=1;i<=column;i++) {
				if(i>j && i<=column-j) {
					System.out.print("  ");	
				}
				else {
					System.out.print("* ");
				}
				}
			System.out.println(" ");
	     }
	     System.out.println(" "); 
		 	
	     for(int j=1;j<=n;j++) {
				
				for(int i=1;i<=column;i++) {
					if(i>j && i<=column-j) {
						System.out.print("  ");	
					}
					else {
						System.out.print("* ");
					}
					}
				System.out.println(" ");
		     }
		    
	
	     }
	
}
