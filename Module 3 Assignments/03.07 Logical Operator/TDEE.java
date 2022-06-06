/**
 * Purpose: To calculate total daily energy expenditure when given user's activity factor and basal metabolic rate.
 * @author Zuha Hassen
 * @version 10/29/2021
 */

import java.util.Scanner;
public class TDEE
{
    public static void main(String [ ] args) 
    {
        Scanner in = new Scanner(System.in);
        
        
        //Input
        System.out.print("Please enter your name: ");
        String name = in.next();
        name += in.nextLine();
        
        System.out.print("Please enter your BMR: ");
        String bMR = in.next();
        bMR += in.nextLine();
        
        System.out.print("Please enter your gender (M/F): ");
        String gender = in.next();
        gender += in.nextLine();
        
        String genderCase = gender.toUpperCase();
        
        double bMR2 = Double.parseDouble(bMR);
        
        
        //Menu
        System.out.println(" ");
        System.out.println("Select Your Activity Level");
        System.out.println("[A] Resting (Sleeping, Reclining)");
        System.out.println("[B] Sedentary (Restricted Mobility)");
        System.out.println("[C] Light (Sitting, Standing)");
        System.out.println("[D] Moderate (Light Manual labor, Dancing, Riding Bike)");
        System.out.println("[E] Very Active (Team Sports, Hard Manual Labor)");
        System.out.println("[F] Extremely Active (Full-time Athlete, Heavy Manual Labor)");
        System.out.println(" ");
        
        System.out.print("Enter the letter corresponding to your activity level: ");
        String choice = in.next();
        
        
    
        //Conditional Statements
        double activityFactor = 0;
        if (choice.equalsIgnoreCase("A")) {
            activityFactor = 1.0;
        } 
        
        else if (choice.equalsIgnoreCase("B")) {
            activityFactor = 1.3;
        }
        
        else if ((genderCase.compareToIgnoreCase("F") == 0) && (choice.equalsIgnoreCase("C"))) {
            activityFactor = 1.5;
        }
        
        else if ((genderCase.compareToIgnoreCase("M") == 0) && (choice.equalsIgnoreCase("C"))) {
           activityFactor = 1.6;
        }
        
        else if ((genderCase.compareToIgnoreCase("F") == 0) && (choice.equalsIgnoreCase("D"))){
            activityFactor = 1.6;
        }
        
        else if ((genderCase.compareToIgnoreCase("M") == 0) && (choice.equalsIgnoreCase("D"))){
            activityFactor = 1.7;
        }
        
        else if ((genderCase.compareToIgnoreCase("F") == 0) && (choice.equalsIgnoreCase("E"))){
            activityFactor = 1.9;
        }
        
        else if ((genderCase.compareToIgnoreCase("M") == 0) && (choice.equalsIgnoreCase("E"))){
            activityFactor = 2.1;
        }
        
        else if((genderCase.compareToIgnoreCase("F") == 0) && (choice.equalsIgnoreCase("F"))){
            activityFactor = 2.2;
        }
        
        else if((genderCase.compareToIgnoreCase("M") == 0) && (choice.equalsIgnoreCase("F"))){
            activityFactor = 2.4;
        }
        
        else {
            System.out.println(" ");
            System.out.println(" ");
            System.out.println("You did not choose a valid menu option. No calculation has been made.");
        }

    
        if (choice.equalsIgnoreCase("A") || choice.equalsIgnoreCase("B") || choice.equalsIgnoreCase("C") || choice.equalsIgnoreCase("D") || choice.equalsIgnoreCase("E") || choice.equalsIgnoreCase("F")) {
        double tDEE = activityFactor * bMR2;
        
        //Display
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("Your results: ");
        System.out.print("Name: " + name);
        System.out.println("\t\t Gender: " + genderCase);
        System.out.print("BMR : " + bMR2 + " calories");
        System.out.println("\t\t Activity Factor: " + activityFactor);
        System.out.println("TDEE: " + tDEE + " calories");  
        }   
    }
}