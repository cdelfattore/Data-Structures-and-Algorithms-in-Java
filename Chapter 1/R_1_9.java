/**
 * Write a short Java method that uses a StringBuilder instance to remove all the
 * punctuation from a string s storing a sentence, for example, transforming the
 * string "Let’s try, Mike!" to "Lets try Mike".
 */
public class R_1_9
{
    public static void main(String[] args)    
    {
        String result = removePunctuation("Let's try, Mike!");
        System.out.println("\n" + result);
    }

    public static String removePunctuation(String s)
    {
        return s.replaceAll("[^A-z0-9\\s]", "");
    }
}
