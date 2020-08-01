package algorithm.recursion.backtracking;

public class ShortestMazePath {

	public static void main(String[] args) {

		int a[][]={
			{1, 0, 1, 1, 1, 1, 0, 1, 1, 1 },
            {1, 0, 1, 0, 1, 1, 1, 0, 1, 1 },
            {1, 1, 1, 0, 1, 1, 0, 1, 0, 1 },
            {0, 0, 0, 0, 1, 0, 0, 0, 0, 1 },
            {1, 1, 1, 0, 1, 1, 1, 0, 1, 0 },
            {1, 0, 1, 1, 1, 1, 0, 1, 0, 0 },
            {1, 0, 0, 0, 0, 0, 0, 0, 0, 1 },
            {1, 0, 1, 1, 1, 1, 0, 1, 1, 1 },
            {1, 1, 0, 0, 0, 0, 1, 0, 0, 1 }
            };
		
		int res=shotestpathlength(a,0,0,3,4);
		System.out.println(res);

	}
	static int shotestpathlength(int a[][],int s1,int s2,int e1,int e2) {
		int row=a.length;
		int cols=a[0].length;
		boolean visited[][]=new boolean[row][cols];
		
		return shotestpathlength(a,s1,s2,e1,e2,visited);
	}
	
	static boolean helper(int a[][],int s,int e,boolean visited[][]) {
		int row=a.length;
		int cols=a[0].length;
		
		return s>=0 && e>=0 && s<=row && e<=cols && a[s][e]==1 && !visited[s][e];
	}
	
	static int shotestpathlength(int a[][],int s1,int s2,int e1,int e2,boolean visited[][]) {
		
		
		if(!helper(a,s1,s2 ,visited)) return  100000;
		if(s1==e1 && s2==e2) return 0;
		
		visited[s1][s2]=true;
		
		int left=shotestpathlength(a,s1,s2-1,e1,e2,visited)+1;
		int bottom=shotestpathlength(a,s1+1,s2,e1,e2,visited)+1;
		int  right=shotestpathlength(a,s1,s2+1,e1,e2,visited)+1;
		int up=shotestpathlength(a,s1-1,s2,e1,e2,visited)+1;
		
		visited[s1][s2]=false;
		return Math.min(Math.min(left,bottom),Math.min(right, up));
		
	}

}
