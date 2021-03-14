package com.sabourazadani;

import java.time.LocalDate;
import java.time.LocalTime;

public class PrimitiveDateTypes {

	public static void main(String[] args) {
		// Primitive Data Type
		
		byte theByte = -128;
		short theShort = -3_2768;
		int theInt = -2_147483_648;
		long theLong = 3_434_343_445L;
		
		Float pi = 3.14F;
		double doublePi = 3.1415;
		
		boolean isAdult = true;
		
		char nameInitial = 's';
		
		String fullName = new String ("M. Sabour Azadani");
		
        LocalDate localDate = LocalDate.now();
		LocalTime localTime = LocalTime.now();
		
		System.out.println(theByte);
		System.out.println(theShort);
		System.out.println(theInt);
		System.out.println(theLong);

		System.out.println(pi);
		System.out.println(doublePi);

		System.out.println(isAdult);
		System.out.println(nameInitial);

		System.out.println(fullName.toUpperCase());
		System.out.println(localDate);
		System.out.println(localTime);
		
		
		
	}

}
