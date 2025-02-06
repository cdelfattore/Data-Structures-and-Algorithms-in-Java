/**
 * Modify the CreditCard class from Code Fragment 1.5 to include a
 * method that updates the credit limit.
 */
public class R_1_11
{
    public static void main(String[] args)
    {
        CreditCard card = new CreditCard("Big Mike", "Chase", "Checkings", 10000);
        CreditCard.printSummary(card);
        card.setLimit(500);
        CreditCard.printSummary(card);
    }
}
