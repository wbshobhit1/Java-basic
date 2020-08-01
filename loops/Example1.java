package loops;
import java.util.Scanner;
public class Example1 {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		int sum=0,n;
		int count=0;
		
		n=sc.nextInt();
//		for(int i=0;i<=100;i+=2) {
//
//			System.out.println(i );
//			count++;
//		}
				
		for(int i=1;i<=n;i++) {
			sum=sum+i;
			count++;
		}
		
	System.out.println("sum is="+sum);	
	if(count==n) {
		System.out.println("LHS=RHS");	
	}
	else {
		System.out.println("LHS IS NOT EQUAL TO RHS");
	}
	
	}
	
}
