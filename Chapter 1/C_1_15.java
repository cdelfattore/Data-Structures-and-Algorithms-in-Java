// Write a pseudocode description of a method for finding the smallest and largest
// numbers in an array of integers and compare that to a Java method that would do
// the same thing.

public class C_1_15
{
    public static void main(String[] args)    
    {
        int[] array = {1, 2, 3, 4, 5};
        int smallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++)
        {
            if (smallest > array[i])
            {
                smallest = array[i];
            }

            if (largest < array[i])
            {
                largest = array[i];
            }
        }
        System.out.println();
        System.out.println(smallest);
        System.out.println(largest);
    }
}
