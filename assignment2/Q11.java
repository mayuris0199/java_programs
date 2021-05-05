/*
   Accept the age of person and print message a follow
   1) Age<12 = "still a child".
   2) Age<21 = "enjoy lif teenagers".
   3) Age<40 = "you are responsible adult".
   4) Age<70 = "respected senior citizen".
   5) Age<80 = "Enough on earth,better to check out".
  also check whether the user enters a negative age.
 */

import java.util.Scanner;
 public class Q11
{ 
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int age;
        age = sc.nextInt();
        
        if(age<0)
        {
            System.out.println("age is not exit (nigative)");
        } 
        else if(age<12)
        { 
            System.out.println( "still a child!");
        }
        else if(age<21)
        { 
            System.out.println( "enjoy life teenagers!");
        }
        else if(age<40)
        { 
            System.out.println( "you are responsible adult!");
        }  
        else if(age<70)
        { 
            System.out.println( "respected senior citizen!");
        }  
        else if(age>70)
        { 
            System.out.println( "Enough on earth,better to check out!");
        }  
          
        else
        {
            System.out.println("exit");
        } 
    }    
}



/*--------------OUTPUT---------------
    56
    respected senior citizen!
    
*/