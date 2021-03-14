package Collections;

import java.util.ArrayList;

public class ArrayListPractice {

	public static void main(String[] args) {
		
		ArrayList <Integer> firstAL = new ArrayList <Integer> ();
		
		firstAL.add(10); 
		firstAL.add(12); 
		firstAL.add(14); 
		firstAL.add(11); 
		firstAL.add(1123); 
		
		firstAL.remove(0);
		System.out.println(firstAL.get(0));
		System.out.println(firstAL);
		
		for (int i = 0; i < firstAL.size(); i++) {
			System.out.println(firstAL.get(i));
			
		}
		
		
		
		

	}

}
