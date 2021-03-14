package com.sabourazadani;

public class DiamondNumbersPatherns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	int area = 5;
		
		for (int star = 1, space = area; star <= area; star++, space--) {
			for(int i = 1; i <= space; i++) {
				System.out.print("  ");
			}
			for (int i = 1; i <= star; i++) {
				System.out.print(i + "   ");
			}
			System.out.println();
	}
	}
}
