package pattern;

import java.util.Scanner;

public class Table {

	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in)	;
		
	
	for(int j=1;j<=10;j++) {
			int tableof=j;
			for(int i=1;i<=20;i++) {
			System.out.print(tableof*i+ "  ");
		}
		tableof= tableof * j;
		System.out.println("  ");
	}

 }



}
