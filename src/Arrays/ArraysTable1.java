package Arrays;

public class ArraysTable1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][][] threeD = new int[3][4][5];
		threeD[0][0][0] = 39;
		threeD[0][0][1] = 76;
		threeD[0][0][2] = 57;
		threeD[0][0][3] = 10;
		threeD[0][0][4] = 74;
		
		threeD[0][1][0] = 46;
		threeD[0][1][1] = 60;
		threeD[0][1][2] = 71;
		threeD[0][1][3] = 50;
		threeD[0][1][4] = 89;
		
		threeD[0][2][0] = 12;
		threeD[0][2][1] = 29;
		threeD[0][2][2] = 95;
		threeD[0][2][3] = 94;
		threeD[0][2][4] = 8;
		
		threeD[0][3][0] = 73;
		threeD[0][3][1] = 2;
		threeD[0][3][2] = 46;
		threeD[0][3][3] = 81;
		threeD[0][3][4] = 64;
		//******************
		threeD[1][0][0] = 91;
		threeD[1][0][1] = 32;
		threeD[1][0][2] = 67;
		threeD[1][0][3] = 30;
		threeD[1][0][4] = 44;
		
		threeD[1][1][0] = 28;
		threeD[1][1][1] = 90;
		threeD[1][1][2] = 67;
		threeD[1][1][3] = 45;
		threeD[1][1][4] = 19;
		
		threeD[1][2][0] = 56;
		threeD[1][2][1] = 34;
		threeD[1][2][2] = 84;
		threeD[1][2][3] = 73;
		threeD[1][2][4] = 23;
		
		threeD[1][3][0] = 22;
		threeD[1][3][1] = 25;
		threeD[1][3][2] = 49;
		threeD[1][3][3] = 23;
		threeD[1][3][4] = 37;
		//******************
		threeD[2][0][0] = 6;
		threeD[2][0][1] = 55;
		threeD[2][0][2] = 98;
		threeD[2][0][3] = 23;
		threeD[2][0][4] = 26;
		
		threeD[2][1][0] = 31;
		threeD[2][1][1] = 69;
		threeD[2][1][2] = 38;
		threeD[2][1][3] = 52;
		threeD[2][1][4] = 5;
		
		threeD[2][2][0] = 14;
		threeD[2][2][1] = 2;
		threeD[2][2][2] = 66;
		threeD[2][2][3] = 96;
		threeD[2][2][4] = 75;
		
		threeD[2][3][0] = 73;
		threeD[2][3][1] = 80;
		threeD[2][3][2] = 89;
		threeD[2][3][3] = 32;
		threeD[2][3][4] = 75;
		for(int thirdD = 0; thirdD < threeD.length; thirdD++) {
		    for(int secondD = 0; secondD < threeD[thirdD].length; secondD++) {
		        for(int firstD = 0; firstD < threeD[thirdD][secondD].length; firstD++) {
		            System.out.print(threeD[thirdD][secondD][firstD] + " ");
		        }
		        System.out.println();
		    }
		    System.out.println();
		}
	}

}
