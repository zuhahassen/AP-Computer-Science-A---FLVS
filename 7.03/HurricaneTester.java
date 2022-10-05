/**
 * Starter code for the Hurricane Tester
 * APCS Team 2020
 *
 */
 
import java.io.IOException;
import java.io.PrintWriter;
import java.io.File;
import java.util.Scanner;
import java.util.ArrayList;
public class HurricaneTester

{

    public static void main(String[] args) throws IOException
    {
        //read data from text file & put in an array
        File fileName = new File("hurricanedata.txt");
        Scanner inFile = new Scanner(fileName);
        int numValues = 0;
        
        //count number of lines in text file
        while (inFile.hasNextLine() )
        {
            inFile.nextLine();
            numValues++;
        }
        inFile.close();
        
        
        //initialize arrays based on lines counted in text file
        int [] years = new int[numValues];
        String [] months = new String[numValues];
        int [] pressures = new int[numValues];
        double [] windSpeeds = new double[numValues];
        String [] names = new String[numValues];
        
        //read and assign data from text file to the arrays
        inFile = new Scanner(fileName);
        int index = 0;
        while(inFile.hasNext() )
        {
            years[index] = inFile.nextInt();
            months[index] = inFile.next();
            pressures[index] = inFile.nextInt();
            windSpeeds[index] = inFile.nextDouble();
            names[index] = inFile.next();
            index++;
        }
        inFile.close();
        
        //convert the windspeed, determine categories, calculate sums
        
        //convert from knots to miles per hour
        for(int i = 0; i < windSpeeds.length; i++){
            windSpeeds[i] *= 1.15078;
        }
        
        //calculate categories
        int[] categories = new int[numValues];
        for(int i = 0; i < categories.length; i++){
                if(windSpeeds[i] >=74 && windSpeeds[i] < 96){
                    categories[i] = 1;
                }
                else if(windSpeeds[i] >= 96 && windSpeeds[i] < 111){
                    categories[i] = 2;
                }
                else if(windSpeeds[i] >= 111 && windSpeeds[i] < 130){
                    categories[i] = 3;
                }
                else if(windSpeeds[i] >= 130 && windSpeeds[i] < 157){
                    categories[i] = 4;
                }
                else if(windSpeeds[i] >= 157){
                    categories[i] = 5;
                }
        }
        
        
        //calculate the average category
        int categoryAvg = 0;
        for(int category : categories){
            categoryAvg += category;
        }
        
        categoryAvg /= categories.length;
        
        //calculate the maximum and minimum category value
        int categoryMax = Integer.MIN_VALUE;
        int categoryMin = Integer.MAX_VALUE;
        
        for(int category : categories){
            if (category > categoryMax){
                categoryMax = category;
            }
        }
        
        for(int category : categories){
            if (category < categoryMin){
                categoryMin = category;
            }
        }
        
        
        //calculate average pressure 
        int pressureAvg = 0;
        for(int pressure : pressures){
            pressureAvg += pressure; 
        }
        
        pressureAvg /= pressures.length;
        
        int pressureMax = Integer.MIN_VALUE;
        int pressureMin = Integer.MAX_VALUE;
        
        for(int pressure : pressures){
            if (pressure < pressureMin){
                pressureMin = pressure;
            }
        }
        
        for(int pressure : pressures){
            if (pressure > pressureMax){
                pressureMax = pressure;
            }
        }
        
        
        int speedAvg = 0;
        for(double speed: windSpeeds){
            speedAvg += speed;
        }
        
        speedAvg /= windSpeeds.length;
        
        
        double speedMax = Double.MIN_VALUE;
        double speedMin = Double.MAX_VALUE;
        
        for(double speed: windSpeeds){
            if(speed > speedMax){
                speedMax = speed;
            }
        }
        
        for(double speed: windSpeeds){
            if(speed < speedMin){
                speedMin = speed;
            }
        }
        
        
        int category1 = 0;
	int category2 = 0;
	int category3 = 0;
	int category4 = 0;
	int category5 = 0;
	
	for(int category : categories){
	         if(category == 1){
			category1++;
		 }
		 else if(category == 2){
			category2++;
		 }
	         else if(category == 3){
		        category3++;
		 }
		 else if(category == 4){
		        category4++;
		 }
		 else if(category == 5){
			category5++;
		 }	
		}
        

        
        
        
        
        
        
        //create a Hurricane ArrayList using the data above
        
        ArrayList<Hurricane> list = new ArrayList();
        for (int i = 0; i <= numValues; i++){
              list.add(new Hurricane(years[i],names[i],months[i],categories[i],pressures[i],windSpeeds[i]));
        }
        
        
        //user prompted for range of years
        
        
        //print the data
        
        
        
     }
}