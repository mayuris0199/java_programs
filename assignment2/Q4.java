/*
     Accept the number and check whether the number is even or odd.
 */
import java.util.Scanner;
 public class Q4 
{
   public static void main(String[] args)
    {
       Scanner sc = new Scanner(System.in);
       int num;
       num = sc.nextInt();
       
       if(num%2==0)
       {
            System.out.println("number is even!");
       }
       else
            System.out.println("number is odd!");
     sc.close();     
    }    
}

/*-----------------OUTPUT----------------
    43
    number is odd!

*/
