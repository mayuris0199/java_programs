/*
  Accept the number and check whether the number is positive or negative.
 */
import java.util.Scanner;
public class Q3
{
  public static void main(String[] args)
    {
       Scanner sc = new Scanner(System.in);
       int num;
       num = sc.nextInt();
       
       if(num>=0)
       {
            System.out.println("number is positive!");
       }
       else
            System.out.println("number is negative!");
           
      sc.close();
    }   
       
}

/*----------------OUTPUT---------------------
    47
    number is positive!

    or

    -23
    number is negative!
*/