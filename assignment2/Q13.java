/*
  Accept a stream (science ,arts)from the user and print the subject 
  (using switch case).
 */

import java.util.Scanner;
 public class Q13 
{
   public static void main(String[] args) 
   {
       Scanner sc =new Scanner(System.in);
      // int science,arts;
      String m = sc.next();
       switch(m)
       {
           case "science":
               System.out.println("Physics,chemistry,biology,maths");
               break;
               
           case "arts":
               System.out.println("litreture,history,civics,language");
               break;
           
           default:
               System.out.println("in valid");
      }
      sc.close(); 
     
    }      
}



/*--------------OUTPUT---------------
    science
    Physics,chemistry,biology,maths
*/