package datastructure.arraydeque;

public class MainClass {

	public static void main(String[] args) {
		
		ImplimentationDeque<Integer> deck=new ImplimentationDeque<>();
		
		deck.addfirst(3);
		deck.addfirst(2);
		deck.addfirst(1);
		deck.addlast(4);
		
		deck.print();

	}

}
