/*
   Accept a number and print the cube of number.
*/
import java.util.*;
public class Q3
{
   public static void main(String args[])
   {
    Scanner sc = new Scanner(System.in);
    int a,cube;
    a = sc.nextInt();
 
    cube = a * a * a;
    
    System.out.println("square of number is:- "+ cube);
 
   }
}

/*------------------OUTPUT-----------------------
      20
      square of number is:- 8000
*/
