/**
 * This class demonstrates local variables and
 * instance variables with the same name and
 * utilizing the this prefix.
 *
 * @author Alan Turing
 * @version 06/14/17
 */

class ThisDemoC
{
    private String name;    //this name is an instance variable

    ThisDemoC()
    {
    }

    ThisDemoC(String name) //that name is a local variable
    {
        this.name = name;
    }

    public void setName(String name)  //that name is a local variable
    {
        this.name = name;
    }

    public String getName()
    {
        return this.name;
    }
}

public class ThisDemoCTester
{
    public static void main(String[] args)
    {
        System.out.println("Test the constructor: ");

        ThisDemoC try5 = new ThisDemoC("Whitfield Diffie");
        System.out.println(try5.getName() + " is a famous cryptographer.");


        System.out.println("\nTry again with setName method: ");

        ThisDemoC try6 = new ThisDemoC();
        try6.setName("Whitfield Diffie");
        System.out.println(try6.getName() + " is a famous cryptographer.");
    }
}