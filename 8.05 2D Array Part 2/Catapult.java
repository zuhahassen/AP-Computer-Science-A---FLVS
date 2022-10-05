
/**
 * Purpose: To calculate trajectory of a projectile based on launch angles and launch velocities
 *
 * @author Zuha Hassen
 * @version 04/15/2022
 */
public class Catapult {

    private double velocity;
    private double degrees;
    private double distance;

    public Catapult(double v, double d) {
        velocity = v;
        degrees = d;
    }

    public void setVelocity(double v){
        velocity = v;
    }
    
    public double getVelocity(){
        return velocity;
    }
    
    public void setDegrees(double d){
        degrees = d;
    }

    public double getDegrees(){
        return degrees;
    }
    
    public void setDistance(double dis){
        distance = dis;
    }

    public double getDistance(){
        return distance;
    }

    public void calcDistance(){
        distance = (Math.pow(velocity, 2) * Math.sin( 2 * Math.toRadians(degrees)) / 9.8);
    }

}