
/**
 * Purpose: To demonstrate polymorphism
 *
 * @author Zuha Hassen
 * @version 04/16/20222
 */
import java.util.ArrayList;
public class CircleTesterV2
{
     public static void main(String []args)
    {
        ArrayList<Circle2> circles = new ArrayList<Circle2>();
        
        circles.add(new Circle2(10,12,5));
        circles.add(new Oval2(13,16,4,2));
        circles.add(new Cylinder2(18,10,1,3));
        circles.add(new OvalCylinder2(12,17,15,6,2));
        
        for(Circle2 c: circles){
            showCenter(c);
        }
        
        
    }
    
    public static void showCenter(Circle2 c){
        System.out.print("For this " + c.getName() + " the ");
        System.out.println(c.getCenter());
    }
    
}
