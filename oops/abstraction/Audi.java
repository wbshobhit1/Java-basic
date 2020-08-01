package oops.abstraction;

public class Audi  extends Car{

	@Override
	public void breaking() {
		System.out.println("Audi is breaking");
		
	}

	@Override
	public void accelarate() {
		
		System.out.println("Audi is accelerating");
	}

}
