package datastructure;


import java.util.*;

public class Free {

	public static void main(String[] args) {

		List<Integer> ll=new LinkedList<>();
		for(int i=0;i<100;i++) {
			ll.add(i);
		}
		ll.set(45, 0);
		System.out.println(ll);
		
	}

}
