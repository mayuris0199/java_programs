/*
    Accept length and heigth of triangle and calculate area.
 */
import java.util.Scanner;
public class Q5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int length,heigth,area;
        
        length = sc.nextInt();
        heigth = sc.nextInt();
        
        area = (int)(0.5*length*heigth);
        
        System.out.println("area of triangle is:-" +area);
    }
}

/*-----------------OUTPUT---------------
      50
      80
      area of triangle is:-2000
*/      