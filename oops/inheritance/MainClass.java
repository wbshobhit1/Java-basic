package oops.inheritance;

public class MainClass {

	public static void main(String[] args) {
		
		//USING SUPER KEYWORD TO OVERLOAD PARENT CONSTRUCTOR IN ITS OWN
		
		Teacher t=new Teacher("Mr.Kumar");
		t.eat();
		t.walk();
		t.teach();
		Singer s=new Singer("Rafi");
		
		s.sing();
		s.walk();
		s.eat();
		
//		t.name="mr kumar";
//		t.eat();
//		t.walk();
//		t.teach();
//		Singer s=new Singer();
//		s.name="rafi";
//		s.sing();
//		s.walk();
//		s.eat();
		
		//CASTING
//		Person p=t;//UPCASTING
		
//		Singer s=new Singer();
//		Person p=t;
//		Teacher t1=(Teacher)p;//DOWNCASTING
//		
//		System.out.println(t instanceof Teacher);
//		System.out.println(t instanceof Person);
//		System.out.println(s instanceof Singer);
//		System.out.println(t1 instanceof Teacher);
//		System.out.println(t1 instanceof Person);
//		System.out.println(p instanceof Teacher);
//		System.out.println(p instanceof Singer);
		
		
	}

}
