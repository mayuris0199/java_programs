/*
   Print the sum of the digits of number.
 */

import java.util.Scanner;
public class Q9 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int m,c = 0;
        m = sc.nextInt();
        while(m!=0)
        {
            c =( c +(m%10));
            m = m/10;
        }
        System.out.println("sum of the digits of number is = "+c);

        sc.close();
    }
    
}


/*----------------OUTPUT-----------------
    958
    sum of the digits of number is = 22

*/