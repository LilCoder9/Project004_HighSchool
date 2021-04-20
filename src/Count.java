/** 
 * Class Count
 * 
 */
import java.util.*;

class Count
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        int score=0;
        double scoresum=0;
        int high=0;
        int mid=0;
        int low=0;
        int hlow=1;
        int scores=1;
        int sum;
        double avg=0;
        do
        {
            System.out.print("Enter a score (negative to exit):");
            score = console.nextInt();
            
            if(score >= 100 && score <=150)
            {
                high = high + 1;
                
            }
            else if(score >= 60 && score < 100)
            {
                mid = mid + 1;
               
            }
            else if(score >= 0 && score <60)
            {
                low = low + 1;
                
            }
            scoresum = scoresum + score;
            
        }while(score >= 0);
        scores = high + mid + low;
        avg = scoresum / scores;
        
        // display average (NOTE VARIABLE NAMES USED BELOW)
        System.out.printf("\nThere were %d HIGH scores, %d MIDDLE scores, and %d LOW scores.\n",high, mid, low);
        System.out.printf("\nThe average of the %d scores is %.1f\n",scores, avg);
        System.out.println();
        
        System.out.println("HISTOGRAM:\n");
        System.out.print("low: |");
        while( low > 0)
        {
            System.out.print("X");
            low = low - 1;
        }
        System.out.println("");
        System.out.print("mid: |");
        while (mid > 0)
        {
            System.out.print("X");
            mid = mid - 1;
        }
        System.out.println("");
        System.out.print("high:|");
        while(high > 0)
        {
            System.out.print("X");
            high = high - 1;
        }
            
        
    }
}