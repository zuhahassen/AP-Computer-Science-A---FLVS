/**
 * The Currency class converts an amount of money from a specific
 * country into the equivalent currency of another country given 
 * the current exchange rate.
 *
 * @author Zuha Hassen
 * @version October 6th, 2021
 */
public class CurrencyV1
{
    public static void main(String [ ] args)
    {
        //Declare and initialize local variables
        double startingUsDollars = 6500.00;        // starting US Dollars

        double pesosSpent = 7210.25;            // Mexican Pesos spent
        double pesoExchangeRate = 19.57852;     // 1 US dollar = 19.57852 Pesos
        double dollarsSpentInMexico = pesosSpent / pesoExchangeRate;      // US dollars spent in Mexico
        double dollarsAfterMexico = startingUsDollars - dollarsSpentInMexico;        // US dollars remaining after Mexico
        //remaining variables below here
        
        double eurosSpent = 1457.89;   // Austrian Euros spent
        double euroExchangeRate = 0.861535; // 1 US dollar = 0.861535 Euros
        double dollarsSpentInAustria = eurosSpent / euroExchangeRate; // US dollars spent in Austria
        double dollarsAfterAustria = dollarsAfterMexico - dollarsSpentInAustria; // US dollars remaining after Austria
        
        double yuanSpent = 2740.17; // Chinese Yuan spent
        double yuanExchangeRate = 6.454789; // 1 US dollar = 6.454789 Yuan
        double dollarsSpentInChina = yuanSpent / yuanExchangeRate; // US dollars spent in China
        double dollarsAfterChina = dollarsAfterAustria - dollarsSpentInChina; // US dollars remaining after China
        
        double yenSpent = 377178.46; // Japanese Yen spent
        double yenExchangeRate = 111.1264; // 1 US dollar = 111.1264 Yen
        double dollarsSpentInJapan = yenSpent / yenExchangeRate; // US dollars spent in Japan
        double dollarsAfterJapan = dollarsAfterChina - dollarsSpentInJapan; // US dollars remaining after Japan
        

        // Message to user stating purpose
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("This program converts an amount of money");
        System.out.println("from a specific country into the equivalent");
        System.out.println("currency of another country given the current");
        System.out.println("exchange rate.");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println();

        // Conversion
        // code goes below here
        
        System.out.println("Starting US dollars: " + "\t\t" + startingUsDollars);
        System.out.println();
        
        
        System.out.println("Mexico: ");
        System.out.println("   Pesos spent: " + "\t\t" + pesosSpent);
        System.out.println("   US dollars equivalent: " + "\t" + dollarsSpentInMexico);
        System.out.println("   US dollars remaining: " + "\t" + dollarsAfterMexico);
        System.out.println();
        

        System.out.println("Austria: ");
        System.out.println("   Euros spent: " + "\t\t" + eurosSpent);
        System.out.println("   US dollars equivalent: " + "\t" + dollarsSpentInAustria);
        System.out.println("   US dollars remaining: " + "\t" + dollarsAfterAustria);
        System.out.println();
        
        
        System.out.println("China: ");
        System.out.println("   Yuan spent: " + "\t\t\t" + yuanSpent);
        System.out.println("   US dollars equivalent: " + "\t" + dollarsSpentInChina);
        System.out.println("   US dollars remaining: " + "\t" + dollarsAfterChina);
        System.out.println();
        
        
        System.out.println("Japan: ");
        System.out.println("   Yen spent: " + "\t\t\t" + yenSpent);
        System.out.println("   US dollars equivalent: " + "\t" + dollarsSpentInJapan);
        System.out.println("   US dollars remaining: " + "\t" + dollarsAfterJapan);
        
        
        System.out.println("====================================================");
        System.out.println("Remaining US dollars: " + "\t\t" + dollarsAfterJapan);
        System.out.println();
        System.out.println();


        // Complete the code below for Souvenir Purchases
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Souvenir Purchases");
        System.out.println(" (all values in US Dollars) ");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        //Calculations for Souvenir #1
        int costItem1 = 12;                          //cost per item of first souvenir
        int budget1 = 100;                           //budget for first item
        int totalItems1 = (int)(budget1/costItem1);         //how many items can be purchased
        int fundsRemaining1 = budget1 % costItem1;  //how much of the budget is left

        System.out.println("Item 1");
        System.out.println("   Cost per item: $" + costItem1 );
        System.out.println("   Budget: $"+ budget1);
        System.out.println("   Total items purchased: " +  totalItems1);
        System.out.println("   Funds remaining: $"  +  fundsRemaining1);
         System.out.println();

        //Calculations for Souvenir #2
        double costItem2 = 29.99;                          //cost per item of second souvenir
        int budget2 = 500;                               //budget for second item
        int totalItems2 = (int)(budget2/costItem2);     //how many items can be purchased
        double fundsRemaining2 = budget2 % costItem2;      //how much of the budget is left

        System.out.println("Item 2");
        System.out.println("   Cost per item: $" + costItem2 );
        System.out.println("   Budget: $"+ budget2);
        System.out.println("   Total items purchased: " +  totalItems2);
        System.out.println("   Funds remaining: $"  +  fundsRemaining2);
    } // end of main method
} // end of class

