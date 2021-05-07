/*
   print the following format.
   5) a
      bb
      ccc
      dddd
 */

import java.util.Scanner;
public class Q14e
{
   public static void main(String[] args)
   {
       Scanner sc = new Scanner(System.in);
       //int a = 1,e = 1;
       for(int i=0;i<4;i++)
       {
           for(int j=0;j<=i;j++)
           {
               System.out.print((char)(i+97));
           }
           System.out.println();
       }
       sc.close();     
   }
}


/*----------------OUTPUT-----------------
    a
    bb
    ccc
    dddd

*/