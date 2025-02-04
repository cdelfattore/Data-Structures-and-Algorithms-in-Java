import java.util.Scanner;

public class R_1_1
{
    public static void main(String[] args)    
    {
        inputAllBaseTypes();
    }

    public static void inputAllBaseTypes()
    {
        Scanner input = new Scanner(System.in);
        System.out.println();

        // boolean a boolean value: true or false
        System.out.print("Enter a boolean value: ");
        boolean booleanInput = input.nextBoolean();
        System.out.println("You entered the boolean: " + booleanInput);

        // char 16-bit Unicode character
        // boolean a boolean value: true or false
        System.out.print("Enter a char value: ");
        char charInput = input.next().charAt(0);
        System.out.println("You entered the char: " + charInput);

        // byte 8-bit signed two’s complement integer
        System.out.print("Enter a byte value: ");
        byte byteInput = input.nextByte();
        System.out.println("You entered the byte: " + byteInput);

        // short 16-bit signed two’s complement integer
        System.out.print("Enter a short value: ");
        short shortInput = input.nextShort();
        System.out.println("You entered the short: " + shortInput);

        // int 32-bit signed two’s complement integer
        System.out.print("Enter a int value: ");
        int intInput = input.nextInt();
        System.out.println("You entered the int: " + intInput);

        // long 64-bit signed two’s complement integer
        System.out.print("Enter a long value: ");
        long longInput = input.nextLong();
        System.out.println("You entered the long: " + longInput);

        // float 32-bit floating-point number (IEEE 754-1985)
        System.out.print("Enter a float value: ");
        float floatInput = input.nextFloat();
        System.out.println("You entered the float: " + floatInput);

        // double 64-bit floating-point number (IEEE 754-1985)
        System.out.print("Enter a double value: ");
        double doubleInput = input.nextDouble();
        System.out.println("You entered the double: " + doubleInput);

        input.close();
    }
}
