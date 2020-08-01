package loops;
import java.util.Scanner;
public class SeriesSum {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the LastNumber");
		int n=sc.nextInt();
		
		float sum=0;
		
		for(float i=1;i<=n;i++) {
			if(i % 2==1) {
				sum=sum+(1/i);
			}
			else {
				sum=sum-(1/i);
			}
		}
		System.out.println("The sum is---->"+sum);
     }
}


