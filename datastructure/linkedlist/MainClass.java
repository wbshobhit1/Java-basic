package datastructure.linkedlist;

public class MainClass {

	public static void main(String[] args) {
		
		Implimentation<String> imp=new Implimentation<>();
		for(int i=1;i<=10;i++) {
			imp.add(i+"added ");
		}
	  
	   imp.print();

	}

}
