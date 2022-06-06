/**
 * Purpose: To complete static methods given in the starter code java file
 * @author Zuha Hassen
 * @version 12/27/2021
 * 
 * This Math trick and many more can be found at: http://www.pleacher.com/handley/puzzles/mtricks.html
 *
 */

public class MathTrick {
    
    /**
     * 
     ******  DO NOT USE ARRAYS OR CONVERT NUMBERS TO STRING UNTIL STEP 7 ******
     *
     */
    
    // Step 1) Creates a random 3 digit (100-999) number where the first and last digit differ by more than one
    // Hint: Use Math.random() to create number in the correct range
    //          use modulus to find the last digit and divide by 100 for the first digit.
    //         calculate the difference, which method can you use so it doesn't matter how the numbers are subtract?
    //          while the difference of the digits is less than 2, create a new random number and try again

    public static int getRandomNum() 
    {   int num = 0;
        int firstDigit = 0;
        int lastDigit = 0;
        int maxNum = 999;
        int minNum = 100;

        // complete the method     
        while(Math.abs(firstDigit - lastDigit) < 2){
            num = (int)(Math.random() * (maxNum - minNum + 1) + minNum);
            firstDigit = num / 100;
            lastDigit = num % 10;
        }
        return num;
    }

    // Step 2 & 4) reverse the digits of a number
    // Hint: to reverse a number without converting it to a String:
    //        create a new variable to store the reversed number
    //        while the original number > 0
    //        for each digit, multiply the new variable by 10 (to make room for the new digit) 
    //        then add the last digit (remember modulus?) to the new variable
    //        divide the original number by 10 to get rid of the last digit
    //    Ex: 584--> (0 x 10) + 4 = 4 ; 58--> (4 x 10) + 8 = 48; 5-->(48 x 10) + 5 = 485

    public static int reverseDigits (int num) {
        int reverseNum = 0;
        while (num > 0) {
            reverseNum = reverseNum * 10 + num % 10;
            num = num/10;
        }
        // complete the method
        return reverseNum;
    }
    
    // Step 7) replace characters in a String according to the chart
    // Hint: Loop through the String and "replace" the numbers with the corresponding letter
    public static String replaceLtr(String str)
    {
        String string = "";
        for (int  x = 0; x < str.length(); x++){
            String num1 = str.substring(x, x+1);
            if (num1.equals("0")){
            num1 = "Y"; 
            } 
            if (num1.equals("1")){
            num1 = "M";
            } 
            if (num1.equals("2")){
            num1 = "P";
            } 
            if (num1.equals("3")){
            num1 = "L";
            } 
            if (num1.equals("4")){
            num1 = "R";
            } 
            if (num1.equals("5")){
            num1 = "O";
            }
            if (num1.equals("6")){
            num1 = "F";
            } 
            if (num1.equals("7")){
            num1 = "A";
            } 
            if (num1.equals("8")){
            num1 = "I";
            } 
            if (num1.equals("9")) {
            num1 = "B";
            } 
            string = string + num1;
        }
        // complete the method 
        return string; 
    }
    
    // Step 8) reverse the letters in a String
    // Hint: start with an empty String variable 
    //         loop through the original word   
    //         add one letter at time to the new variable using concatenation and .substring()
    public static String reverseString(String str) {
        String reverseStr = "";
        for (int x = str.length(); x > 0; x--){
            String num2 = str.substring(x - 1, x);
            reverseStr = reverseStr + num2;
        }
        
        // complete the method
        return reverseStr;
    }
        
    public static void main(String[] args) 
    {
    //        1.    Generate a random 3-digit number so that the first and third digits differ by more than one.
    int startNum = getRandomNum();
    int reverseNumb = reverseDigits(startNum);
    int difference = 0;

    
    System.out.println("1. The starting number: " + startNum);
    //        2.    Now reverse the digits to form a second number.
    
    
    System.out.println("2. The reversed number: " + reverseNumb);
    //        3.    Subtract the smaller number from the larger one.
    if (startNum > reverseNumb) {
    difference += startNum - reverseNumb;
    System.out.println("3. The difference is: " + Math.abs(reverseNumb - startNum));
    } else {
    difference += reverseNumb - startNum;
    System.out.println("3. The difference is: " + Math.abs(startNum - reverseNumb));
    }
    
    
    //        4.    Now reverse the digits in the answer you got in step 3 and add it to that number.
    int reverseDiff = reverseDigits(difference);
    int addedDiff = reverseDiff + difference;
    System.out.println("4. The reversed number added to difference: " + addedDiff);


    //        5.    Multiply by one million.
    int multipliedNum = addedDiff * 1000000;
    System.out.println("5. Number x one million: " + multipliedNum);


    //        6.    Subtract 733,361,573.
    int subtractedNum = Math.abs(multipliedNum - 733361573);
    //String str = String.valueOf(subtractedNum);
    System.out.println("6. Number subtracted and converted to a String: " + subtractedNum); 

    
    //        7.    Convert the number to a string in order to replace the numbers with letters.
    //                 Ex: String str = String.valueOf(myNumber);
    //            Then, replace each of the digits in your answer, with the letter it corresponds to using the table in the instructions.
    String str = String.valueOf(subtractedNum);
    String replaceStr = replaceLtr(str);
    System.out.println("7. Replace string: " + replaceStr);
    
    
    //        8.    Now reverse the letters in the string to read your message backward.
    String reverseLtrs = reverseString(replaceStr);
    System.out.println("8. Reversed string: " + reverseLtrs);
    } // end main
} // end class
