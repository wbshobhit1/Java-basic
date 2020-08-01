package array;

import java.util.Scanner;

public class LeftRotate {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int d=sc.nextInt();
		int arr[]= new int[n];
		int rotatearr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
			}
		for(int i=0;i<n;i++) {
			int j=(i+n-d)%n;
			rotatearr[j]=arr[i];	
			}
		
			
		
		for(int Item:rotatearr) {
			System.out.print(Item+" ");
		}
		

	}

}
