package array;

import java.util.Scanner;

public class Multidimension2 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the dimensions of Matrix A");
		int row1=sc.nextInt();
		int colns1=sc.nextInt();
		int a[][]= new int[row1][colns1];
		
		System.out.println("Enter the data of Matrix A");
		for(int j=0;j<row1;j++) {
			for(int i=0;i<colns1;i++) {
				a[j][i]=sc.nextInt();
			}
		}
		System.out.println("Enter the dimensions of Matrix b");
		int row2=sc.nextInt();
		int colns2=sc.nextInt();
		int b[][]= new int[row2][colns2];
		System.out.println("Enter the data of Matrix B");
		
		for(int j=0;j<row2;j++) {
			for(int i=0;i<colns2;i++) {
				b[j][i]=sc.nextInt();
			}
		}
		if(row2==colns1) {
			int c[][]= new int[row1][colns2] ;
			
			System.out.println("The resultant Matrix C");
			for(int j=0;j<row1;j++) {
				for(int i=0;i<colns2;i++) {
					int sum=0;
					for(int k=0;k<colns1;k++) {
						
						 sum= sum + (a[j][k] * b[k][i]);
						}
					c[j][i]=sum;
					}
				}
			for(int j=0;j<row1;j++) {
				for(int i=0;i<colns2;i++) {
					System.out.print(c[j][i]+"  ");
				}
				System.out.println(" ");
			}
		}
		else {
			System.out.println(" ");
			System.out.println("Multiply can't be possible dude");
		}
	}

}
