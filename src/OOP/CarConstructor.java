package OOP;

public class CarConstructor {
	public CarConstructor() {
        System.out.println("this is default");
    }
    public CarConstructor(String model) {
        System.out.println(model);
    }
    public CarConstructor(String model, int numOfCars) {
        System.out.println("Model: " + model);
        System.out.println("Number of cars: " + numOfCars);
    }
    public CarConstructor(int numOfSedans, int numOfSUVs) {
        System.out.println("Number of sedans: " + numOfSedans);
        System.out.println("Number of SUVs: " + numOfSUVs);
    }
    public CarConstructor(int numOfDoors, double engineSize) {
        System.out.println("Number of doors: " + numOfDoors);
        System.out.println("Engine size: " + engineSize);
    }
    public static void main(String[] args) {
		CarConstructor car1 = new CarConstructor();
        CarConstructor car2 = new CarConstructor("Camry");
        CarConstructor car3 = new CarConstructor("Corolla", 10);
        CarConstructor car4 = new CarConstructor(100, 70);
        CarConstructor car5 = new CarConstructor(4, 2.2);
    }
}
