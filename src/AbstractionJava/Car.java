package AbstractionJava;

public interface Car {
	
	public void brake(double speed);
	public boolean startEngine();
	public boolean leftSignal();
	public boolean rightSignal();
	public void adjustLeftMirror();
	public void adjustRightMirror();
	
	
	public default void theNewMethod() {
		System.out.println("this is this default implementation of the new method");
	};
	
	//default
	//static
	
	public static void something () {
		System.out.println("this is the method that does something statically");
	}
	
}