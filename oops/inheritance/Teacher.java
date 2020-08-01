package oops.inheritance;

public class Teacher extends Person{
	
	public Teacher(String name) {
		super(name);
		System.out.println("Inside teacher constructor");
	}

	public void teach() {
		System.out.println("teacher "+name+" is teaching");
	}
	
	//OVERWRIDING PERSON(PARENT)CLASS
	public void walk() {
		System.out.println("teacher "+name+" is walking");
	}
	public void eat() {
		System.out.println("teacher "+name+" is eating");
	}

	}


