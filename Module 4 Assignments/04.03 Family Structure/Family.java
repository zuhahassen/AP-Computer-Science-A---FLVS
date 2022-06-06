/**
 * Purpose: To calculate the the probability that a family with two children 
 * will consist of two boys, a boy and a girl, or two girls using a data file. 
 *
 * @author Zuha Hassen 
 * @version 12/8/2021
 */

import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class Family
{
    public static void main(String[] args) throws IOException
    {
      int girlGirl = 0;
      int boyBoy = 0;
      int boyGirl = 0;
      int totalFamilies = 0;
      
      String token = "";
      File fileName = new File("familyMembers.txt");
      Scanner inFile = new Scanner(fileName);


      //while loop will continue while inFile has a next token to read
      while (inFile.hasNext())
      {
         token = inFile.next();      //read next token from file
         totalFamilies++;
         if(token.equalsIgnoreCase("BB")) {
             boyBoy++;
         }
         else if (token.equalsIgnoreCase("GG")){
             girlGirl++;
         } 
         else {
             boyGirl++;
         }
      }//end while
      
      inFile.close();  //close input file
      
      //calculate percent 
      double gG = ((((double)girlGirl * 100)/(double)totalFamilies));
      double bB = ((((double)boyBoy * 100)/(double)totalFamilies));
      double bG = ((((double)boyGirl* 100)/(double)totalFamilies));
      
      //round the percentages
      double gGPercent = (int)(100* gG)/100.0;
      double bBPercent = (int)(100* bB)/100.0;
      double bGPercent = (int)(100* bG)/100.0;
      
      
      // print 
      System.out.println(" Composition Statistics for families with two children.");
      System.out.println("\n Total number of families: " + totalFamilies);
      System.out.println("\n Number of families with ");
      System.out.println("\t 2 boys: " + boyBoy + " represents " + bBPercent + "%");
      System.out.println("\t 2 girls: " + girlGirl + " represents " + gGPercent + "%");
      System.out.println("\t 1 boy and 1 girl: " + boyGirl + " represents " + bGPercent + "%");
    }//end of main method
}//end of class