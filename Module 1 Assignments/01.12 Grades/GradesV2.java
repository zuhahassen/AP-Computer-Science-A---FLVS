
/**
 * Use arithmetic/assignment operators and the increment operator to caculate the average score of the tests scores.
 *
 * @author Zuha Hassen
 * @version October 5th, 2021
 */

public class GradesV2
{
    public static void main(String[ ] args)
    {
        //local variables
        int numTests = 0;      //counts number of tests
        int testGrade = 0;     //individual test grade
        int totalPoints = 0;   //total points for all tests
        double average = 0.0;  //average grade

     
        //calculate total points for all tests, average grade, and count the number of tests using individual test grades
        testGrade = 95;
        totalPoints += testGrade;
        numTests ++;
        average = ((double)totalPoints/numTests);
        
        System.out.println("Test # " + numTests + "    Test Grade: " + testGrade + "    Total Points: " + totalPoints + "     Average Score: " + average);
        
        
        testGrade = 73;
        totalPoints += testGrade;
        numTests ++;
        average = ((double)totalPoints/numTests);
        
        System.out.println("Test # " + numTests + "    Test Grade: " + testGrade + "    Total Points: " + totalPoints + "    Average Score: " + average);
        
        
        testGrade = 91;
        totalPoints += testGrade;
        numTests ++;
        average = ((double)totalPoints/numTests);
        
        System.out.println("Test # " + numTests + "    Test Grade: " + testGrade + "    Total Points: " + totalPoints + "    Average Score: " + average);
        
        
        testGrade = 82;
        totalPoints += testGrade;
        numTests ++;
        average = ((double)totalPoints/numTests);
        
        System.out.println("Test # " + numTests + "    Test Grade: " + testGrade + "    Total Points: " + totalPoints + "    Average Score: " + average);
        
        
        //additional test grades
        
        testGrade = 12;
        totalPoints += testGrade;
        numTests ++;
        average = ((double)totalPoints/numTests);
        
        System.out.println("Test # " + numTests + "    Test Grade: " + testGrade + "    Total Points: " + totalPoints + "    Average Score: " + average);
        
        
        testGrade = 0;
        totalPoints += testGrade;
        numTests ++;
        average = ((double)totalPoints/numTests);
        
        System.out.println("Test # " + numTests + "    Test Grade: " + testGrade + "     Total Points: " + totalPoints + "    Average Score: " + average);
        
        
        testGrade = 13;
        totalPoints += testGrade;
        numTests ++;
        average = ((double)totalPoints/numTests);
        
        System.out.println("Test # " + numTests + "    Test Grade: " + testGrade + "    Total Points: " + totalPoints + "    Average Score: " + average);
        
        
        testGrade = 50;
        totalPoints += testGrade;
        numTests ++;
        average = ((double)totalPoints/numTests);
        
        System.out.println("Test # " + numTests + "    Test Grade: " + testGrade + "    Total Points: " + totalPoints + "    Average Score: " + average);
        
        
        testGrade = 100;
        totalPoints += testGrade;
        numTests ++;
        average = ((double)totalPoints/numTests);
        
        System.out.println("Test # " + numTests + "    Test Grade: " + testGrade + "   Total Points: " + totalPoints + "    Average Score: " + average);
        
    }//end of main method
}//end of class