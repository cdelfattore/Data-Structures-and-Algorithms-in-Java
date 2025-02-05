/**
 * Write a short Java method that takes an integer n and returns the sum of all
 * positive integers less than or equal to n.
 */
public class R_1_5
{

    public static void main(String [] args)
    {
        System.out.println();
        System.out.println(sumOfIntegers(10));
    }

    public static int sumOfIntegers(int n)
    {
        int result = n;

        for (int i = 1; i < n; i++)
        {
            result += i;
        }

        return result;
    }
}
