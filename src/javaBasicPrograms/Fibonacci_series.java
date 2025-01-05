package javaBasicPrograms;

public class Fibonacci_series {
	

	    // Method to print Fibonacci series up to n terms
	    public static void printFibonacci(int n) {
	        int first = 0, second = 1;
	        
	        // Print first n terms of the Fibonacci series
	        System.out.print("Fibonacci Series up to " + n + " terms: ");
	        
	        // Handle the first two terms of the Fibonacci series
	        if (n >= 1) {
	            System.out.print(first + " ");
	        }
	        if (n >= 2) {
	            System.out.print(second + " ");
	        }
	        
	        // Calculate the remaining Fibonacci terms iteratively
	        for (int i = 3; i <= n; i++) {
	            int nextTerm = first + second;  // Next Fibonacci term
	            System.out.print(nextTerm + " ");
	            
	            // Update first and second for the next iteration
	            first = second;
	            second = nextTerm;
	        }
	    }

	    public static void main(String[] args) {
	        int n = 10; // Number of terms to print
	        printFibonacci(n); // Call the method to print the Fibonacci series
	    }
	


}
