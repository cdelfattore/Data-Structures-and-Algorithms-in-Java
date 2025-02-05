/**
 * Write a Java class, Flower, that has three instance variables of type String, int,
 * and float, which respectively represent the name of the flower, its number of
 * petals, and price. Your class must include a constructor method that initializes
 * each variable to an appropriate value, and your class should include methods for
 * setting the value of each type, and getting the value of each type.
 */
public class R_1_10
{
    public static void main(String[] args)
    {
        Flower flower = new Flower();
        System.out.println();
        System.out.println(flower.getName() + " " + flower.getNumberOfPedals() + " " + flower.getPrice());
    }
}
