package string;

import java.util.Scanner;

public class BeautifulString {
	

public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
	
		
		System.out.println("enter string");
		String b=sc.nextLine();
		int n=b.length();
		int a=n;
		 int count=0;
		
	        while(a%3==1){
	        
	            for(int i=0;i<n-1;i+=3){
	                if(b.charAt(i+1)==1 && (b.charAt(i)+b.charAt(i+1)+b.charAt(i+2)==1))
	                    count+=1;
	            }
	            for(int i=n-1;i>0;i-=3){
	                if(b.charAt(i-1)==1 && (b.charAt(i)+b.charAt(i-1)+b.charAt(i-2)==1))
	                    count+=1;
	            }
	            a=a-1;
	        }
int w=n;
	         while(w%3==2){
	            
	            for(int i=0;i<n-2;i+=3){
	                if(b.charAt(i+1)==1 && (b.charAt(i)+b.charAt(i+1)+b.charAt(i+2)==1))
	                    count+=1;
	            }
	            for(int i=n-1;i>1;i-=3){
	                if(b.charAt(i-1)==1 && (b.charAt(i)+b.charAt(i-1)+b.charAt(i-2)==1))
	                    count+=1;
	            }
	            w=w-1;
	         }
	    
int z=n;
	             while(z%3==0){
	            
	            for(int i=0;i<n;i+=3){
	                if(b.charAt(i+1)==1 && (b.charAt(i)+b.charAt(i+1)+b.charAt(i+2)==1))
	                    count+=1;
	            }
	            z=z-1;
	          
		}
	      if(count>0) {
	    	  System.out.println(count);
	      }
	      else {
	    	  System.out.println("0");
	      }
		}
		
}
