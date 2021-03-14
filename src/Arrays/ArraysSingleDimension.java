package Arrays;

public class ArraysSingleDimension {

	public static void main(String[] args) {
		/** Arrays are used to store multiple values in a single variable,
		 *  instead of declaring separate variables for each value.
		 *  To declare an array, define the variable type
		 *   with square brackets: String[] cars;
		 */
		int[] numbers = { 10, 50, 40, 22, 55, 88, 10, 50, 40, 22, 55, 88, 10, 50, 40, 22, 55, 88, 10, 50, 40, 22, 55,
			88, 10, 50, 40, 22, 55, 88, 10, 50, 40, 22, 55, 88, 10, 50, 40, 22, 55, 88 };
		System.out.print("size of the array: " + numbers.length);
		
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		numbers[6] = 58;
		for (int num : numbers) {
			System.out.print(num + " ");
		}
		// create a single dimension array of string with 5 names in it
		// using a for each loop, go through all and print them
		String[] cars = {"Volvo", "BMW", "Ford", "Mazda", "Chevi"};
		for (String inventory: cars) {
		  System.out.print (inventory + " ");
		}  
		System.out.println();
		
		// first names 
		String [] firstName = new String [5];
		// Last Name 
		String [] lastName = new String [5];
		// Age
		int [] age = new int [5];
		// Jack Nicholson 75 
		firstName [0] = "Jack";
		lastName [0] = "Nicholson";
		age [0] = 80;
		// Marlon Brando 80
		firstName [1] = "Marlon";
		lastName [1] = "Brando";
		age [1] = 80;
		// Denzel Washington 75
		firstName [2] = "Denzel";
		lastName [2] = "Washington";
		age [2] = 75;
		// Katharine Hapburn 18
		firstName [3] = "Katharine";
		lastName [3] = "Hapburn";
		age [3] = 18;
		// Mery1 Streep 18
		firstName [4] = "Mery1";
		lastName [4] = "Streep";
		age [4] = 18;
		for (int i = 0; i < firstName.length; i++) {
			System.out.println("\tFirst_Name: " + firstName[i] + "\tLast_Name: " + lastName[i] + "\tAge: " + age[i]);			
		}
		
		}  
		
	}
