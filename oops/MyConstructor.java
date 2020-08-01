package oops;
class Vehicle{
		int wheels;
		String color;
		int headlight;
		
		Vehicle(){
			
		}
		Vehicle(int wheels,String color){
			this.wheels=wheels;
			this.color=color;
			headlight=2;
		}
		Vehicle(int wheels){
			this.wheels=wheels;
			this.color="Red";
			headlight=2;
		}
	}
	
	public class MyConstructor {
	
	public static void main(String[] args) {

		Vehicle monscar=new Vehicle();
		monscar.wheels=7;
		monscar.color="Muddyvoilet";
		monscar.headlight=6;
		Vehicle car1=new Vehicle(4,"Green");
		Vehicle scooty=new Vehicle(2);
		Vehicle Autoriksaw=new Vehicle(3,"Yellow");
		
		System.out.println("the vehicle is car having "+car1.wheels+" wheels and color is "+car1.color+" having headlight "+car1.headlight);
		System.out.println("the vehicle is scooty having "+scooty.wheels+" wheels and color is "+scooty.color+" having headlight "+scooty.headlight);
		System.out.println("the vehicle is Autoriksaw having "+Autoriksaw.wheels+" wheels and color is "+Autoriksaw.color+" having headlight "+Autoriksaw.headlight);
		System.out.println(" ");
		System.out.println("the vehicle is Monstercar having "+monscar.wheels+" wheels and color is "+monscar.color+" having headlight "+monscar.headlight);
	}

}
