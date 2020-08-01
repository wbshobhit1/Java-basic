package loops;
import java.util.Scanner;
public class Power {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the two numbers");
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		int result=1;
		for(int i=0;i<b;i++) {
			result= result*a;
///			result*=a;
		}
	System.out.println("the result is=="+result);
	}

}
