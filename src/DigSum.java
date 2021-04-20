import java.util.*;

/**
 * Class DigSum 
 */

public class DigSum
{
    public static void main(String[] args)
    {       
        Scanner console = new Scanner(System.in);
        int originaln;
        int integer;
        int remainder=1;
        int sum=0;
        int error=1;
         
        System.out.print("Please enter an integer: ");
        integer = console.nextInt();
        originaln = integer;
        while (error != 0)
        { 
            remainder = integer % 10;
            integer = integer / 10;
            sum = sum + remainder;
            error = integer % 10000;
        }
        
        System.out.printf("The sum of the digits in %d is %d.\n", originaln, sum); 
    }
}
