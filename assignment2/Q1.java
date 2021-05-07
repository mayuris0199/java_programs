 /*
    Accept the number and check whether the number is greater than 100.
 */

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

      sc.close();
    }
    
}

/*----------------OUTPUT----------------------
    78
    number is less than 100

    or

    387
    number is greater than 100
*/    
