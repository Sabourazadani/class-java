package OOP;

public class ContinueAndBreak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

		for (int i = 0; i < 20; i++) {
			if (i > 5 && i < 10) {
				continue;
			} else if (i < 21 || i == 4) {
				break;
			} else {
				System.out.println(i + 1);
			}
		}

	}

}
