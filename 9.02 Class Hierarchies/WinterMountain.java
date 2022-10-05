
/**
 * Purpose: A class hierarchy of simple terrains
 * 
 * @author Zuha Hassen
 * @version 04/16/2022
 */
public class WinterMountain extends Mountain
{
    
    private double temperature;

    
    public WinterMountain(int l, int w, int mountains, double t)
    {
        super(l, w, mountains);
        temperature = t;
    }
    
    public double getTemp(){
        return temperature;
    }
     
    
    
}
