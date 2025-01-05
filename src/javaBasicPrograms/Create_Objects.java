package javaBasicPrograms;

public class Create_Objects {

	// Define the class with a constructor

	String model;
	int year;

	// Constructor to initialize object
	public Create_Objects(String model, int year) {
		this.model = model;
		this.year = year;
	}

	// Method to display the object details
	public void displayInfo() {
		System.out.println("Model: " + model);
		System.out.println("Year: " + year);
	}

	public static void main(String[] args) {
		// Create an object using the 'new' keyword and the constructor
		Create_Objects myCar = new Create_Objects("Toyota", 2020);

		// Call the method of the object
		myCar.displayInfo(); // Display object details
	}

}
