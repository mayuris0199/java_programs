/*
    Accept the 5 subject marks from users and calculate the total marks and
    percentages and display it.
*/
import java.util.Scanner;
public class Q8 
{
     public static void main(String[] args)
     {
         Scanner sc = new Scanner(System.in);
         int chem,phy,maths,hindi,eng;
         double per,total;
          
         chem = sc.nextInt();
         phy = sc.nextInt();
         maths = sc.nextInt();
         hindi = sc.nextInt();
         eng = sc.nextInt();
         
         total =(chem+phy+maths+hindi+eng);
         per = (double)((total*100)/500);
         
         System.out.println("total marks out of 500:-"+total);
         System.out.println("percentage :-"+per);
         sc.close();     
        }
}

/*------------------OUTPUT-------------------
    89
    70
    98
    90
    76
    total marks out of 500:-423.0
    percentage :-84.6
*/    