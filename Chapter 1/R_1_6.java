/**
 * Write a short Java method that takes an integer n and returns the sum of all the
 * odd positive integers less than or equal to n.
 */
public class R_1_6
{

    public static void main(String [] args)
    {
        System.out.println();
        System.out.println(sumOfOddIntegers(6));
    }

    public static int sumOfOddIntegers(int n)
    {
        int result = 0;

        for (int i = 1; i <= n; i++)
        {
            if ((i & 1) == 1)
            {
                result += i;
            }
        }

        return result;
    }
}