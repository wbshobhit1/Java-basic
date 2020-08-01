package nesting;
import java.util.Scanner;
public class MaxNum {

	public static void main(String[] args) {
		
		int a,b,c,result;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the values of a b c :");
		
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		
//		if(a>b) {
//			
//			if(a>c) {
//				result=a;
//			}
//			else {
//				result=c;
//			}
//		}
//		else {
//			
//			if(b>c) {
//				result=b;
//			}
//			else {
//				result=c;
//			}
//		}
		
		//// TERNIARY FORM OF CONTIDION:WE WILL LOOK NESTING VIA TERNAIRY OPERATOR
		result=a>b ? a>c ? a : c : b>c ? b : c ;
		
		System.out.println("Maximum number is out of 3 is--->" +result);
	}

}
