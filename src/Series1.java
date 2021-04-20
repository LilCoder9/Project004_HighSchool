

/**
 * Class Series1 
 * 
 */
import java.util.*;

public class Series1
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        double i;
        double s1=0;
        double s2=0;
        double a;
        
        
        
        // series s1:  1+(1/2)+(1/4)+...
        System.out.print("Series S1: ");
        i = 1;
        a = 1;
        while( i <= 10)
        {
           a= .5 * a;
           s1= s1 + a;
           i = i + 1;
        }

        System.out.printf(" The sum1 =  %f \n", s1);
       System.out.print("Series S2: "); 
      
       for(int k = 1; k <= 20; k = k +1)
        {
            a = 3 + 2 * k;
            s2 = s2 + a;
        }
          System.out.printf( "The sum2 = %f \n" , s2);
       
        // ADD CODE HERE     
   
    }
}
