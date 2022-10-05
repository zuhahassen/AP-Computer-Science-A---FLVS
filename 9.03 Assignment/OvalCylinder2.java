
/**
 * Purpose: To demonstrate polymorphism
 *
 * @author Zuha Hassen
 * @version 04/16/20222
 */

public class OvalCylinder2 extends Oval2
{
    // instance variables
    private int height;

    // Constructor for objects of class OvalCylinder
    public OvalCylinder2(int x, int y, int rad1, int rad2, int h)
    {
        // call superclass
        super(x, y, rad1, rad2);

        // initialize instance variables
        height = h;
    }

    public int getHeight()
    {
        return height;
    }
    
    public String getName(){
        return "Oval Cylinder";
    }
}