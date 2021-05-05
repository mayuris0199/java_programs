/*
    Accept the number and check whether the number is divisible by 5 or 7.
 */
import java.util.Scanner;
 public class Q6 
{
    public static void main(String[] args)
    {
       Scanner sc = new Scanner(System.in);
       int num;
       num = sc.nextInt();
       
       if(num%5==0 || num%7==0)
       {
            System.out.println("number is divisible by 5 and 7!");
       }
       else
            System.out.println("number is not divisible by 5 and 7!!");
    }     
}

/*-------------OUTPUT-------------
    35
    number is divisible by 5 and 7!

    or

    78
    number is not divisible by 5 and 7!!
*/