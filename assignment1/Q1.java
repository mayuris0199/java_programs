/*
   Que.1] Accept Two numbers and print 
   the sum of Two numbers.
 */
package assignment.pkg1;
import java.util.Scanner;
public class Q1 
{
  public static void main(String[] args) 
    {
      Scanner sc = new Scanner(System.in);
      int a,b,c;
      a = sc.nextInt();
      b = sc.nextInt();
       
      c = a + b;
      
      System.out.println("Sum of two numbers :- "+ c);
      
    }
    
}
