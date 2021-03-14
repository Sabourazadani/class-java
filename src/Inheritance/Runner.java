package Inheritance;

public class Runner {
	public static void main(String[] args) {
		X6 niceCar = new X6();
		X7 evenNicerCar = new X7();

		evenNicerCar.setBMWVersion("three");
		niceCar.setX6Color("Black");
		niceCar.setBMWVersion("two");

		System.out.println(niceCar.getX6Color());
		System.out.println(niceCar.getBMWVersion());
		System.out.println(evenNicerCar.getBMWVersion());
	}
}