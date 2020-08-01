package loops;
import java.util.Scanner;
public class Fact {

	public static void main(String[] args) {
	
		Scanner sc =new Scanner(System.in);
		int no,result=1;
		
		System.out.println("Enter the number u want");
		no=sc.nextInt();
		
		for(int i=no ; i>1 ; i-=2) {
		result= result*(i*(i-1));
			}
//		for(int i=no ; i>=1 ; i--) {
//			result= result*i;
//		}
		System.out.println(result);
	}

}
