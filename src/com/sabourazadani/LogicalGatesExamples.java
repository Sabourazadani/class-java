package com.sabourazadani;

public class LogicalGatesExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int grade = 60; 
		double  attendancePercent = .5;
		
		// true 			and 		false	=    false
		
		if (!(!(grade >= 60 && !(attendancePercent > 0.7)))) { //  60 >60
			System.out.println("pass");
		}
		
		System.out.println( (10*5 ) + (5+5));
		
		boolean a = true; 
		boolean b = false; 
		
		System.out.println(!a   !=!      !b      );
		
		
		
		boolean isRaining = true;
		double temp = 65;
		
		int wind = 15;
		
		if	(isRaining && temp > 60) {
					System.out.println("its raining but temp is fine");
		}	else if	(!isRaining && wind > 20) {
					System.out.println("dont need the umbrella,but its windy");
		}	else if(isRaining && temp < 20 && wind > 20) {
					System.out.println("stay inside, not a good day");
		}
		
		
		boolean a1 = true;
		boolean b1 = true;
		boolean c = true; 
		System.out.println(a1 || !((a1 && b1) || !(!a1 && b1)));
		System.out.println( (!a1 && !b) || !(a1 || b1) && b1);
		
	}
		
		
}