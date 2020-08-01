package array;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int a[]= new int[n];
		
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
			}
		int l=n-1;
		int temp;
		for(int j=0;j<l;j++) {
			temp=a[j];
			a[j]=a[l];
			a[l]=temp;
			l--;
		}

		for(int Item: a) {
			System.out.print(Item+"  ");
		}
	}

}
