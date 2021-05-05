/*
   Accept two numbers from user and interchange them(Swapping) 
   a) using third variable temp
 */

import java.util.Scanner;
public class Q7a
{
    public static void main(String[] args)
    {
      Scanner sc = new Scanner(System.in);
      int num1,num2,temp;
      
      num1 = sc.nextInt();
      num2 = sc.nextInt();
      
      System.out.println("num1:-"+" "+num1);
      System.out.println("num2:-"+" "+num2);
      
      temp = num1;
      num1 = num2;
      num2 = temp;
      
      System.out.println("swapped value of num1:-"+ num1);
      System.out.println("swapped value of num2:-"+ num2);
    }
}

/*----------------OUTPUT------------------
     34
     78
     num1:- 34
     num2:- 78
     swapped value of num1:-78
     swapped value of num2:-34
*/     