import java.util.*;

public class DecBin
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        int x;
        int remainder=1;
        int power=1;
        int answer=0;
        
        System.out.print(" Enter a positive integer: ");
        x = console.nextInt();
        System.out.printf(" The number %d in binary is ", x);
       while ( x != 0 )
       {
          remainder = x % 2;
          x = x / 2;
          answer = answer +(remainder *power);
          power = power * 10;
    }
    System.out.printf("%d", answer);
}
}
