/**
 * Purpose: To recursively calculate the nth Fibonacci number.
 *
 * @author Zuha Hassen
 * @version 05/23/2022
 */

import java.util.Scanner;
public class FibonacciTester
{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        Fibonacci f = new Fibonacci();
        
        System.out.print("Enter an index for a Fibonacci number (0-45): ");
        int index = scanner.nextInt();
        if(index > 45 || index < 0){
            System.out.print("Please enter a valid number (0-45): ");
            index = scanner.nextInt();
        }
        
        System.out.println("The Fibonacci number at index " + index + " is " + f.fib(index));
        System.out.println();
        boolean cont = true;
        System.out.print("What to enter another index number? (Y or N): ");
        while(cont){
            String input = scanner.nextLine();
            if("N".equalsIgnoreCase(input)){
                cont = false;
            } else if ("Y".equalsIgnoreCase(input)){
                System.out.println();
                System.out.print("Enter an index for a Fibonacci number (0-45): ");
                index = scanner.nextInt();
                if(index > 45 || index < 0){
                   System.out.print("Please enter a valid number (0-45): ");
                   index = scanner.nextInt();
                }
                System.out.println("The Fibonacci number at index " + index + " is " + f.fib(index));
                System.out.println();
                System.out.print("What to enter another index number? (Y or N): ");
            }
        }
    }
}

