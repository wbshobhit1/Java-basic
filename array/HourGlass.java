package array;

import java.util.Scanner;

public class HourGlass {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		 int[][] arr = new int[6][6];
		 for (int i = 0; i < 4; i++) {
			 for(int j=0;j<4;j++) {
					arr[i][j]=sc.nextInt();
				}
			}
		 int max=Integer.MIN_VALUE;
		 int sum;
	        for(int i=0;i<2;i++){

	            for(int j=0;j<2;j++){
	                sum= arr[i][j]+arr[i][j+1]+arr[i][j+2]
	                              +arr[i+1][j+1]
	                    +arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2]  ;
	                    if(sum>max){
	                 max=sum;
	             }
	            
	            }
	            }
	        	System.out.println(max);

	}

}
