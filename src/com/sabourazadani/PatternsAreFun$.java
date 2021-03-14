package com.sabourazadani;

public class PatternsAreFun$ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int area = 10;
		
		for (int row = 0; row < area; row++) {
			for (int col = 0; col < area; col++) {
				if (row == 0 || row == (area - 1)) {
					System.out.print(""
							+ "|| ");
				} else { 
					if (col == 0 || col == (area - 1)) {
						System.out.print("||         ");
					} 
					else {
						System.out.print("  ");
					}
				}
			}
			System.out.println();
		}
	
	}
}
