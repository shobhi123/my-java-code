package javaBasicPrograms;

import java.util.HashMap;

public class DuplicateCharacters {

	 public static void findDuplicates(String str) {
	        HashMap<Character, Integer> charCountMap = new HashMap<>();

	        // Count the frequency of each character
	        for (int i = 0; i < str.length(); i++) {
	            char c = str.charAt(i);
	            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
	        }

	        // Print characters with frequency greater than 1 (duplicates)
	        System.out.println("Duplicate characters:");
	        for (Character c : charCountMap.keySet()) {
	            if (charCountMap.get(c) > 1) {
	                System.out.println(c + " appears " + charCountMap.get(c) + " times.");
	            }
	        }
	    }

	    public static void main(String[] args) {
	        String str = "programming";
	        findDuplicates(str);
	    }
}
