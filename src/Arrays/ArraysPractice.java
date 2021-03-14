package Arrays;

public class ArraysPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][][] data = new int [3][4][5];
		
        data[0][0][0]=1;
        data[0][0][3]=5;
        data[0][1][1]=2;
        data[0][1][4]=6;
        data[0][2][2]=3;
        data[0][3][3]=4;

        data[1][0][0]=7;
        data[1][0][3]=11;
        data[1][1][1]=8;
        data[1][1][4]=12;
        data[1][2][2]=9;
        data[1][3][3]=4;

        data[2][0][0]=13;
        data[2][0][3]=17;
        data[2][1][1]=14;
        data[2][1][4]=18;
        data[2][2][2]=15;
        data[2][3][3]=1;
        
        for(int table=0; table<data.length; table++) {
            for(int row =0; row<data[table].length; row++) {
                for (int col =0; col<data[table][row].length; col++) {
                    System.out.print(data[table][row][col] + " ");
                }
                System.out.println();
                }
            }
        }
}

