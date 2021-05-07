/*
   Accept two numbers from user and print all even number between the range.
 */

import java.util.Scanner;
public class Q7 
{
  public static void main(String[] args)
  {
      Scanner sc = new Scanner(System.in);
      int num1, num2;
      
      num1 = sc.nextInt();
      num2 = sc.nextInt();
      
      for(int i=num1;i<=num2;i+=2)
      {
          System.out.println(i);
      }

      sc.close();
  }
}


/*----------------OUTPUT-----------------
    1
    30

    1
    3
    5
    7
    9
    11
    13
    15
    17
    19
    21
    23
    25
    27
    29

*/