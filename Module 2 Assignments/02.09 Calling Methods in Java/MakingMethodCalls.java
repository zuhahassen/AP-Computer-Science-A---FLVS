/**
 * Instruction: Without modifying any of the method signatures, correct add method calls to the already created methods in the main() below 
 * Purpose: To call void and return methods, in the main method
 * APCS Team 2020 (Edited by: Zuha Hassen)
 * Date: October 22th, 2021
 *
 */ 
 public class MakingMethodCalls

{
    public static void addTheseTwo()
    {
        System.out.println("Ten plus five equals " + (10 + 5));
    }   
    
    public static void multiplyTheseTwo(int a, int b)
    {
        System.out.println("Ten times five equals " + (a * b));
    }  
    
    public static int divideTheseTwo(int a, int b)
    {
        return (a / b);
    }    
    
    public static void main(String[] args)
    {
        int x = 10;
        int y = 5;
        
        /**
         * Insert code here that calls one of the above methods that results in.
         * computer printing out "Ten plus five equals 15"
         */
        
        addTheseTwo();

        /**
         * Insert code here that calls one of the above methods that results in.
         * computer printing out "Ten times five equals 50"
         */
        
        multiplyTheseTwo(x,y);
 
        /**
         * Insert code here that calls one of the above methods that results in.
         * computer printing out "Ten divided by five equals 2"
         */
        
        int answer = divideTheseTwo(x,y);
        System.out.println("Ten divided by five equals " + answer);

    }//end of main method
}//end of class
