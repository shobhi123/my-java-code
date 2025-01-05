package javaBasicPrograms;

import java.util.Scanner;

public class Palindrome {

	 public static boolean isPalindrome(String str) {
	        int left = 0, right = str.length() - 1;
	        
	        while (left < right) {
	            if (str.charAt(left) != str.charAt(right)) {
	                return false; // If mismatch found, it's not a palindrome
	            }
	            left++;
	            right--;
	        }
	        return true; // If no mismatches, it's a palindrome
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a string: ");
	        String input = scanner.nextLine();
	        
	        if (isPalindrome(input)) {
	            System.out.println(input + " is a palindrome.");
	        } else {
	            System.out.println(input + " is not a palindrome.");
	        }
	        
	        scanner.close();
	    }
}
