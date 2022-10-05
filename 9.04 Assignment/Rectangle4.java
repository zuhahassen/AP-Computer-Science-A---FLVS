
/**
 * This class defines a Rectangle object using
 * length and width.
 * The toString method has been added.
 *
 *
 * @author Zuha Hassen
 * @version 04/16/2022
 */
public class Rectangle4
{
    // instance variables
    private int length;
    private int width;

    // Constructor for objects of class Rectangle
    public Rectangle4(int l, int w)
    {
        // initialize instance variables
        length = l;
        width = w;
    }

    // return the height
    public int getLength()
    {
        return length;
    }

    // return the width
    public int getWidth()
    {
        return width;
    }

    // String to display when object is printed.
    
    public String toString()
    {
        return "Rectangle- " + length + " X " + width;
    }
    
    public boolean equals (Object b){
        if( ! (b instanceof Rectangle4)){
            return false;
        }
        Rectangle4 t = (Rectangle4)b;
        return t.getLength() == getLength() && t.getWidth() == getWidth();
    }
}
