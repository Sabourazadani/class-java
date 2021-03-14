package Inheritance;

public class Inheritance {
	public class Animal { // Fields can be accessed by: private String name;
		// class only protected
		int numLimbs; // subclasses public boolean eggLaying;
		// anyone}public class Dog extends Animal{
		private int tricksKnown;
	}

	public class Dog extends Animal {
		private int tricksKnown;
		private boolean eggLaying;

		private void accessTest() {
			this.eggLaying = false;

			// public this.numLimbs = 4;
			// protected
			// cannot access name
			// private}}
		}

		public int getTricksKnown() {
			return tricksKnown;
		}

		public void setTricksKnown(int tricksKnown) {
			this.tricksKnown = tricksKnown;
		}
	}

}
