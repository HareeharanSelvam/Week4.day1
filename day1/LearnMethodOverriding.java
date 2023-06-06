package week3.day1;
//super class
class Vehicle {
	public void drive() {
		System.out.println("Im driving a Vehicle");
	}
}
//subclass 
class Car extends Vehicle {
	public void drive() {
		System.out.println("Im driving a car");
	}
}
//subclass 
class Bus extends Vehicle {
	public void drive() {
		System.out.println("Im driving a bus");
	}
}


public class LearnMethodOverriding {

	public static void main(String[] args) {
		Vehicle veh1 = new Vehicle();
		Vehicle veh2 = new Car();
		Vehicle veh3 = new Bus();
		
		veh1.drive();
		veh2.drive();
		veh3.drive();
	}

}
/*Method overriding means that the method already define in super class
 *  but i using in subclass by own implementation(Overiding the method)
 is called method overriding
 */