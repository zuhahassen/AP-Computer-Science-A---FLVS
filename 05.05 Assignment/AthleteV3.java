
/**
 * Purpose: Athlete V3 Implementation Class
 *
 * @author Zuha Hassen
 * @version 1/4/2022
 */
public class AthleteV3
{
    
    public AthleteV3()
    {
        
    }

    public double runningSpeed(double miles, double time)
    {
        double milesRun = miles;
        double timeToRun = time;
        double hour = timeToRun/60.0;
        double speed = (milesRun/hour);
        speed = (int)(speed * 100.0)/100.0;
        return speed;
    }
    
    public void displayRunningStats(String day, double milesRun, double timeToRun, double speed){
        System.out.println("\t\t\t " + day);
        System.out.println();
        System.out.println("\tMiles(m)     Time(minutes)    Speed(mph) \t\t");
        System.out.println("---------------------------------------------------------");
        System.out.println("\t"+ milesRun + "\t\t" + timeToRun + "\t\t" + speed);
    }
}
