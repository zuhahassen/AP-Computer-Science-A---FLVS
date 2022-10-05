/**
 * Annual Weather object class
 * 
 * @author Zuha Hassen
 * @version 02/9/2022
 */

public class CityWeatherV1 {
    // private instance variables - three arrays
 private String [] months;
 private double [] temperature;
 private double [] precipitation;
    // constructor with parameters
 public CityWeatherV1(String[] month, double[] temp, double[] precipitate){
     months = month;
     temperature = temp;
     precipitation = precipitate;
 }
 
 public String [] getMonths(){
     return months;
 }
 
 public double [] getTemperature(){
     return temperature;
 }
 
 public double [] getPrecipitation(){
     return precipitation;
 }
 
 public void setMonth(String[] month) {
     months = month;
 }
 
 public void setTemperature(double[] temp){
     temperature = temp;
 }
 
 public void setPrecipitation(double[] precipitate){
     precipitation = precipitate;
 }
 
 public double averageTemperature (){
     double average = 0.0;
     for(int i =0; i < temperature.length; i++){
         average += temperature[i];
     }
     average = average/temperature.length;
    
     return average;
 }

 public double annualPrecipitation (){
     double sum = 0.0;
     for(int i =0; i < precipitation.length; i++){
         sum += precipitation[i];
     }
     return sum;
 }
   
 
        
        

    // method to calculate temperature in Celsius (current index of temperature array passed as a parameter) - to be completed in 6.02
    
    
    // method to calculate precipitation in centimeters (current index of precipitation array passed as a parameter) - to be completed in 6.02


}
