/**
 * This is a class that tests the Card class.
 *
 *  Zuha Hassen
 *  05/25/2022
 */

public class CardTester
{
   /**
    * The main method in this class checks the Card operations for consistency.
    * @param args is not used.
    */
   public static void main(String[] args) {

      /* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */

      // Establish new cards
      Card aceHearts = new Card("ace", "hearts", 1);
      Card club = new Card("7", "clubs", 7);
      Card diamond = new Card("10", "diamonds", 10);
      Card spades = new Card("2", "spades", 2);

      // Test card 1 and methods
      System.out.println("**** Tests Card 1: ace of hearts ****");
      System.out.println("  rank: " + aceHearts.rank());
      System.out.println("  suit: " + aceHearts.suit());
      System.out.println("  pointValue: " + aceHearts.pointValue());
      System.out.println("  toString: " + aceHearts.toString());
      System.out.println();

      // Test card 2
      System.out.println("**** Tests Card 2: 7 of club ****");
      System.out.println("  rank: " + club.rank());
      System.out.println("  suit: " + club.suit());
      System.out.println("  pointValue: " + club.pointValue());
      System.out.println("  toString: " + club.toString());
      System.out.println();

      // Test card 3
      System.out.println("**** Tests Card 3: 10 of diamonds ****");
      System.out.println("  rank: " + diamond.rank());
      System.out.println("  suit: " + diamond.suit());
      System.out.println("  pointValue: " + diamond.pointValue());
      System.out.println("  toString: " + diamond.toString());
      System.out.println();
      
      
      //Test card 4
      System.out.println("**** Tests Card 4: 2 of spades ****");
      System.out.println("  rank: " + spades.rank());
      System.out.println("  suit: " + spades.suit());
      System.out.println("  pointValue: " + spades.pointValue());
      System.out.println("  toString: " + spades.toString());
      System.out.println();
      

      // Test matches() method
      System.out.println("**** matches Tests Cards 2 & 4 ****");
      if(club.matches(spades)){
          System.out.println("matching: true");
          System.out.println("not matching: false");
      } else{
          System.out.println("matching: false");
          System.out.println("not matching: true");
      }

   }
}
