public class C_1_18
{
    public static void main(String[] args)
    {
        System.out.println(norm(new int[]{4, 3, 2, 7}));
    }

    public static double norm(int[] v)
    {
        return norm(v, 2);
    }

    public static double norm(int[] v, int p)
    {
        int result = 0;
        for (int i = 0; i < v.length; i++)
        {
            result += v[i] * v[i];
        }

        return Math.pow(result, 0.5);
    }
}
