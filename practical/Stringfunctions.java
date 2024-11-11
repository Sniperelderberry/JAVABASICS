public class Stringfunctions {
    public static void main(String[] args) {
        // Initialize two string variables
        String str = "Sukhdeep";
        String str1 = "Singh";

        // Print the length of the first string
        System.out.println("Length of string: " + str.length());
        
        // Print the character at index 4 of the first string
        System.out.println("Character at index 4: " + str.charAt(4));
        
        // Print the substring starting from index 4 of the first string
        System.out.println("Substring from index 4: " + str.substring(4));
        
        // Concatenate the two strings and print the result
        System.out.println("Concatenated string: " + str.concat(str1));
        
        // Compare the two strings and print the result
        System.out.println("Comparison result: " + str.compareTo(str1));
        
        // Convert the first string to lowercase and print it
        System.out.println("Lowercase: " + str.toLowerCase());
        
        // Convert the second string to uppercase and print it
        System.out.println("Uppercase: " + str1.toUpperCase());
        
        // Replace 'e' with 'a' in the first string and print the result
        System.out.println("Replaced string: " + str.replace('e', 'a'));
        
        // Check if the first string contains "ui" and print the result
        System.out.println("Contains 'ui': " + str.contains("ui"));
    }
}
