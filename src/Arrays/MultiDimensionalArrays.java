package Arrays;

public class MultiDimensionalArrays {

	public static void main(String[] args) {
		/*
		 	A multidimensional array is an array containing one or more arrays.
			To create a two-dimensional array, add each array within its own
			 set of curly braces:
			 The first set is row number and the second set is column number
		*/ 
		int[ ][ ] table = {
				{1, 2, 3},
				{4, 5, 6},
				{7, 8, 9}
				};
			    
		for (int row = 0; row < table.length; row++) {
			for (int column = 0; column < table [row].length; column++) {
				System.out.print(table[row][column] + " ");
			}
			System.out.println();
		}
			    
	}
}
