// Write a short program that takes as input three integers, a, b, and c, from the Java
// console and determines if they can be used in a correct arithmetic formula (in the
// given order), like “a+b = c,” “a = b−c,” or “a ∗ b = c.”
public class C_1_16
{

    enum Operator { ADD, SUB, PROD, EQUAL };
    public static void main(String[] args)    
    {
        
        // if (Integer.valueOf(args[0]) + Integer.valueOf(args[1]) == Integer.valueOf(args[2]))
        //     System.out.println("a + b = c");

        // if (Integer.valueOf(args[1]) - Integer.valueOf(args[2]) == Integer.valueOf(args[0]))
        //     System.out.println("a = b - c");

        // if (Integer.valueOf(args[0]) * Integer.valueOf(args[1]) == Integer.valueOf(args[2]))
        //     System.out.println("a * b = c");

        // SOlution Book hint says to use enum typs but I am not sure what they mean
        int a = Integer.valueOf(args[0]);
        int b = Integer.valueOf(args[1]);
        int c = Integer.valueOf(args[2]);

        for (Operator o : new Operator[]{ Operator.ADD, Operator.SUB, Operator.PROD, Operator.EQUAL})
        {
            switch (o) {
                case ADD:
                    
                    break;
                case SUB:
                    
                    break;
                case PROD:
                    
                    break;
                case EQUAL:

                    break;
            }
        }
    }

}
