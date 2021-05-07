/*
   Accept number from user and print reverse of that number.
 */

import java.util.Scanner;
public class Q8 
{
   public static void main(String[] args)
   {
     Scanner sc = new Scanner(System.in);
     int m,c=0;
     
     m = sc.nextInt();
     
     while(m!=0)
     {
         c = ((c * 10)+(m % 10));
         m = (m /10);  
     }
     System.out.println("reverse of number = "+c);

     sc.close();
   }
}


/*----------------OUTPUT-----------------
    98
    reverse of number = 89

*/