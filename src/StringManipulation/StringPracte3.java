package StringManipulation;

public class StringPracte3 {
	public static void main(String[] args) {

		/*
		 * assume that you have a math operation in a string. try to do the math and
		 * return the result 1+2+5-4+3
		 */

		String a = "1+2+5-4+3";
		String operators[] = a.split("[0-9]");
		String operands[] = a.split("[+-]");
		int agregate = (int) Integer.parseInt(operands[0]);
		for (int i = 1; i < operands.length; i++) {
			if (operators[i].equals("+")) {
				agregate += Integer.parseInt(operands[i]);
			} else {
				agregate -= Integer.parseInt(operands[i]);
			}
			System.out.println(agregate);
		}
	}
}