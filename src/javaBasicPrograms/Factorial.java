package javaBasicPrograms;

import java.util.Scanner;

public class Factorial {

	 public static long factorial(int n) {
	        long fact = 1; // Initialize factorial result
	        for (int i = 2; i <= n; i++) { // Loop from 2 to n
	            fact *= i; // Multiply each number
	        }
	        return fact;
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        int num = scanner.nextInt();
	        
	        System.out.println("Factorial of " + num + " is: " + factorial(num));
	        scanner.close();
	    }
}
