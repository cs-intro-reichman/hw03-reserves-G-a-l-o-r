/** String processing exercise 2. */
public class UniqueChars {
    public static void main(String[] args) {  
        int sentence = args.length;
        String word = " ";
        for (int i = 0; i < sentence; i++) {
            word = word + " " + args[i];
        }
        System.out.println(uniqueChars(word));

           
    }

    /**
     * Returns a string which is identical to the original string, 
     * except that all the duplicate characters are removed,
     * unless they are space characters.
     */
    public static String uniqueChars(String word) {
        String result = ""; 

        // Iterate through each character in the input string
        for (int i = 0; i < word.length(); i++) {
            char currentChar = word.charAt(i);
            
            // Check if the character is a space or if it's not already in the result string
            if (currentChar == ' ' || result.indexOf(currentChar) == -1 || result.indexOf(currentChar) == i) {
                if (currentChar == ' ') {
                    result += ' ';
                    
                }
                else {
                    result += currentChar; // Append the character to the result string
                }
               
            }
        }

        return result;
}
}