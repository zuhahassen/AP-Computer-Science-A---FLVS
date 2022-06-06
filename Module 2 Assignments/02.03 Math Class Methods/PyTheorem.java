
/**
 * Purpose: To use Math class methods to calculate the hypotenuse of two right triangles.
 * @author Zuha Hassen
 * @version October 8th, 2021
 */
public class PyTheorem
{ 
     public static void main(String[] args)
    {
    int sideA = (int)(Math.random() * 18) + 5;
    int sideB = (int)(Math.random() * 18) + 5;
    int sideD = (int)(Math.random() * 18) + 5;
    int sideE = (int)(Math.random() * 18) + 5;

    double sideC = Math.sqrt(Math.pow(sideA, 2) + Math.pow(sideB, 2));
    double sideF = Math.sqrt(Math.pow(sideD, 2) + Math.pow(sideE, 2));

    
    System.out.println("Triangle 1" + "\t\t" + "Side 1: " + sideA + "\t\t" + "Side 2: " + sideB +"\t\t"+ "Hypotenuse: " + sideC);
    System.out.println("Triangle 2" + "\t\t" + "Side 1: " + sideD + "\t\t" + "Side 2: " + sideE +"\t\t"+ "Hypotenuse: " + sideF);
}
}