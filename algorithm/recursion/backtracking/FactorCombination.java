package algorithm.recursion.backtracking;

import java.util.*;

public class FactorCombination {
	
	public static void main(String[] args) {
		System.out.println("Enter number");
		Scanner sc=new Scanner(System.in);
		int n =sc.nextInt(); 
        List<List<Integer> > resultant = factcom(n); 
 
        for (List<Integer> i : resultant) { 
            for (int j : i)  
                System.out.print(j + " ");             
            System.out.println(); 
        } 

	}
	
	public static List<List<Integer>> factcom(int n){
		
		List<List<Integer>>result_list=new ArrayList<List<Integer>>();
		List<Integer> single_list=new ArrayList<>();
		
		factorialCombination(2,1,n,result_list,single_list);
		return result_list;
	}
	
	static void factorialCombination(int first,int curr_pro,int n,
			List<List<Integer>>result_list,List<Integer> single_list) {
		
		if(first>n || curr_pro>n) {
			
			return;
		}
		
		if(curr_pro==n) {
			ArrayList<Integer> t=new ArrayList<>(single_list);
			result_list.add(t);
		}
		
		for(int i=first;i<n;i++) {
			if(i*curr_pro>n)
				break;
			
			if(n%i==0) {
				single_list.add(i);
			
			//recursion
			
			factorialCombination(i,i*curr_pro,n,result_list,single_list);
			
			///backtracking in text step
			
			single_list.remove(single_list.size()-1);
			}
			
		}
		
	}

}
