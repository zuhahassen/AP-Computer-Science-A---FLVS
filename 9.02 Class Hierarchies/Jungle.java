
/**
 * Purpose: A class hierarchy of simple terrains
 *
 * @author Zuha Hassen
 * @version 04/16/2022
 */
public class Jungle extends Terrain
{
    private int vines;
    
    public Jungle(int l, int w, int v){
        super(l, w);
        vines = v;
    }
    
    public int getVines(){
        return vines;
    }
    
    }

