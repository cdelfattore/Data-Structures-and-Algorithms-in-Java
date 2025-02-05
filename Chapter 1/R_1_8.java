/**
 * Write a short Java method that counts the number of vowels in a given character string.
 */
public class R_1_8
{
    public static void main(String[] args)    
    {
        int result = countVowels("This is a random string with multiple words.");
        System.out.println("\n" + result);
    }

    public static int countVowels(String s)
    {
        int result = 0;
        StringBuilder sb = new StringBuilder(s.toLowerCase());
        for (int i = 0; i < sb.length(); i++)
        {
            char c = sb.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' | c == 'u')
            {
                result += 1;
            }
        }

        return result;
    }
}
