package algorithm.recursion.backtracking;

import java.util.Scanner;

public class NQueenProblem {

	static Scanner sc=new Scanner(System.in);
	static int n=sc.nextInt();

	public static void main(String[] args) {
		
		int board[][]=new int[n][n];
		for(int i=0;i<n;i++)
			for(int j=0;j<n;j++)
				board[i][j]=0;
		
		
	boolean ans =Nqueensol(board,0);
			
	if(ans) {
		printsol(board);
		}
		else {
			System.out.println("not possible");
		}
}
		

	
	static void printsol(int board[][]) {
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(board[i][j]+" ");
				
				}
			System.out.println(" ");
			}
	}

	static boolean isSafe(int board[][],int r, int c) {
		
		for(int i=0;i<r;i++) {
			if(board[i][c]==1)
				return false;
		}
		for(int i=r, j=c; i>=0 && j<n;i--,j++) {
			if(board[i][j]==1)
				return false;
			}
		for(int i=r, j=c; i>=0 && j>=0;i--,j--) {
			if(board[i][j]==1)
				return false;
			}
		return true;
	}
	
	static boolean Nqueensol(int board[][], int r) {
		
		if(r==n) {
			return true;
		}
		for(int j=0;j<n;j++) {
			if(isSafe(board,r,j)) {
				board[r][j]=1;
				boolean isSuccess=Nqueensol(board,r+1);
				if(isSuccess) {
					return true;
				}
				board[r][j]=0;
			}
		}
		return false;
	}
	
}
