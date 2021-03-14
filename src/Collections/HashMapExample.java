package Collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String, String> states = new HashMap<String, String>();

		states.put("AZ", "Arizona"); // Put elements in Map
		states.put("VA", "Virginia");
		states.put("CA", "California");
		states.put("NY", "New York");

		System.out.println("Iterating States...");

		for (Map.Entry m : states.entrySet()) {
			System.out.println(m.getKey() + "    " + m.getValue());
			
			
		}

	}

}
