package StaticPractic;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student obj1 = new Student("Jack", "Ma");

		Student obj2 = new Student("Adam", "Smith");

		obj1.count = 10;
		System.out.println(obj1.count);
		System.out.println(obj2.count);

		obj2.count = 5;
		System.out.println(obj1.count);
		System.out.println(obj2.count);

	}

}
