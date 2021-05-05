/*
  Accept two numbers from user and interchange them(Swapping) 
  b) without using third variable
 */

import java.util.Scanner;
public class Q7b 
{
  public static void main(String[] args)
  {
       Scanner sc = new Scanner(System.in);
      int num1,num2,temp;
      
      num1 = sc.nextInt();
      num2 = sc.nextInt();
      
      System.out.println("number before swapping:-"+num1+" "+num2);
      
      num1 = num1 + num2;
      num2 = num1 - num2;
      num1 = num1 - num2;
      
      System.out.println("number after swapping :-"+num1+" "+num2);
    
  }
}

/*-----------------------OUTPUT---------------------
    28
    90
    number before swapping:-28 90
    number after swapping :-90 28
*/