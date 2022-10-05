
/**
 * This class defines a Cube object by extending
 * Box and includes height.
 * The toString method has been added.
 *
 * @author Zuha Hassen
 * @version 04/16/2022
 */
public class Cube4 extends Box4
{
    public Cube4(int l, int w, int h){
        super(l, w, h);
    }
    
    public String toString()
    {
        return "Cube- " + getLength() + " X " + getWidth() + " X " + getHeight();
    }
    
    public boolean equals (Object b){
        if( ! (b instanceof Cube4)){
            return false;
        }
        Cube4 t = (Cube4)b;
        return t.getLength() == getLength() && t.getWidth() == getWidth() && t.getHeight() == getHeight();
    }
}
