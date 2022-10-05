
/**
 * Purpose: A class hierarchy of simple terrains
 *
 * @author Zuha Hassen
 * @version 04/16/2022
 */
public class GameTerrainTester
{
    public static void main(String []args)
    {
        
        Terrain one = new Terrain(400, 900);
        Mountain two = new Mountain(800, 900, 230);
        Forest three = new Forest(200, 450, 502);
        WinterMountain four = new WinterMountain(500, 800, 90, 12.98);
        Jungle five = new Jungle(700, 350, 40);
        TropicalForest six = new TropicalForest(650, 280, 67, 15.56);
        
        System.out.println(one.getTerrainSize());
        System.out.println();
        System.out.println("Mountain " + two.getTerrainSize() + " and has " + two.getMountains() + " mountains");
        System.out.println();
        System.out.println("Forest " + three.getTerrainSize() + " and has " + three.getTrees() + " trees");
        System.out.println();
        System.out.println("Winter Mountain " + four.getTerrainSize() + " and has " + four.getMountains() + " mountains and temperature " + four.getTemp() + " degrees");
        System.out.println();
        System.out.println("Jungle " + five.getTerrainSize() + " and has " + five.getVines() + " vines");
        System.out.println();
        System.out.println("Tropical Forest " + six.getTerrainSize() + " and has " + six.getTrees() + " trees and wind speed " + six.getSpeed() + " mph");
        
    }
}
