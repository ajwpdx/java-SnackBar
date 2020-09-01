package javaSnackbar;

public class Main 
{
    private static void workWithData() 
    {
        System.out.println("Testing compiler");

        //instantiating customers
        Customer jane = new Customer("Jane", 45.25);
        Customer bob = new Customer("Bob", 33.14);

        //instantiating vending machines
        VendingMachine food = new VendingMachine("Food");
        VendingMachine drink = new VendingMachine("Drink");
        VendingMachine office = new VendingMachine("Office");

        //instantiating vending machines
        Snack chips = new Snack("Chips", 36, 1.75, food.getId());
        Snack chocolateBar = new Snack("Chocolate Bar", 36, 1.00, food.getId());
        Snack pretzel = new Snack("Pretzel", 30, 2.00, food.getId());
        Snack soda = new Snack("Soda", 24, 2.50, drink.getId());
        Snack water = new Snack("Water", 20, 2.75, drink.getId());

        jane.buySnack(soda.getCost(), 3);
        soda.buySnack(3);
        
        System.out.println(jane.getCashOnHand());
        System.out.println(soda.getQuantity());

        jane.buySnack(pretzel.getCost(), 1);
        pretzel.buySnack(1);

        System.out.println(jane.getCashOnHand());
        System.out.println(pretzel.getQuantity());
        
        bob.buySnack(soda.getCost(), 2);
        soda.buySnack(2);

        System.out.println(bob.getCashOnHand());
        System.out.println(soda.getQuantity());

        jane.addCash(10);

        System.out.println(jane.getCashOnHand());

        jane.buySnack(chocolateBar.getCost(), 1);
        chocolateBar.buySnack(1);

        System.out.println(jane.getCashOnHand());
        System.out.println(chocolateBar.getQuantity());

        pretzel.addQuanity(12);

        System.out.println(pretzel.getQuantity());

        bob.buySnack(pretzel.getCost(), 3);
        pretzel.buySnack(3);

        System.out.println(bob.getCashOnHand());
        System.out.println(pretzel.getQuantity());

    }   

    public static void main(String[] args)
    {
        workWithData();
    }
}