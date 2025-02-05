/**
 * Write a short Java method, isEven, that takes an int i and returns true
 * if and only if i is even. Your method cannot use the multiplication,
 * modulus, or division operators, however.
 */
public class R_1_4
{
    public static void main(String[] args)
    {
        System.out.println("\n" + isEven(16));
        System.out.println(isEven(11));
    }

    public static boolean isEven(int i)
    {
        // System.out.println();
        // System.out.println(Integer.toBinaryString(i));
        // System.out.println(i >> 0 & 1);
        return (i & 1) == 0;
    }
}
