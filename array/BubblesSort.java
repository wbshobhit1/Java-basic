package array;

public class BubblesSort {

	public static void main(String[] args) {
		
		int a[]= {-3,-8,9,7,-8,1,0};
		int n=a.length;
		boolean sorted=true;
		
		for(int j=0;j<n-1;j++) {
			
			for(int i=0;i<n-1-j;i++) {
				
				if(a[i+1]<a[i]) {
					
				int temp = a[i+1];
				a[i+1] = a[i];
				a[i] = temp;
				
				sorted= false;
			    }
		   }
			if(sorted) break;
      }
    System.out.println("Sorted Array is");
		for(int Item: a) {
			System.out.print(Item+"  ");
		}
	
	}


}
