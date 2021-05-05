/*
   Accept an age and check whether u can eligible for vote or not. 
 */

import java.util.Scanner;

 public class Q2
  {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int age;
        age = sc.nextInt();
        
        if(age>=18)
        { 
            System.out.println( "u are eligible for vote!");
        }
        else
            System.out.println( "u are not eligible for vote!");
    }
}
/*---------------OUTPUT----------------
    32
    u are eligible for vote!

    or

    12
    u are not eligible for vote!
*/