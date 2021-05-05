/*
Accept length and breadth of rectangle and calculate area.
 */
import java.util.Scanner;
public class Q4
{
  public static void main(String[] args)
  {
      Scanner sc = new Scanner(System.in);
      int length,breadth,area;
      
      length = sc.nextInt();
      breadth = sc.nextInt();
      
      area = length * breadth;
      
      System.out.println("Area of rectangle is:-" + area);
  }
}

/*------------------OUTPUT-------------------------
     20
     18
     Area of rectangle is:-360
*/