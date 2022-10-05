/**
 * Purpose: Athlete V8 Implementation Class
 *
 * @author Zuha Hassen
 * @version 1/6/2022
 */
public class AthleteV8
{
    private String day;
    private double milesRun;
    private double timeToRun;

    public AthleteV8()
    {
        
    }
    
    public AthleteV8(String day1){
        day = day1;
        milesRun = 0.0;
        timeToRun = 0.0;
    }
    
    public AthleteV8(String day1, double mile, double time) {
        day = day1;
        milesRun = mile;
        timeToRun = time;
    }

    public String getDay(){
        return day;
    }
    
    public double getMiles(){
        return milesRun;
    }
    
    public double getTime(){
        return timeToRun;
    }
    
    public void setDay(String day1){
        day = day1;
    }
    
    public void setMiles(double mile){
        milesRun = mile;
    }
    
    public void setTime(double time){
        timeToRun = time;
    }
    
    public double runningSpeed()
    {
        double speed = 0.0;
        double hour = timeToRun/60.0;
        speed = (milesRun/hour);
        speed = (int)(speed * 100.0)/100.0;
        return speed;
    }
    
    
    public double runningSpeed(int timeToRun, int milesRun)
    {
        double speed = 0.0;
        double hour = timeToRun/60.0;
        speed = (milesRun/hour);
        speed = (int)(speed * 100.0)/100.0;
        return speed;
    }
    
    
    public double runningSpeed(double timeToRun, double milesRun)
    {
        double speed = 0.0;
        double hour = timeToRun/60.0;
        speed = (milesRun/hour);
        speed = (int)(speed * 100.0)/100.0;
        return speed;
    }
}
