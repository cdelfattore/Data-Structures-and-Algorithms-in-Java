// Write a short Java method that takes an array of int values and determines if there
// is a pair of distinct elements of the array whose product is even.
public class C_1_17
{
    public static void main(String[] args)
    {
        int[] array = {1, 3, 5, 7};
        System.out.println(containsProductPair(array));
    }

    public static boolean containsProductPair(int[] array)
    {
        if (array.length < 2)
        {
            return false;
        }

        for (int i = 0; i < array.length; i++)
        {
            if ((array[i] & 1) == 0)
            {
                return true;
            }
        }
        return false;
    }
}
