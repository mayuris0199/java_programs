/*
   accept a name and print it as many times as the user demands. 
 */

import java.util.Scanner;
public class Q10 
{
  public static void main(String[] args)
  {
      Scanner sc = new Scanner(System.in);
      String s = "Mayuri";
      int n;
      n = sc.nextInt();
      
      for(int i=0;i<n;i++)
      {
          System.out.println(s);
      }

      sc.close(); 
  }
}

/*----------------OUTPUT-----------------
    5
    Mayuri
    Mayuri
    Mayuri
    Mayuri
    Mayuri

*/
