package javaSnackbar;

public class VendingMachine
{
    //varible types
    private static int maxId = 0;
    private int id;
    private String name;

    //constuctor
    public VendingMachine(String name)
    {
        maxId++;
        id = maxId;

        this.name = name;
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