/**
 * Write a short Java method that takes an integer n and returns the sum of the
 * squares of all positive integers less than or equal to n.
 */
public class R_1_7
{
    public static void main(String [] args)
    {
        System.out.println();
        System.out.println(sumOfSquares(10));
    }

    public static int sumOfSquares(int n)
    {
        int result = 0;

        for (int i = 1; i <= n; i++)
        {
            result = result + (int) Math.pow(i, 2);
        }

        return result;
    }    
}
