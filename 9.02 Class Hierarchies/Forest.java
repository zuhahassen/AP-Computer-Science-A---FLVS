
/**
 * Purpose: A class hierarchy of simple terrains
 *
 * @author Zuha Hassen
 * @version 04/16/2022
 */
public class Forest extends Terrain
{
    // instance variables - replace the example below with your own
    private int trees;
    
    public Forest(int l, int w, int t){
        super(l, w);
        trees = t;
    }
    
    public int getTrees(){
      return trees;
    }
}
