/*
   Accept the three numbers and print the biggest & smallest of the 3 numbers
 */

import java.util.Scanner;
public class Q10
{
  public static void main(String[] args)
    {
       Scanner sc = new Scanner(System.in);
       
       int num1,num2,num3;
    
       num1 = sc.nextInt();
       num2 = sc.nextInt();
       num3 = sc.nextInt();

              
        if(num1<num2)
      {
          if(num1<num3)
          {
              System.out.println("smallest number is"+" "+num1);
          }
          else
          {    
            System.out.println("smallest number is"+" "+num3); 
          }   
      }
      else if(num2<num3)
      {
         System.out.println("smallest number is"+" "+num2);  
      }
      else
      {
        System.out.println("smallest number is"+" "+num3);  
      }
      
      // for biggest number:
      
      if(num1>num2)
      {
          if(num1>num3)
          {
              System.out.println("biggest number is"+" "+num1);
          }
          else
          {    
            System.out.println("biggest number is"+" "+num3); 
          }   
      }
      else if(num2>num3)
      {
         System.out.println("biggest number is"+" "+num2);  
      }
      else
      {
        System.out.println("biggest number is"+" "+num3);  
      }
      sc.close();
    }   
      
}

/*--------------OUTPUT---------------
    90
    23
    78
    smallest number is 23
    biggest number is 90
*/