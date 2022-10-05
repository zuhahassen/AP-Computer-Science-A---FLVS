/**
 * Purpose: AthleteTesterV8 client class
 *
 * @author Zuha Hassen
 * @version 1/6/2022
 */
public class AthleteTesterV8
{

   public static void main (String[] args) {
       
       String day = "Tuesday";
       double mile = 22.8;
       double timeMin = 120.2;
       double runSpeed = 0.0;
       
       int mile2 = 15;
       int timeMin2 = 62;
       
       AthleteV8 sprinter = new AthleteV8();
       runSpeed = sprinter.runningSpeed(timeMin, mile);
       
        System.out.println("\t\t\t Sprinter" );
        System.out.println();
        System.out.println("Day\t      Miles(m)     Time(minutes)    Speed(mph) \t\t");
        System.out.println("---------------------------------------------------------");
        System.out.println(day + "\t\t"+ mile + "\t\t" + timeMin + "\t\t" + runSpeed);
        System.out.println("\n\n");
    
        
       AthleteV8 longdistancerunner = new AthleteV8("Sunday", 50.5, 210.9);
       runSpeed = longdistancerunner.runningSpeed();
       
        System.out.println("\t\t Long-Distance Runner" );
        System.out.println();
        System.out.println("Day\t       Miles(m)     Time(minutes)    Speed(mph) \t\t");
        System.out.println("---------------------------------------------------------");
        System.out.println(longdistancerunner.getDay() + "\t\t"+ longdistancerunner.getMiles() + "\t\t" + longdistancerunner.getTime() + "\t\t" + runSpeed);
        System.out.println("\n\n");
       
       AthleteV8 hurdler = new AthleteV8("Friday");
       runSpeed = hurdler.runningSpeed(timeMin2, mile2);
       
        System.out.println("\t\t\t Hurdler" );
        System.out.println();
        System.out.println("Day\t      Miles(m)     Time(minutes)    Speed(mph) \t\t");
        System.out.println("---------------------------------------------------------");
        System.out.println(hurdler.getDay() + "\t\t"+ mile2 + "\t\t" + timeMin2 + "\t\t" + runSpeed);
        System.out.println("\n\n");
    
   }
    
}
