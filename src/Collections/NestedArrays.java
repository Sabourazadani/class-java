package Collections;

import java.util.ArrayList;

public class NestedArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<ArrayList<String>> data = new ArrayList<ArrayList<String>>();

		ArrayList<String> fn = new ArrayList<String>();
		ArrayList<String> ln = new ArrayList<String>();

		fn.add("Jack");
		fn.add("Jack");
		fn.add("Jack");
		fn.add("Jack");

		ln.add("Ma");

		data.add(fn);
		data.add(ln);
		data.add(new ArrayList<String>());
		data.add(new ArrayList<String>());
		data.add(new ArrayList<String>());

		data.get(3).add("example text");
		data.get(0).remove(3);

		data.get(0).set(1, "Jack 2.0");

		System.out.println(fn);

		System.out.println(data);

	}

}
