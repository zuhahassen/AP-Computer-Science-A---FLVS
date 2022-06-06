/**
 * Purpose: Prompt the user to input information to buy movie tickets and then provide a receipt.
 * @author Zuha Hassen
 * @version October 25th, 2021
 */

import java.util.Scanner;           //import methods of the Scanner class
public class BuyMovieTickets {
    public static void main(String[ ] args) {
        
        Scanner in = new Scanner(System.in);

        System.out.println("Good Evening.");
        
        System.out.print("Please enter your first and last name: ");  //user is prompted to input their name
        String userName = in.next();
        userName += in.nextLine();
        
        System.out.print("Enter today's date (mm/dd/yyyy): ");  //user is prompted to input the date
        String todaysDate = in.next();
        todaysDate += in.nextLine();
        
        System.out.print("What movie would you like to see? ");  //user is prompted to input the movie they want to watch
        String movieName = in.next();
        movieName += in.nextLine();
        
        System.out.print("How many tickets? ");  //user is prompted to input the number of tickets they'll purchase
        String numberOfTickets = in.next();
        numberOfTickets += in.nextLine();
        
        System.out.print("What is the ticket price ($)? "); //user is prompted to input the price of one ticket
        String ticketPrice = in.next();
        ticketPrice += in.nextLine();
        
        System.out.print("Enter your debit card number (#####-###-####): ");  //user is prompted to input their credit card number
        String debitCard = in.next();
        debitCard += in.nextLine();
        
        System.out.print("Enter your PIN (#####): ");   //user is prompted to input their pin number
        String pinNumber = in.next(); 
        pinNumber += in.nextLine();
        
        System.out.println();
        
        String row = "*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*";  //border
        
        System.out.println(row); //separates the e-receipt 
        System.out.println(row);
        
        
        
        //intialize variables for the e-receipt
        int indexOfSpace = userName.indexOf(" ");   ///finds the index of the space that separates the user's first name from last name
        String firstName = userName.substring(0, indexOfSpace); 
        String lastName = userName.substring(indexOfSpace +1);
        String name = firstName.substring(0,1) + ". "+ lastName; //first intial of the user's last is combined with their last name
        
        String newDate = todaysDate.replace("/", "-"); // changes the dates format
        
        int nameLength = lastName.length();
        String orderNumber = ("Order number: " + lastName.substring(nameLength-2, nameLength)+ debitCard.substring(6,9) +"\n"); //order number is composed of last name + digits of the user's debit card
        
        String price = ticketPrice.replace("$", ""); //removes dollar sign
        double ticket = Double.parseDouble(price); //converts a string into a double 
        
        int totalOfTickets = Integer.parseInt(numberOfTickets); 
        double amount = ticket * totalOfTickets; 
        String totalAmount = ("$" + amount);

        
        
        // declaring the variables 
        System.out.println("Your e-Receipt \n");
        
        System.out.println(newDate);
        
        System.out.println(orderNumber);
      
        System.out.println("   " + name);
        
        System.out.println("   Account: " + "#####-###-" + debitCard.substring(10));
        
        System.out.println("   Movie: " + movieName);
        
        System.out.println("   Number of Tickets: " + numberOfTickets);
        
        System.out.println("   Ticket Prices: " + ticket + "\n");

        System.out.println("   " + totalAmount + " will be debited to your account. \n");
        
        System.out.println("   Thank you. Enjoy your movie tonight.");
        
        System.out.println(row);
        System.out.println(row);
    }
    }