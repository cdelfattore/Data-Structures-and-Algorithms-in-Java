/**
 * Class Flower for the R_1_10.java excercise.
 */
public class Flower
{
    private String name;
    private int numOfPedals;
    private float price;

    public Flower()
    {
        this("Basic", 6, 1F);
    }
    public Flower(String name, int numOfPedals, float price)
    {
        this.name = name;
        this.numOfPedals = numOfPedals;
        this.price = price;
    }

    public String getName()
    {
        return this.name;
    }

    public int getNumberOfPedals()
    {
        return this.numOfPedals;
    }

    public float getPrice()
    {
        return this.price;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setNumberOfPedals(int numOfPedals)
    {
        this.numOfPedals = numOfPedals;
    }

    public void setPrice(long price)
    {
        this.price = price;
    }

}
