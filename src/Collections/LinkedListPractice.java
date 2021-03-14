package Collections;

import java.util.LinkedList;

public class LinkedListPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList <String> firstLL = new LinkedList <String>();
		
		firstLL.add("test");
		firstLL.add("test1");
		firstLL.add("test2");
		firstLL.add("test3");
		firstLL.add("test4");
		firstLL.add("test5");
		
		firstLL.remove(0);
		System.out.println(firstLL.get(0));


	}

}
