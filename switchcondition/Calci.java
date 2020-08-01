package switchcondition;
import java.util.Scanner;
public class Calci {

	public static void main(String[] args) {
		
		int a,b;
		char operation;
		Scanner sc= new Scanner(System.in);

		System.out.println("Enter the inputs\n");
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println("Enter the operation want to execute\n");
		sc.nextLine();
		operation=sc.nextLine().charAt(0);

		int result=0;
		
		switch(operation)
		{
		case '+':
			result=a+b;
			break;
			
		case '-':
			result=a-b;
			break;	
		
		case '*':
			result=a*b;
			break;
			
		case '/':
			if(b!=0) {
			result=a/b;	
			}
			else {
				System.out.println("Not Valid\n");
			}
			break;
			
		case '%':
			if(b!=0) {
			result=a%b;	
			}
			else {
				System.out.println("Not Valid\n");
			}
			break;
			
		default:
			System.out.println("Invalid choice of operator");
		}
		
		System.out.println("The result is :\n"+result);
	}

}
