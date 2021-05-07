/*
  Accept the radius of circle and calculate (area = pi*r*r) and
  circumference (circumference= 2*pi*r)
 */
import java.util.Scanner;
public class Q6 
{
  public static void main(String[] args)
  {
      Scanner sc = new Scanner(System.in);
      int area,circumference,r;
      float pi = (float) 3.14;
      
      r = sc.nextInt();
      
      area =(int) (pi * r * r);
      circumference = (int) (2*pi*r);
      
      System.out.println("Area of circle:-" + area);
      System.out.println("circumference of circle:-" + circumference);   
      sc.close();
  }  
}
/*---------------OUTPUT---------------
     4
     Area of circle:-50
     circumference of circle:-25
*/     