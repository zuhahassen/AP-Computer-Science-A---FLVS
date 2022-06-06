/**
 * Purpose: To write a program that can generate random/secret passwords when the length is selected by the user
 * @author Zuha Hassen
 * @version 12/27/2021
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.io.File;
import java.util.Scanner;

public class SecretPasscode
{
    public static void main(String [] args) throws IOException
    {
        String userChoice = "Y";
        int pwLength = 0;
        int randNum = 0; 
        int y = 0;
        String password = "";

	// initialize scanner and print writer
        Scanner in = new Scanner(System.in);
        PrintWriter outFile = new PrintWriter(new File("password.txt"));
        File fileName = new File("password.txt");
        String token = "";
        Scanner inFile = new Scanner(fileName);

        
        System.out.println("**********************************************************");
        System.out.println("Welcome to a simple password generator. \nThe password will include lowercase, uppercase, & numbers.");
	System.out.print("Enter a password length (6 or more): ");
	pwLength = in.nextInt();
	
        while (pwLength < 6) {
	    System.out.print("\tPassword length too short. Please try again. \nEnter a password (6 or more): ");
            pwLength = in.nextInt();	    
         }
        for (int x = 0; x <= pwLength; x++) {
            randNum = (int)(Math.random() * (93))+ 33;
            password += (char)(randNum);
        }
        outFile.println(password);
        
        
        System.out.println(" \n");
        System.out.print("A password has been written to the text files \nWould you like to generate another password? Y/N ");
        String userPw = in.next();
        
        if (!userPw.equalsIgnoreCase("Y") || !userPw.equalsIgnoreCase("N")){
            System.out.println();
            System.out.println("That is not a valid choice. Please select Y or N.");
            System.out.print("Would you like to generate another password? Y/N ");
            userPw= in.next();
        }
        
        while (userPw.equalsIgnoreCase("Y")){
        System.out.print("Enter a password length (6 or more): ");
        int passwordLength = in.nextInt();
            
        while (passwordLength < 6) {
            System.out.print("\tPassword length too short. Please try again. \nEnter a password (6 or more): ");
            passwordLength = in.nextInt();
            }
        for (int x = 0; x <= pwLength; x++) {
            randNum = (int)(Math.random() * (93))+ 33;
            outFile.print((char)(randNum));
        }
        outFile.println();
        
        System.out.println("");
        System.out.print("A password has been written to the text files \nWould you like to generate another password? Y/N ");
        userPw = in.next();
        }
        
        
        if (userPw.equalsIgnoreCase("N")){
            outFile.close();
            System.out.println();
            System.out.println("Thank you for using the Pass Code Generator.");
            System.out.println();
            System.out.println("Here are your randomly generated codes: ");
            while(inFile.hasNext()) {
                token = inFile.next();
                y++;
                System.out.println(y + ". " + token);
            }
            inFile.close();
        } 

  }//end main
}//end class

