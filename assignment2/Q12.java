/*
   if the three sides of a triangle is entered through the keyboard,
   write a program to check whether the triangle is isosceles,
   equilateral,scalene or rigth angled triangle.
 */

import java.util.Scanner;
 public class Q12
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
    
        if(a==b && b==c)
        {
            System.out.println("it is equilateral triangle");
        }
        else if( a==b || b==c || a==c)
        {
            System.out.println("it is isosceles triangle");
        }   
        else if(a==90 || b==90 || c==90)
        {
            System.out.println("it is rigth angled triangle"); 
        } 
        else
        {
           System.out.println("it is scalene triangle");  
        }    
        sc.close();
    }      
}



/*--------------OUTPUT---------------
    30
    60
    90
    it is rigth angled triangle

    or

    45
    45
    60
    it is isosceles triangle

    or

    30
    30
    30
    it is equilateral triangle

    or

    20
    80
    56
    it is scalene triangle
*/
