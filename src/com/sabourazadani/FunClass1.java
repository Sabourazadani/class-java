package com.sabourazadani;

public class FunClass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int z = 5;
		for (int x = 1; x <= z; x++) {
			for (int y = x; y >= 1; y--) {
				System.out.print(y + " ");
			}
			for(int w = (z-1); w >= x; w-- ) {
				System.out.print("  ");
			}
			for (int y = 1; y <= x; y++) {
				System.out.print(y + " ");
			}
			System.out.println();
		}
	}

}
