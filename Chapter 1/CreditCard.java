/**
 * Code Fragment 1.5
 */
public class CreditCard
{
    // Instance variables
    private String customer;
    private String bank;
    private String account;
    private int limit;
    protected double balance;

    public CreditCard(String customer, String bank, String account, int limit, double balance)
    {
        this.customer = customer;
        this.bank = bank;
        this.account = account;
        this.limit = limit;
        this.balance = balance;
    }

    public CreditCard(String customer, String bank, String account, int limit)
    {
        this(customer, bank, account, limit, 0.0);
    }

    public String getCustomer()
    {
        return this.customer;
    }

    public String getBank()
    {
        return this.bank;
    }

    public String getAccount()
    {
        return this.account;
    }

    public int getLimit()
    {
        return this.limit;
    }

    public double getBalance()
    {
        return this.balance;
    }

    public boolean charge(double price)
    {
        if (price + this.balance > this.limit)
        {
            return false;
        }
        
        this.balance += price;
        
        return true;
    }

    public void makePayment(double amount)
    {
        if (amount > 0) //added if statement for R_1_12
        {
            this.balance -= amount;
        }
    }

    /**
     * Method for R_1_11
     * @param limit
     */
    public void setLimit(int limit)
    {
        this.limit = limit;
    }

    public static void printSummary(CreditCard card)
    {
        System.out.println("Customer = " + card.customer);
        System.out.println("Bank = " + card.bank);
        System.out.println("Account = " + card.account);
        System.out.println("Balance = " + card.balance);
        System.out.println("Limit = " + card.limit);
    }

    public static void main(String[ ] args) {
        CreditCard[] wallet = new CreditCard[3];
        wallet[0] = new CreditCard("John Bowman", "California Savings", "5391 0375 9387 5309", 5000);
        wallet[1] = new CreditCard("John Bowman", "California Federal", "3485 0399 3395 1954", 3500);
        wallet[2] = new CreditCard("John Bowman", "California Finance", "5391 0375 9387 5309", 2500, 300);
    
        for (int val = 1; val <= 16; val++) {
            wallet[0].charge(100*val);
            wallet[1].charge(2*val);
            wallet[2].charge(val);
        }

        for (CreditCard card : wallet) 
        {
            CreditCard.printSummary(card); // calling static method
            while (card.getBalance( ) > 200.0)
            {
                card.makePayment(200);
                System.out.println("New balance = " + card.getBalance());
            }
        }
    }

}
