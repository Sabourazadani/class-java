package Arrays;

public class ArraysTables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [][][]numsArray2 = new int [3][4][5];
		
		numsArray2[0][0][0] = 39;
		numsArray2[0][0][1] = 76; 
		numsArray2[0][0][2] = 57; 
		numsArray2[0][0][3] = 10; 
		numsArray2[0][0][4] = 74; 
		
		numsArray2[0][1][0] = 46;
		numsArray2[0][1][1] = 60; 
		numsArray2[0][1][2] = 71; 
		numsArray2[0][1][3] = 50; 
		numsArray2[0][1][4] = 89; 
		
		numsArray2[0][2][0] = 12;
		numsArray2[0][2][1] = 29; 
		numsArray2[0][2][2] = 95; 
		numsArray2[0][2][3] = 94; 
		numsArray2[0][2][4] = 8; 
		
		numsArray2[0][3][0] = 73;
		numsArray2[0][3][1] = 2; 
		numsArray2[0][3][2] = 46; 
		numsArray2[0][3][3] = 81; 
		numsArray2[0][3][4] = 64; 
		
		numsArray2[0][0][0] = 91;
		numsArray2[0][0][1] = 32; 
		numsArray2[0][0][2] = 67; 
		numsArray2[0][0][3] = 30; 
		numsArray2[0][0][4] = 44; 
		
		numsArray2[0][1][0] = 28;
		numsArray2[0][1][1] = 90; 
		numsArray2[0][1][2] = 67; 
		numsArray2[0][1][3] = 45; 
		numsArray2[0][1][4] = 19; 
		
		numsArray2[0][2][0] = 56;
		numsArray2[0][2][1] = 34; 
		numsArray2[0][2][2] = 84; 
		numsArray2[0][2][3] = 73; 
		numsArray2[0][2][4] = 23; 
		
		numsArray2[0][3][0] = 6;
		numsArray2[0][3][1] = 55; 
		numsArray2[0][3][2] = 98; 
		numsArray2[0][3][3] = 23; 
		numsArray2[0][3][4] = 26; 
		
		numsArray2[0][0][0] = 6;
		numsArray2[0][0][1] = 55; 
		numsArray2[0][0][2] = 98; 
		numsArray2[0][0][3] = 23; 
		numsArray2[0][0][4] = 26; 
		
		numsArray2[0][1][0] = 31;
		numsArray2[0][1][1] = 69; 
		numsArray2[0][1][2] = 38; 
		numsArray2[0][1][3] = 52; 
		numsArray2[0][1][4] = 5; 
		
		numsArray2[0][2][0] = 14;
		numsArray2[0][2][1] = 2; 
		numsArray2[0][2][2] = 66; 
		numsArray2[0][2][3] = 96; 
		numsArray2[0][2][4] = 75; 
		
		numsArray2[0][3][0] = 73;
		numsArray2[0][3][1] = 80; 
		numsArray2[0][3][2] = 89; 
		numsArray2[0][3][3] = 32; 
		numsArray2[0][3][4] = 75; 
		
		System.out.println("numsArray2.length : " + numsArray2.length);
		System.out.println("numsArray2.length [0]: " + numsArray2[0].length);
		System.out.println("numsArray2.length[0][0]: " + numsArray2[0][0].length);
		System.out.println();

		for (int table = 0; table < numsArray2.length; table++) {
			// a loop that can process a 2 dimension array
			for (int row = 0; row < numsArray2[table].length; row++) {
				for (int column = 0; column < numsArray2[table][row].length; column++) {
					
					System.out.print(numsArray2[table][row][column] + "\t");
				}
				System.out.println();
			}
			System.out.println("- - - - - - - - - - - - - - - - - ");
		}
	}

}
