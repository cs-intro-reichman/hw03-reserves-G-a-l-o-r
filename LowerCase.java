/** String processing exercise 1. */
public class LowerCase {
    public static void main(String[] args) {  
        int sentence = args.length;
        String str = " ";
  
        for (int i = 0; i < sentence; i++) {
            str = str + " " + args[i];
        }
    
        System.out.println(lowerCase(str));
    }

   /**
    * Returns a string which is identical to the original string, 
    * except that all the upper-case letters are converted to lower-case letters.
    * Non-letter characters are left as is.
    */
    public static String lowerCase(String str) {
        int i= 0;
        int length = str.length();
        //create an empty string
        String letters = "";
        while (i < length){
           char c = str.charAt(i);
           //check if 'c' is an uppercase letter
           if (c >= 'A' && c <= 'Z') {
            //if it is add 32 (askii)
             c= (char)(c+32);
            }
            //add c to my empty string - "letters"
            letters+=c; 
             i++;
        }
        //return the empty string
        return letters ;
    }
}