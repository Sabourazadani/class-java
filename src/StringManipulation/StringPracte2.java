package StringManipulation;

public class StringPracte2 {

	// write a function that would take one String and count the number of words in
	// it.
	// then write another function that would take one String and count the number
	// of characters and
	// the repetition of each char
	// static, split based on space, return a number (words/chars)

	// "this is the test string that you have to count the number of words or
	// characters for.

	public static int countWords(String count) {

		if (count == null || count.isEmpty())

			return 0;

		String[] str = count.split(" ");

		return str.length;
	}

	public static void main(String args[]) {

		String str = "this is the test string that you have to count the number of words or\n" + "	// characters for ";

		System.out.println("No of words : " + countWords(str));

	}

}
