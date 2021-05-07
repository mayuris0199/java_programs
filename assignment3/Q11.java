/*
  Accept number and check whether number is prime or not.
 */

import java.util.Scanner;
public class Q11 
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in); 
    int num,flag=0;
    num = sc.nextInt();
    
   for(int i=2;i<num;i++)
     {
       if(num%i==0)
       {
           flag=1;
           break;
       }
     }   
   if(flag==0)
   {
       System.out.println("is a prime number");
   }
   else
      System.out.println("is a not prime number"); 

      sc.close();   
  }
}


/*----------------OUTPUT-----------------
    23
    is a prime number

    or

    12
    is a not prime number

*/