/*
  write a menu driven program (using switch) which has following options:
  1) positive or negative. 
  2) odd or even.
 */

import java.util.Scanner;
 public class Q14
{
  public static void main(String[] args)
  {
   Scanner sc = new Scanner(System.in);  
   int number ;
   number = sc.nextInt();
   String s = sc.next();
   switch(s)
   {
       case "positive":
       {
           if(number>=0)
           System.out.println("number is positive");
           else
           System.out.println("invalid");    
           break;
       }    
       case "negative":
       {   
           if(number<0)
           System.out.println("number is Negative");
           else
           System.out.println("invalid"); 
           break;
       }    
       case "odd":
       {    
           if(number%2!=0)
           System.out.println("number is odd");
           else
           System.out.println("invalid");     
           break;
       }    
       case "even":
       {
           if(number%2==0)
           System.out.println("number is even");
           else
           System.out.println("invalid");      
           break;  
       }
           
   }
   sc.close();
 }  
}

/*--------------OUTPUT---------------
    67
    positive
    number is positive

    or

    54
    negative
    invalid

    or

    68
    even
    number is even

    or

    53
    odd
    number is odd
    */
