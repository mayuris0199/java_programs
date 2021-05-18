/*  
     Accept 10 numbers and print the sum of entered number.
*/
import java.util.Scanner;
public class Q2 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n,sum=0;
        n = sc.nextInt();
        int array[]=new int[n];
  
        System.out.println("enter elements");

        for(int i=0;i<n;i++)
        {
            array[i] = sc.nextInt(); 
            sum = sum + array[i];
        }
    
        System.out.println("sum of entered number is = " +sum);
        sc.close();
    }
    
}

/*--------------------OUTPUT-----------------------
    10
    enter elements
    28
    31
    1
    7
    12
    6
    8
    3
    0
    5
    sum of entered number is = 101
*/    