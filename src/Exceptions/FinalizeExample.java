package Exceptions;

public class FinalizeExample {

	public void finalize() {
		System.out.println("finalize called");
	}

	public static void main(String[] args) {

		FinalizeExample f1 = new FinalizeExample();

		f1 = null;

		System.gc();

	}

}
