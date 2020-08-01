package algorithm.recursion;

import java.util.*;

public class AdvanceReccursion {
	
	static Set<String> set=new HashSet<>();

	public static void main(String[] args) {
//		int a[][]={{1, 1, 1, 1, 1, 1, 1, 1}, 
//                  {1, 1, 1, 1, 1, 1, 0, 0}, 
//                  {1, 0, 0, 1, 1, 0, 1, 1}, 
//                  {1, 2, 2, 2, 2, 0, 1, 0}, 
//                  {1, 1, 1, 2, 2, 0, 1, 0}, 
//                  {1, 1, 1, 2, 2, 2, 2, 0}, 
//                {1, 1, 1, 1, 1, 2, 1, 1}, 
//                {1, 1, 1, 1, 1, 2, 2, 1}, 
//                };
//		System.out.println("before applying");
//		print (a);
//		System.out.println("after applying");
//		flodFill(a,4,4,3,2);
//		flodFill(a,0,1,2,1);
//		flodFill(a,2,1,4,0);
//		print(a);
		
		permutation("abc",0,2);
		System.out.println(set);
		
	}
	
//	1.FLODFILL PROBLEM:::::::->
//	
//	static void flodFill(int a[][],int r,int c,int toFill ,int prevFill) {
//		int row=a.length;
//		int cols=a[0].length;
//		if(r<0 || r>=row || c<0 || c>=cols) {
//			return;
//		}
//		if(a[r][c]!=prevFill) {
//			return;
//		}
//		a[r][c]=toFill;
//		
//		
//		flodFill(a,r-1,c,toFill,prevFill);
//		flodFill(a,r,c-1,toFill,prevFill);
//		flodFill(a,r+1,c,toFill,prevFill);
//		flodFill(a,r,c+1,toFill,prevFill);
//		
//	}
//	static void print(int a[][]) {
//		int row=a.length;
//		int cols=a[0].length;
//		for(int i=0;i<row;i++) {
//			for(int j=0;j<cols;j++) {
//				System.out.print(a[i][j]+" ");
//				
//			}
//			System.out.println(" ");
//			
//		}
//	}
	
//	2.PERMUTATION OF STRING PROBLEM:::::::->
	
	static void permutation(String s,int l,int r) {
		if(l==r) {
			if(set.contains(s)) return;
			set.add(s);
			System.out.println(s);
			return;
		}
		for(int i=l;i<=r;i++) {
			s=interchange(s,l,i);
			permutation(s,l+1,r);
			s=interchange(s,l,i);
		}
		 
	}
	static String interchange(String s,int a,int b) {
		char arr[]=s.toCharArray();
		char temp=arr[a];
		arr[a]=arr[b];
		arr[b]=temp;
		return String.valueOf(a);
	}

}
