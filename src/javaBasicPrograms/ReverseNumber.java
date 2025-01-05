package javaBasicPrograms;

public class ReverseNumber {
	public static int reverseNumber(int num) {
        int reversed = 0;
        
        while (num != 0) {
            int digit = num % 10;      // Get the last digit
            reversed = reversed * 10 + digit;  // Append it to the reversed number
            num /= 10;                 // Remove the last digit from the original number
        }
        
        return reversed;
    }

    public static void main(String[] args) {
        int num = 12345;
        int reversed = reverseNumber(num);
        System.out.println("Reversed Number: " + reversed);
    }

}
