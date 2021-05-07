/*
   Accept a number and print the multiplication table of that number.
*/

import java.util.Scanner;
public class Q6 
{
 public static void main(String[] args)
 {
     Scanner sc = new Scanner(System.in);
     int num,table;
     
     num = sc.nextInt();
     System.out.println("multiplication table of :-"+num);
     for(int i=1;i<=10;i++)
     {
         table=(num * i);
        
          System.out.println(num+" "+"X"+" "+i+" = "+table);
     }
     sc.close();
 }     
}


/*----------------OUTPUT-----------------
    4
    multiplication table of :-4
    4 X 1 = 4
    4 X 2 = 8
    4 X 3 = 12
    4 X 4 = 16
    4 X 5 = 20
    4 X 6 = 24
    4 X 7 = 28
    4 X 8 = 32
    4 X 9 = 36
    4 X 10 = 40

*/