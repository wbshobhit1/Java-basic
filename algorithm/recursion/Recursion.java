package algorithm.recursion;

public class Recursion {

	public static void main(String[] args) {
		
//		System.out.println(sum(1000));
//		System.out.println(fastpow(3,15));
		System.out.println(grid(4,10));
	}
	
//	1.FIND SUM OF N NATURAL NUMBER:::::--->
	
	static int sum(int n) {
		if(n==1) {
			return 1;
		}
		else {
			return sum(n-1)+n;
		}
	}
	
//	2.FIND FAST POWER USING RECCURSION A^B :::::--->
	
	static  int fastpow(int a,int b) {
		if(b==0) {
			return 1;
		}
		else if(b%2==0) {
			return fastpow(a*a,b/2);
		}
		return a*fastpow(a,b-1);
	}
	
	
//3.FIND ALL THE PATH IN NxM GRID::::::::::--->	
	
	static 	int grid(int n,int m) {
		if(n==1 || m==1) {
			return 1;
		}
		else {
			return grid(n,m-1) + grid(m,n-1);
		}
	}

}
