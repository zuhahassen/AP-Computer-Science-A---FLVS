
/**
 * Purpose: To demonstrate polymorphism
 *
 * @author Zuha Hassen
 * @version 04/16/20222
 */

public class Cylinder2 extends Circle2
{
    // instance variables
    private int height;

    // Constructor for objects of class Cylinder
    public Cylinder2(int x, int y, int rad, int h)
    {
        // call superclass
        super(x, y, rad);

        // initialize instance variables
        height = h;
    }

    public int getHeight()
    {
        return height;
    }
    
    public String getName(){
        return "Cylinder";
    }
}

