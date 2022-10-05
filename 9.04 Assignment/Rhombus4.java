
/**
 * This class defines a Rhombus object by extending
 * Square.
 * The toString method has been added.
 *
 * @author Zuha Hassen
 * @version 04/16/2022
 */
public class Rhombus4 extends Square4
{
    public Rhombus4(int l, int w){
        super(l, w);
    }
    
    public String toString()
    {
        return "Rhombus- " + getLength() + " X " + getWidth() + " X ";
    }
    
    public boolean equals (Object b){
        if( ! (b instanceof Rhombus4)){
            return false;
        }
        Square4 t = (Rhombus4)b;
        return t.getLength() == getLength() && t.getWidth() == getWidth();
    }
}
