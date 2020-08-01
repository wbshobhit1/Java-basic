package oops.inheritance;

public class Singer extends Person {

	public Singer(String name) {
		super(name);
		System.out.println("Inside singer constructor");
	}
	public void sing() {
		System.out.println("singer "+name+" is singing");
	}
	//OVERRIDING PERSON(PARENT)CLASS
	public void walk() {
		System.out.println("singer "+name+" is walking");
	}
	public void eat() {
		System.out.println("singer "+name+" is eating");
	}

	}


