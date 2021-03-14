package Collections;

import java.util.HashSet;

public class HashSetsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] data = { "test", "test1", "test2", "test3", "test1" + "", "test2", "test4" };
		HashSet<String> temp = new HashSet<String>();
		for (int i = 0; i < data.length; i++) {
			if (!temp.add(data[i])) {
				System.out.println("there is duplicate in the array " + data[i] + " at index " + i + " is duplicate");

			}
		}

		System.out.println(data.length + "     " + temp.size());

	}

}
