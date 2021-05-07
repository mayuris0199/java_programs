/*
    print the following format.
      1) 1      
         12
         123
         1234 

 */

import java.util.Scanner;
public class Q14a
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        for(int i=0;i<5;i++)
        {
            for(int j=1;j<=i;j++)
            {
               
                 System.out.print(j);
            } 
            System.out.println("");
        }
        sc.close(); 
    }  
}


/*----------------OUTPUT-----------------
    
    1
    12
    123
    1234

*/