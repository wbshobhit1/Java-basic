package datastructure.arraydeque;

import java.util.*;

public class InterviewQuestion {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		Solution solution=new Solution();
		 int size=sc.nextInt();
			int a[]=new int[size];
			for(int i=0;i<size;i++) {
				a[i]=sc.nextInt();
				}
		int ans[]=solution.maxSlidingWindow(a,3);

		for(int x:ans) {
			System.out.print(x+" ");
		}
	}
	
	static class Solution{
		public   int[] maxSlidingWindow(int[] a,int k) {
			int n=a.length;
			if(n==0 || n==1) {
				return a;
			}
			Deque<Integer> dq=new LinkedList<>();
			int[] ans=new int[n-k+1];
			int i=0;
			for(;i<k;i++) {
				while(!dq.isEmpty() && a[dq.peekLast()]<=a[i]) {
					dq.removeLast();
					
				}
				dq.addLast(i);
			}
			
			for(;i<n;i++) {
				
				ans[i-k]=a[dq.peekFirst()];
				while(!dq.isEmpty() && dq.peekFirst()<=i-k) {
					dq.removeFirst();
				}
				while(!dq.isEmpty() && a[dq.peekLast()]<=a[i]) {
					dq.removeLast();
					
				}
				dq.addLast(i);
			}
				
			ans[i-k]=a[dq.peekFirst()];
			
		return ans;
		}
	}

}
