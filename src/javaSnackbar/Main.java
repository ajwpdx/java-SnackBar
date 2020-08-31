package javaSnackbar;

public class Main 
{
    private static void workWithData() 
    {
        System.out.println("Testing compiler");

        //instantiating customers
        Customer jane = new Customer("Jane", 45.25);
        Customer bob = new Customer("Bob", 33.14);

        System.out.println(bob.toString());

        //instantiating vending machines
        VendingMachine food = new VendingMachine("Food");
        VendingMachine drink = new VendingMachine("Drink");
        VendingMachine office = new VendingMachine("Office");

        //instantiating vending machines

    }   

    public static void main(String[] args)
    {
        workWithData();
    }
}