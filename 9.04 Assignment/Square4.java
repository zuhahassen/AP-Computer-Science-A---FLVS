
/**
 * This class defines a Square object by extending
 * Rectangle.
 * The toString method has been added.
 *
 * @author Zuha Hassen
 * @version 04/16/2022
 */
public class Square4 extends Rectangle4
{
    public Square4(int l, int w){
        super(l, w);
    }
    
    public String toString()
    {
        return "Square- " + getLength() + " X " + getWidth() + " X ";
    }
    
    public boolean equals (Object b){
        if( ! (b instanceof Square4)){
            return false;
        }
        Square4 t = (Square4)b;
        return t.getLength() == getLength() && t.getWidth() == getWidth();
    }
}
