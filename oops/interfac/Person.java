package oops.interfac;

public class Person implements Student,Youtuber {

	public static void main(String[] args) {
		Person obj=new Person();
		obj.makevideo();
		obj.study();
		
		Youtuber obj1=obj;
		obj1.makevideo();
		obj1.uploadvideo();

	}

	@Override
	public void makevideo() {
		System.out.println("person is making video");
		
	}

	@Override
	public void study() {
		System.out.println("person is studing");
		
	}
	
	public void uploadvideo() {
		System.out.println("upload video");
	}

}
