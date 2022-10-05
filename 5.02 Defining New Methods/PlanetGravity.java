/**
 * Purpose: To calculate the surface gravity (g) of a planet in our solar system
 *
 * @author Zuha Hassen
 * @version 12/30/2021
 */
public class PlanetGravity
{
    public static double[]planetGravity (double [] kg, double [] km) {
        double gravitationalConstant = 6.67E-11;
        double []radius = new double[km.length];
        for (int i = 0; i< radius.length;i++){
            radius [i] = (km[i] * 1000)/2.0;
        }
        double []gravity = new double[8];
        for (int i = 0; i < gravity.length; i++) {
            gravity[i] = ((gravitationalConstant * kg[i]) / (Math.pow(radius[i],2)));
            gravity[i] = (int)(100.0 * gravity[i])/100.0;
        }
        return gravity;
    }
    
    public static void header(){
        System.out.println("\t\t\t\t\t\t\tPlanetary Data");
        System.out.println("\t\t   Planet \t\t Diameter(km) \t\t  Mass(kg) \t\t g(m/s^2)");
        System.out.println("---------------------------------------------------------------------------------------------------------------------");
    }
    
    public static void data (String[] planet, double []kg, double []km, double []surfaceGravity){
       for (int i = 0; i < 8; i++){
           System.out.println(" \t\t   " + planet[i] + " \t\t   " + km[i] + " \t\t   " + kg[i] +" \t\t   " + surfaceGravity[i]);
       }
    }
    
     public static void main(String[]args) 
    {
        String [] planet = {"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune"};
        double [] kg = {3.30E+23,4.869E+24,5.972E+24,6.4219E+23,1.900E+27,5.68E+26,8.683E+25,1.0247E+26};
        double [] km = {4880,12103.6,12756.3,6794,142984,120536,51118,49532};
        double [] surfaceGravity = planetGravity(kg, km);
        header();
        data(planet, kg, km, surfaceGravity);
    }
}
