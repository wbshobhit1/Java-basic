package string;

import java.util.Scanner;

public class Sparse {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter n");
		int n=sc.nextInt();
		sc.nextLine();
		String string[]=new String[n];
		for(int i=0;i<n;i++) {
			string[i]=sc.nextLine();
			}
		System.out.println("enter q");
		int q=sc.nextInt();
		sc.nextLine();
		String stringq[]=new String[q];
		for(int i=0;i<q;i++) {
			stringq[i]=sc.nextLine();
			}
		int res[]= new int[q];
	for(int j=0;j<q;j++) {
			int count=0;
			for(int i=0;i<n;i++) {
				
				if(stringq[j].equals(string[i])){
					count++;
				}
			}
		res[j]=count;
	}
	for(int Item:res) {
		System.out.println(Item+" ");
	}
				
		
	}

}

