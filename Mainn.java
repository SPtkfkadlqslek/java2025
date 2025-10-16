package sec03.exam01;

public class Mainn {
	
	public static void main (String[] args) {
		Carr car;
		Truck truck = new Truck(80, 200);
		

		truck.ShowSpeed();
		car = truck;
		car.ShowSpeed();
		
		System.out.println(" Car speed is " + car.speed);
		System.out.println(" Truck speed is " + truck.speed);
	}
}