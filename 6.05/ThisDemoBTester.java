/**
 * This class demonstrates local variables and
 * instance variables with different names.
 *
 * @author Alan Turing
 * @version 06/14/17
 */

class ThisDemoB
{
    private String myName;    //this name is an instance variable

    ThisDemoB()
    {
    }

    ThisDemoB(String name)   //that name is a local variable
    {
        myName = name;
    }

    public void setName(String name)  //that name is a local variable
    {
        myName = name;
    }

    public String getName()
    {
        return myName;
    }
}

public class ThisDemoBTester
{
    public static void main(String[] args)
    {
        System.out.println("Test the constructor: ");

        ThisDemoB try3 = new ThisDemoB("Whitfield Diffie");
        System.out.println(try3.getName() + " is a famous cryptographer.");


        System.out.println("\nTry again with setName method: ");

        ThisDemoB try4 = new ThisDemoB();
        try4.setName("Whitfield Diffie");
        System.out.println(try4.getName() + " is a famous cryptographer.");
    }
}