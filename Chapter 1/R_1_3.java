/**
 * Write a short Java method, isMultiple, that takes two long values, n and m, and
 * returns true if and only if n is a multiple of m, that is, n = mi for some integer i.
 */
public class R_1_3
{
    
    public static void main(String[] args)
    {
        System.out.println(isMultiple(10000L, 5L));
    }

    public static boolean isMultiple(long m, long n)
    {
        return m % n == 0;
    }
}
