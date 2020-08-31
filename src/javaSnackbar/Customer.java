package javaSnackbar;

public class Customer
{
    private static int maxId = 0;
    private int id;
    private String name;
    private double cashOnHand;


    //constructor
    public Customer(String name, double cashOnHand)
    {
        maxId++;
        id = maxId;

        this.name = name;
        this.cashOnHand = cashOnHand;

    }

        //Methods
        //get
        public int getId()
        {
            return id;
        }
    
        public String getName()
        {
            return name;
        }
    
        public double getCashOnHand()
        {
            return cashOnHand;
        }

        //set
        public void setName(String name)
        {
            this.name = name;
        }

        public void setCashOnHand(double cashOnHand)
        {
            this.cashOnHand = cashOnHand;
        }

        //other methods

        public void addCash(double cashAdded)
        {
            setCashOnHand(this.cashOnHand + cashAdded);
        }

        public void buySnack (double cost, int amt)
        {
            setCashOnHand(this.cashOnHand - (cost * amt));
        }
}