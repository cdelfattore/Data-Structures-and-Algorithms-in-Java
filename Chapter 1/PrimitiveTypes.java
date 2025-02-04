public class PrimitiveTypes
{
    public static void main(String[] args)
    {
        // boolean verbose = true, debug = false;
        // System.out.println(verbose + " " + debug);

        // double foo = -2.09080;
        // System.out.println(foo);

        Counter count = new Counter();
        count.increment();
        System.out.println();
        System.out.println(count.getCount());
    }
}