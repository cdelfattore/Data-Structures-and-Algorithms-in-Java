import java.util.Arrays;

public class C_1_14
{
    public static void main(String[] args)    
    {
        int[] array = {1, 2, 3, 4, 5};
        int[] reverse = new int[array.length];
        for (int i = 0; i < array.length; i++)
        {
            reverse[i] = array[array.length - 1 - i];
        }
        System.out.println();

        System.out.println(Arrays.toString(reverse));
    }
}
