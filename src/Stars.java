 /**
 * class Stars
 *
 */

import java.util.*;

public class Stars
{

    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        int pattern, rows;
        
        System.out.printf("How many rows? ");
        rows = console.nextInt();
        System.out.print("Which pattern number? ");
        pattern = console.nextInt();
        if(pattern == 1 )
        {
            for(int N = 0 ; N <= rows; N++)
        {
            for( int j= 0; j < N; j++)
            {
                    System.out.print("*");
            }
            System.out.print("\n");
        }
        
       }
       if(pattern == 2)
       {
           for(int N = 0; N <= rows; rows--)
           {
               for( int j = 0; j < rows; j++)
               {
                   System.out.print("*");
                }
                System.out.print("\n");
            }
       }
       if(pattern == 3)
       {
           for(int N =1; N <= rows; N++)
           {
               for (int j = rows - N; j > 0; j--)
               {
                   System.out.printf(" ");
                }
               for(int j = 1; j <= ((2 * N) - 1); j++)
                {
                    System.out.printf("*");
                }
                    System.out.print("\n");
    }
    }
}
}

