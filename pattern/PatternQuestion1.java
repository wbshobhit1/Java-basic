package pattern;

import java.util.Scanner;

public class PatternQuestion1 {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in)	;
		
//		System.out.println("Enter the number");
//		int n=sc.nextInt();
//		
//		int column= (2 * n)-1;
//		int k=n;
//		for(int j=1;j<=column;j+=2) {
//			int numb=1;
//			for(int i=1;i<=k;i++) {
//				System.out.print("  ");
//				;
//			}
//			for(int i=1;i<=j;i++) {
//				System.out.print(numb +" ");
//				numb++;
//			}
//			k--;
//			
//			System.out.println(" ");
//		}
		
		///QUESTION 7
		
		System.out.println("Enter the number");
		int n=sc.nextInt();
		
	
		int k=n+1;
		for(int i=1;i<=k;i++) {
			System.out.print(" ");
			
		}
	System.out.println(" 1");
	int b=n;
		for(int j=2;j<=n;j++) {
			
			for(int i=1;i<=b;i++) {
				System.out.print(" ");
				}
			System.out.print(j+" ");
			int f=1;
		
				for(int i=1;i<=j-2;i++) {
				System.out.print("0 ");
			
			}
			   
			
			System.out.print("0 "+j+"");
			b--;
		
			System.out.println(" ");
		}
		
		
		///QUESTION 10
//		int k=n-1;
//			for(int i=1;i<=k;i++) {
//				System.out.print("  ");
//				
//			}
//		System.out.println("*");
//		
//		for(int j=2;j<=n-1;j++) {
//			
//			for(int i=1;i<=n-j;i++) {
//				System.out.print("  ");
//			}
//			System.out.print("*");
//			
//			for(int i=1;i<=j-2;i++) {
//				System.out.print("  ");
//			}
//			System.out.print(" *");
//			
//			System.out.println(" ");
//		}
//		
//		if(n>1) {
//			for(int i=1;i<=n;i++) {
//				System.out.print("* ");
//			}
//		}
		
		///QUESTION 11
		
//		for(int j=0;j<=n;j++) {
//			int number=1;
//			for(int i=1;i<=n-j;i++) {
//				System.out.print(" ");
//			}
//			for(int i =0;i<=j;i++) {
//				System.out.print(number + " ");
//				number=number*(j-i)/(i+1);
//			}
//			
//		System.out.println(" ");
//	}

}
}
