package oops;

import java.util.Scanner;

public class ReverseString {
	
	 static String reverseWord(String str) {
		
		String ans=" ";
		
		int i=str.length()-1;
		
		while(i>=0) {
			while(i>=0 && str.charAt(i) ==' ')i--;
			
			int j=i;
			
			if(i>0) break;
			
			while(i>=0 && str.charAt(i)!=' ')i--;
			
			if(ans.length()==0) {
			ans=ans.concat(str.substring(i+1, j+1));
		}
			else {
			ans=ans.concat(" "+str.substring(i+1, j+1));
			}
	}
		return ans;
}




	public static void main(String[] args) {
		String result;
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.nextLine();
		for(int i=0;i<n;i++) {
			String s=sc.nextLine();
			result=reverseWord(s);

			 System.out.println(result);	
			}
		
sc.close();
	}

}
