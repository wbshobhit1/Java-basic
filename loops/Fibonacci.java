package loops;
import java.util.Scanner;
public class Fibonacci {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number to find fibonacci series");
		int n= sc.nextInt();
		
		int a=0;
		int b=1;
		System.out.print(a+ " ");
		System.out.print(b+ " ");
		
		for(int i=1;i<=n-2;i++) {
			int c= a+b;
			a=b;
			b=c;
			System.out.print(c+ " ");
		}
		
	}

}
