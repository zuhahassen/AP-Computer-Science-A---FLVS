/**
 * Purpose: To calculate the user's BMI and determine their BMI category, when given user's weight and height.
 * @author Zuha Hassen
 * @version 10/28/2021
 */

import java.util.Scanner;
public class BMI
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);

        //Gather Input
        System.out.print("Enter your name (first last): ");
        String name = in.next();
        name += in.nextLine();

        System.out.print("Enter your weight in pounds (e.g. 175): ");
        String weightLbs = in.next();
        weightLbs += in.nextLine();

        System.out.print("Enter your height in feets and inches (e.g. 5 11): ");
        String heightFt = in.next();
        heightFt += in.nextLine();
        
        int indexOfSpace = heightFt.indexOf(" ");
        String feet = heightFt.substring(0, indexOfSpace); 
        String inches = heightFt.substring(indexOfSpace +1);

        
        //Parse numeric input
        int ft = Integer.parseInt(feet);
        int inch = Integer.parseInt(inches);
        int weightPounds = Integer.parseInt(weightLbs);

        int height = (12 * ft) + inch;
        
        
        //Convert height and weight
        double heightMeters = 0.0254 * height;
        double weightKg = 0.45359237 * weightPounds;
        
        double bMI= (weightKg) / (Math.pow(heightMeters, 2));

        
        String category;
        if (bMI < 18.5) {
            category = "Underweight";
        }
        else if (bMI <= 24.9){
            category = "Normal or Healthy Weight";
        }
        else if (bMI <= 29.9){
            category = "Overweight";
        }
        else {
            category = "Obese";
        }
        
            
        //Display results
        System.out.println(" ");
        System.out.println("Body Mass Index Calculator");
        System.out.println("==========================");
        System.out.println("Name: " + name);
 

        //Numeric values displayed to one decimal place
        System.out.println("Height (m): " + (int)(10 * heightMeters)/10.0 );
        System.out.println("Weight (kg): " + (int)(10 * weightKg)/10.0 );
        System.out.println("BMI: " + (int)(10 * bMI)/10.0 );
        System.out.println("Category: " + category);
    }
}