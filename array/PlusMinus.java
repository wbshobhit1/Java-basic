package array;

import java.text.DecimalFormat;
import java.util.Scanner;

public class PlusMinus {

	public static void main(String[] args) {
		  DecimalFormat df = new DecimalFormat("#.######");
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int a[]= new int[n];
		
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
			}
		
	    int p=0,m=0,z=0;
        for(int i=0;i<n;i++){
            if(a[i]>0){
                p+=1;
                }
            else if(a[i]<0){
                m++;
           }
             else{
                z++;
         }
        }
        
       float f=(float)p/n;
       float f2=(float)m/n;
       float f3=(float)z/n;
       System.out.println(df.format(f));
       System.out.println(df.format(f2));
       System.out.println(df.format(f3));
//        System.out.format("%.6f", f);
//        System.out.println("");
//        System.out.format("%.6f", f2);
//        System.out.println("");
//        System.out.format("%.6f", f3);
          }


	}


