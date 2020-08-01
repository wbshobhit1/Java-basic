package datastructure;

import java.util.*;

public class Timediffernce {

	public static void main(String[] args) {

		List<Integer> ll=new LinkedList<>();
		List<Integer> al=new ArrayList<>();
		getdiff(ll);
		getdiff(al);
	}
	
	static public void getdiff(List<Integer> list) {
		
		long start=System.currentTimeMillis();
		for(int i=0;i<1000000;i++) {
			list.add(i);
			
			}
		list.remove(0);
		
		long end=System.currentTimeMillis();
	
		System.out.println(list.getClass().getName()+"------>"+(end-start));
	}

}
