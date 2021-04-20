
/**
 * Class WhileDemo
 * 
 */
import java.util.*;

public class WhileDemo
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        
        int n;
        int sum=0;
                
        System.out.print("Part 1: Multiples of 5 between 0 and 100\n");
        n= 0;
        while(n <= 100)
        {
            System.out.printf("%d ", n);
            n = 5 + n;
        }

        System.out.print("\nPart 2: Sum of first 100 integers\n");
        n = 1;
        while(n <= 100)
        {
            sum = n + sum;
            n = n + 1;
        }
            System.out.printf("Sum= %d \n", sum);
        
        System.out.print("Part 3: sequence 2, 5, 8, 11, .. 17\n");
        n= 2;
        do
        {
            System.out.printf(" %d ", n);
            n = n + 3;
        }while( n <= 17);
            
            
            
        
       
                

    
}}
