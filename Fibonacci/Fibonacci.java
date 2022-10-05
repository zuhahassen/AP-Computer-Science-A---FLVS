
/**
 * Purpose: To recursively calculate the nth Fibonacci number.
 *
 * @author Zuha Hassen
 * @version 05/23/2022
 */
public class Fibonacci
{
    private int num;

    public Fibonacci()
    {
        num = 0;
    }
    
    public Fibonacci(int num){
        this.num = num;
    }
    
    public int fib(int num){
        if(num == 0){
            return num;
        } else if (num == 1){
            return num;
        } else {
            return fib(num - 1) + fib(num - 2);
        }
    }

   
}
