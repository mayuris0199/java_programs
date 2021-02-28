/*
 Accept the number and check whether the number is greater than 100.
 */
package assignment2;
import java.util.Scanner;
public class Q1 
{
    public static void main(String[] args)
    {
       Scanner sc = new Scanner(System.in);
       
       int num;
       
       num = sc.nextInt();
       
       if(num >100)
       {
           System.out.println("number is greater than 100");
       }
       else
           System.out.println("number is less than 100");
    }
    
}
