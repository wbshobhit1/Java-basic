package algorithm.recursion.backtracking;

public class KnightMoves {

static int n=8;
	
	public static void main(String[] args) {
		int board[][]=new int[8][8];
		for(int i=0;i<n;i++)
			for(int j=0;j<n;j++)
				board[i][j]=0;
		
		board[0][0]=0;
	boolean ans =Knightmoves(board,1,0,0);
			
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
	
	
	static boolean isSafe(int board[][],int r,int c) {
		return r>=0 && r<n && c>=0 && c<n && board[r][c]==0;
	}
	
	static boolean Knightmoves(int board[][],int move,int currow,int curcol) {
		if(move==n*n) {
			return true;
		}
		
		int rowdirr[]=  {2, 1, -1, -2, -2, -1, 1, 2}; 
		int coldirr[]=  {1, 2, 2, 1, -1, -2, -2, -1};
		
		for(int curdir=0;curdir<8;curdir++) {
			int nextrow=currow+rowdirr[curdir];
			int nextcol=curcol+coldirr[curdir];
			
			if(isSafe(board,nextrow,nextcol)==true) {
				board[nextrow][nextcol]=move;
			boolean isSuccess=Knightmoves(board,move+1,nextrow,nextcol);
			if(isSuccess) 
				return true;
			
			board[nextrow][nextcol]=0;
			}
		}
		
		return false;
	}


}