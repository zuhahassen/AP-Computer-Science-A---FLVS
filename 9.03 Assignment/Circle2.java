
/**
 * Purpose: To demonstrate polymorphism
 *
 * @author Zuha Hassen
 * @version 04/16/20222
 */

public class Circle2
{
    // instance variables
    private int x;
    private int y;
    private int radius;

    // Constructor for objects of class Circle
    public Circle2(int p_x, int p_y, int r)
    {
        // initialize instance variables
        x = p_x;
        y = p_y;
        radius = r;
    }

    public int getRadius()
    {
        return radius;
    }
    
    public String getName(){
        return "Circle";
    }

    // Concatenates a String to show the center x, y point of the circle
    public String getCenter()
    {
         return "center is at (" + x + ", " + y + ")";
    }
}