package loops;

import java.util.Scanner;

public class WhileLoop {

	public static void main(String[] args) {

			Scanner sc= new Scanner(System.in)	;
			
			System.out.println("Enter the number");
			int n=sc.nextInt();
//			int temp=n;
//			int sum=0;
//			
//			while(temp>0) {
//				
//				int LastDigit= temp % 10;
//				temp= temp / 10;
//				sum= sum + LastDigit;
//				
//				System.out.println(+LastDigit+" "+temp+" "+sum);
//			}
//			
//		System.out.println("The sum is----->"+sum);	
			
			///PALINDROME NUMBER
			
			int temp=n;
			int rev=0;
			
			while(temp>0) {
				
				int LastDigit= temp % 10;
				temp= temp / 10;
				rev=(rev * 10) + LastDigit;
				
				System.out.println(+LastDigit+" "+temp+" "+rev);
			}
			if(rev==n) {
				System.out.println("This is Palindrome Number");
			}
			else {
				System.out.println("This is  not a Palindrome Number");
			}
			
		System.out.println("The reverse number is----->"+rev);	
			
			////ANGSTRONG NUMBER
			
//			int temp=n;
//			int sum=0;
//			
//			while(temp>0) {
//				
//				int LastDigit= temp % 10;
//				temp= temp / 10;
//				sum=sum + (LastDigit*LastDigit*LastDigit);
//				
//				System.out.println(+LastDigit+" "+temp+" "+sum);
//			}
//			if(sum==n) {
//				System.out.println("This is an Armstrong number");
//			}
//			else {
//				System.out.println("This is  not an Armstrong number");
//			}
//			
//		System.out.println("The total sum of number is----->"+sum);	
	}

}
