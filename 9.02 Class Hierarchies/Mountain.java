
/**
 * Purpose: A class hierarchy of simple terrains
 *
 * @author Zuha Hassen
 * @version 04/16/2022
 */
public class Mountain extends Terrain
{
    // instance variables - replace the example below with your own
    private int mountains;
    
    public Mountain(int l, int w, int m){
        super(l, w);
        
        mountains = m;
    }
    
    public int getMountains(){
        return mountains;
    }
}
