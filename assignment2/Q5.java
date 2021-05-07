/*
    Accept the alphabets and check whether it is uppercase or lowercase.
 */

import java.util.Scanner;
  public class Q5
{
    public static void main(String[] args)
    {
       Scanner sc = new Scanner(System.in);
       char ch ;
       ch = sc.next().charAt(0);
       
       if(ch>='A' && ch<='Z')
       {
            System.out.println("ch is Uppercase!");
       }
       else if(ch>='a' && ch<='z')
       {
            System.out.println("ch is Lowercase");
       }     
       else
            System.out.println("ch is not a alphabet!");
             sc.close();       
    }   
}

/*----------------OUTPUT--------------
    A
    ch is Uppercase!

    or

    a
    ch is Lowercase

    or

    12
    ch is not a alphabet!

*/    
