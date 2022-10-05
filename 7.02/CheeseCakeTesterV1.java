/**
 * @purpose
 *
 * @author Zuha Hassen
 * @version 04/04/2022
 *
 */
import java.util.ArrayList;

public class CheeseCakeTesterV1
{
    public static void main(String[] args)
    {
        //initializing and declareing an ArrayList and adding in objects as elements
        ArrayList<CheeseCakeV1> cake = new ArrayList<CheeseCakeV1>();
            // add CheeseCake to the ArrayList
            cake.add(new CheeseCakeV1("Blueberry", 3));
            cake.add(new CheeseCakeV1("Cherry", 5));
            cake.add(new CheeseCakeV1("Vanilla", 4));
            cake.add(new CheeseCakeV1("Chocolate", 2));
            cake.add(new CheeseCakeV1("Straw", 7));
            cake.add(new CheeseCakeV1("Raspberry", 9));
        
        //calls several method for each object to perform calculations
        for(CheeseCakeV1 dataRecord : cake)
        {
            // invoke methods
            dataRecord.calcTotalServings();
            dataRecord.calcCreamCheese();
            dataRecord.calcSugar();
            dataRecord.calcVanilla();
        }
        
        //printing the format of the table
        System.out.println("|       Cheese Cake Data           |             Ingredient Calculations             |");
        System.out.println("| Index | Quantity |  Flavor       | Cream Cheese | Servings |   Sugar   |  Vanilla  |");
        System.out.println("|-------|----------|---------------|--------------|----------|-----------|-----------|");

        CheeseCakeV1 dataRecord;
        
        //using a for loop to print out the objects' data
        for(CheeseCakeV1 ck : cake)
        {
            // print each CheeseCake's data
            System.out.printf("%s %3d %3s %5s %3s %5d %-1s %5s %6d %3s", "|", cake.indexOf(ck), "|", ck, "|", ck.getCreamCheese(), "oz", "|", ck.getServings(), "|");
            System.out.printf("%4.2f %s %2s %3d %3s %2s %n", ck.getSugar(), "cups", "|", ck.getVanilla(), "tsps", "|");
        }
    }
}
