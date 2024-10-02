public class PascalCase {
   
        // Method to convert a string to Pascal Case
        public static String convertToPascalCase(String str) {
            // Convert the entire string to lowercase and split into words based on spaces
            String[] words = str.toLowerCase().split(" ");
            String result = "";
            
            // Loop through each word and capitalize it, then concatenate to the result
            for (String word : words) {
                System.out.println(word);
                result += capitalize(word);

            }
            
            return result;  // Return the final Pascal Case string
        }
    
        // Method to capitalize the first letter of a word
        public static String capitalize(String word) {
            // Capitalize the first letter and concatenate with the rest of the word
            return word.substring(0, 1).toUpperCase() + word.substring(1);
        }
    
        // Main method to test the functionality
        public static void main(String[] args) {
            String input = "hello world this is java";
            String result = convertToPascalCase(input);
            System.out.println("Pascal Case: " + result);  // Output: HelloWorldThisIsJava
        }
    }
    

