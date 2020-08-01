package oops.singalton;

public class Mainclass {

	public static void main(String[] args) {
		
		Appconfig obj1= Appconfig.getinstance();
		System.out.println(obj1);
	}

}
