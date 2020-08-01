package operator;
import java.util.Scanner;
public class Normal {

	public static void main(String[] args) {
	
		int a,b;
		Scanner sc= new Scanner(System.in);

		System.out.println("enter the values of a and b");
		a=sc.nextInt();
		b=sc.nextInt();
		
//		int c=(a+b)*(a+b);
		double c= (double)b / (double)a;
		System.out.println("final answer is"+c);
	}

}
