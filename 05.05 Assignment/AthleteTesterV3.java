
/**
 * Purpose: AthleteTesterV3 client class
 *
 * @author Zuha Hassen
 * @version 1/4/2022
 */
public class AthleteTesterV3
{

   public static void main (String[] args) {
       
       String day = "Tuesday";
       double mile = 22.8;
       double timeMin = 120.2;
       double runSpeed = 0.0;
       
       AthleteV3 sprinter = new AthleteV3();
       
       runSpeed = sprinter.runningSpeed(mile, timeMin);
       sprinter.displayRunningStats(day, mile, timeMin,runSpeed);
    
   }
    
}
