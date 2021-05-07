/*
   print the following format.
   4)   *
       * *
      * * *
     * * * *
 */

import java.util.Scanner;
public class Q14d
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n=4;
        
        for(int i=0;i<n;i++)
        {
          for (int j=n-i; j>1; j--) //inner loop for spaces
            { 
                System.out.print(" "); //print space
            }  
       
          for(int j=0;j<=i;j++)
            {
              System.out.print("* ");  
            }
           System.out.println();
        }
        sc.close();
    }
}


/*----------------OUTPUT-----------------
      * 
     * *
    * * *
   * * * *

*/