package javaBasicPrograms;

public class CompareTwoObject {

	// Define the class with attributes
	    String model;
	    int year;

	    // Constructor to initialize object
	    public CompareTwoObject(String model, int year) {
	        this.model = model;
	        this.year = year;
	    }

	    // Override equals() method to compare objects based on their attributes
	    @Override
	    public boolean equals(Object obj) {
	        // Check if the object is compared to itself
	        if (this == obj) return true;

	        // Check if the object is of the same class
	        if (obj == null || getClass() != obj.getClass()) return false;

	        // Cast the object to the Car type for comparison
	        CompareTwoObject car = (CompareTwoObject) obj;

	        // Compare the attributes of the objects
	        return model.equals(car.model) && year == car.year;
	    }
	

	
	    public static void main(String[] args) {
	        // Create two Car objects
	    	CompareTwoObject car1 = new CompareTwoObject("Toyota", 2020);
	    	CompareTwoObject car2 = new CompareTwoObject("Toyota", 2020);
	    	CompareTwoObject car3 = new CompareTwoObject("Honda", 2021);

	        // Compare objects using equals()
	        System.out.println("car1 equals car2: " + car1.equals(car2));  // true
	        System.out.println("car1 equals car3: " + car1.equals(car3));  // false
	    }
	

}
