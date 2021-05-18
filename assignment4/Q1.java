/* 
     Accept 10 numbers from user and print it
*/
import java.util.Scanner;
public class Q1 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of elements");
        int n;
        n = sc.nextInt();
        int array[]= new int[n];
        System.out.println("enter elements");
        for(int i=0;i<n;i++)
        {
            array[i] = sc.nextInt(); 
        }
        System.out.println("the enter elements are ");
        for(int i : array)
        {
            
            System.out.println(i);
        }
        sc.close();
    }
    
}

/* ------------------OUTPUT---------------------
    enter number of elements
    10
    enter elements
    1
    67
    89
    34
    6
    3
    90
    23
    5
    2
    the enter elements are 
    1
    67
    89
    34
    6
    3
    90
    23
    5
    2

*/
