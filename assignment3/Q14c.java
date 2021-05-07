/*
    print the following format.
    3) *
       **
       ***
       ****
 */

import java.util.Scanner;
public class Q14c 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        //int a=1;
        for(int i=0;i<5;i++)
        {
            for(int j=1;j<=i;j++)
            {
               
                 System.out.print("*");
            } 
            System.out.println();
        }
        sc.close(); 
    }    
}


/*----------------OUTPUT-----------------
    
    *
    **
    ***
    ****

*/