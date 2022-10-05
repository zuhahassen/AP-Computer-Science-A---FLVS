/**
 * This class demonstrates local variables and
 * instance variables with the same name.
 *
 * @author Alan Turing
 * @version 06/14/17
 */

class ThisDemoA
{
    private String name;    //this name is an instance variable

    ThisDemoA()
    {
    }

    ThisDemoA(String name) //that name is a local variable
    {
        name = name;
    }

    public void setName(String name) //that name is a local variable
    {
      name = name;
    }

    public String getName()
    {
        return name;
    }
}


public class ThisDemoATester
{
    public static void main(String[] args)
    {
        System.out.println("Test the constructor: ");
        
        ThisDemoA try1 = new ThisDemoA("Whitfield Diffie");
        System.out.println(try1.getName() + " is a famous cryptographer.");


        System.out.println("\nTry again with setName method: ");

        ThisDemoA try2 = new ThisDemoA();
        try2.setName("Whitfield Diffie");
        System.out.println(try2.getName() + " is a famous cryptographer.");
    }
}



