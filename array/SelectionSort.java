package array;

public class SelectionSort {

	public static void main(String[] args) {
		int a[]= {-3,4,9,7,-8,1,0};
		
		int n=a.length;
		
		for(int j=0;j<n-1;j++) {
			int minindex=j;
			for(int i=j;i<n;i++) {
				
				if(a[i]<a[minindex]) {
				
					minindex=i;
			   }
			}
			int temp = a[j];
			a[j] = a[minindex];
			a[minindex] = temp;
	   }
		  System.out.println("Sorted Array is");
			for(int Item: a) {
				System.out.print(Item+"  ");
			}	

   }
	
}	
	
