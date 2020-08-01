package userinput;
import java.util.Scanner;
public class SimpleIntrest {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int p,t;
	float r;
	System.out.println("enter the principal value");
	p=sc.nextInt();
	System.out.println("enter the rate value");
	r=sc.nextFloat();
	System.out.println("enter the time value");
	t=sc.nextInt();
	
    double si=  (p *  r *  t)/100;
    System.out.println("the simple intrest is"+si);

	}

}
