/*
     Accept the alphabets and check whether it is vowel or vowel not.
 */

import java.util.Scanner;
 public class Q7 
{
       public static void main(String[] args)
    {
       Scanner sc = new Scanner(System.in);
       char ch ;
       ch = sc.next().charAt(0);
       
       
       if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
       {
            System.out.println("ch is vowel!");
       } 
       else
            System.out.println("ch is not a vowel!");
            sc.close();
    } 

}


/*--------------OUTPUT---------------
    e
    ch is vowel!
    
    or

    h
    ch is not a vowel!
*/