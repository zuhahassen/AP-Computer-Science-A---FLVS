
/**
 * Purpose: A class hierarchy of simple terrains
 *
 * @author Zuha Hassen
 * @version 04/16/2022
 */
public class TropicalForest extends Forest
{
    private double windSpeed;
    
    public TropicalForest(int l, int w, int trees, double wS){
        super(l, w, trees);
        windSpeed = wS;
    }
    
    public double getSpeed(){
        return windSpeed;
    }
    
}
