/*
   Accept a number and print the 
   square of number.
 */
import java.util.Scanner;
public class Q2
{
    public static void main(String[] args)
    {
       Scanner sc = new Scanner(System.in);
       int a,square;
       a = sc.nextInt();
    
       square = a * a ;
       
       System.out.println("square of number is:- "+ square);
    }
    
    
}

/* -----------------OUTPUT---------------
      25
      square of number is:- 625
*/
