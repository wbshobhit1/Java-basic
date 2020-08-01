package datastructure.stacks;

import java.util.*;

public class Any {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n= sc.nextInt();
	int a[]= new int[n];
	for(int i=0;i<n;i++) {
		a[i]=sc.nextInt();
	}
	Stack<Integer> s=new Stack<>();
	for(int x:a) {
	System.out.print(x);
	}

}
}