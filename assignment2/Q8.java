/*
    Any year is input througth the keyboard and check whether 
    the year is leap or not 
 */
import java.util.Scanner;
public class Q8 
{
  public static void main(String[] args)
    {
       Scanner sc = new Scanner(System.in);
       int year;
       year = sc.nextInt();
       
       if(year%4==0)
       {
            System.out.println("year is leap!");
       }
       else
            System.out.println("year is not a leap!");
    }   
}

/*--------------OUTPUT---------------
    2000
    year is leap!
    
    or

    2013
    year is not a leap!
*/