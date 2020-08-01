package oops.abstraction;

public class MainClass {

	public static void repairCar(Car car,String name) {
		System.out.println(name+" Car is repaired");
	}
	public static void main(String[] args) {
		
		Waganor car1=new Waganor();
		Audi car2=new Audi();
		repairCar(car1,"Waganor");
		repairCar(car2,"Audi");


	}

}
