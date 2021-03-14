package Polymorphism;

class Main {

	public static void main(String[] args) {

		Animal myAnimal = new Animal(); // Create a Animal object
		myAnimal.animalSound();

		Animal myPig = new Pig(); // Create a Pig object
		myPig.animalSound();

		Animal myDog = new Dog(); // Create a Dog object
		myDog.animalSound();
	}
}