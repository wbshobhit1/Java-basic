package string;


import java.util.*;

public class Trail {

    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter query");
    int q=sc.nextInt();
    Stack<String> s=new Stack<>();
    while(q-- !=0){
    	System.out.println("Enter num");
        int num=sc.nextInt();
       
        
        if(num==1){
        	System.out.println("push ins stack");
        	String e=sc.nextLine();
            sc.nextLine();
            s.push(e);
            System.out.println(e);
            
        }
    
}
    
    }
}