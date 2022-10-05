
/**
 * This class demonstrates classes that override
 * the toString method.
 *
 * @author Zuha Hassen
 * @version 04/16/2022
 */
import java.util.*;
public class ShapesTester4
{
    public static void main(String []args)
    {
        Rectangle4 one = new Rectangle4(5, 20);
        Rectangle4 two = new Box4(4, 10, 5);
        Rectangle4 three = new Box4(4, 4, 4);
        Rectangle4 four = new Cube4(4, 4, 4);
        Rectangle4 five = new Square4(3,3);
        Rectangle4 six = new Rectangle4(9, 16);
        Rectangle4 seven = new Rhombus4(8, 8);

        //Print all shapes
        ArrayList<Rectangle4> shapes = new ArrayList<Rectangle4>();

        shapes.add( one );
        shapes.add( two );
        shapes.add( three );
        shapes.add( four );
        shapes.add( five );
        shapes.add( six );
        shapes.add( seven );
        
        System.out.println("My shapes: \n");
    
        for(Rectangle4 rect: shapes)
        {
            //System.out.println(rect);
            showEffectBoth(rect);
            System.out.println();
        }
        
        System.out.println("\n\nTest for equality: \n");
        compare(three, four);
        compare(seven, one);
    }

    public static void showEffectBoth(Rectangle4 r)
    {
        System.out.println(r);
    }
    
    public static void compare(Rectangle4 r1, Rectangle4 r2){
        if(r1.equals(r2) == true){
            System.out.println(r1.toString() + " IS the same size as " + r2.toString());
        } else{
            System.out.println(r1.toString() + " IS NOT the same size as " + r2.toString());
        }
    }

}
