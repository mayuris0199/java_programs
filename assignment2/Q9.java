/*
    Accept the number and check whether it is 2 digit number or one digit 
    number and display appropriate message.
 */

import java.util.Scanner;
public class Q9 
{
  public static void main(String[] args)
    {
       Scanner sc = new Scanner(System.in);
       int num;
       num = sc.nextInt();
       
       if(num>=1 && num<=9)
       {
            System.out.println("one digit number!");
       }
       else if(num>=10 && num<=99)
       {   
            System.out.println("two digit number!");
       }   
       else
       {
           System.out.println("number is more than two digit!");

       }
       sc.close();
    }   
}




/*--------------OUTPUT---------------
    6   
    one digit number! 

    or

    67
    two digit number!

    or

    650
    number is more than two digit!

*/