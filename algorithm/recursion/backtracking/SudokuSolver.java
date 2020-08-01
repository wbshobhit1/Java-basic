package algorithm.recursion.backtracking;

public class SudokuSolver {
	

	public static void main(String[] args) {
		 int[][] grid = new int[][] { 
	            { 3, 0, 6, 5, 0, 8, 4, 0, 0 }, 
	            { 5, 2, 0, 0, 0, 0, 0, 0, 0 }, 
	            { 0, 8, 7, 0, 0, 0, 0, 3, 1 }, 
	            { 0, 0, 3, 0, 1, 0, 0, 8, 0 }, 
	            { 9, 0, 0, 8, 6, 3, 0, 0, 5 }, 
	            { 0, 5, 0, 0, 9, 0, 6, 0, 0 }, 
	            { 1, 3, 0, 0, 0, 0, 2, 5, 0 }, 
	            { 0, 0, 0, 0, 0, 0, 0, 7, 4 }, 
	            { 0, 0, 5, 2, 0, 6, 3, 0, 0 } 
	        }; 
	        int n=grid.length;
	        
	        boolean ans=solveSudoku(grid,0,0,n);
	        if(ans) {
	        	printsol(grid,n);
	        }else {
	        	System.out.println("bro ,do it youself");
	        }
	}
	
	static void printsol(int grid[][],int n) {
	
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(grid[i][j]+" ");
				
				}
			System.out.println(" ");
			}
	}
	static boolean isSafe(int grid[][],int row,int col,int curnum,int n) {
		
		if(grid[row][col]!=0)
			return false;
		
		for(int i=0;i<n;i++) {
			if(grid[row][i]==curnum)
				return false;
			if(grid[i][col]==curnum)
				return false;
			
		}
		int root=(int)Math.sqrt(n);
		int boxstartrow=row-(row % root);
		int boxstartcol=col-(col % root);
		for(int i=boxstartrow;i<boxstartrow+root;i++) {
			for(int j=boxstartcol;j<boxstartcol+root;j++) {
				if(grid[i][j]==curnum)
					return false;
			}
		}
		
		return true;
	}

	static boolean solveSudoku(int grid[][],int row,int col,int n) {
		
		if(row==n) {
			return true;
		}
		if(col==n) {
			return solveSudoku(grid,row+1,0,n);
		}
		if(grid[row][col]!=0) {
			return solveSudoku(grid,row,col+1,n);
		}
		
		for(int curnum=1;curnum<=n;curnum++) {
			if(isSafe(grid,row,col,curnum,n)){
				grid[row][col]=curnum;
				
				boolean isSuccess=solveSudoku(grid,row,col+1,n);
			     if(isSuccess) {
					return true;
				}
			     grid[row][col]=0;
			}
		}
		return false;
	}

}
