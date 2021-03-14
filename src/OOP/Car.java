package OOP;

public class Car {
	/**
	 * The meaning of Encapsulation, is to make sure that "sensitive" data is hidden
	 * from users. To achieve this, you must: declare class variables/attributes as
	 * private provide public get and set methods to access and update the value of
	 * a private variable
	 * 
	 * --> The get method returns the variable value, --> and the set method sets
	 * the value.
	 */

	private String type;
	private String model;
	private int year;
	private String vin;

	public Car(String newVIN) {
		type = "";
		model = "";
		year = 0;
		vin = newVIN;
	}

	public String getType() {
		return type;
	}

	public void setType(String newType) {
		type = newType;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String newModel) {
		model = newModel;

	}

	public int getYear() {
		return year;
	}

	public void setYear(int newYear) {
		year = newYear;

	}

	public String getVIN() {
		return vin;
	}

}
