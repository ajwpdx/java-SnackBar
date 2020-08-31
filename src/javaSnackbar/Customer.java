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
        public int getId()
        {
            return id;
        }
    
        public String getName()
        {
            return name;
        }
    
        public void setName(String name)
        {
            this.name = name;
        }


}