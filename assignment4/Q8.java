/*
   Perform addition of two 1-D-array.
*/
import java.util.Scanner;
public class Q8 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array ");
        int n = sc.nextInt();
        int a[] = new int[n];
        int b[] = new int[n];
        int c[] = new int[n];
       
        System.out.println("Enter Array element of a : ");
        for(int i=0;i<n;++i)
        {
          a[i] = sc.nextInt();
        }

        System.out.println("Enter Array element of b: ");
        for(int i=0;i<n;++i)
        {
          b[i] = sc.nextInt();
        }
        for(int i=0;i<n;++i)
        {
          c[i] = a[i] + b[i];
          System.out.println("sum of "+ i +" index "+c[i]);
        }

      sc.close();
    }
  }        

  /*------------------OUTPUT-------------------
    enter the size of array 
    5
    Enter Array element of a : 
    5 
    10
    4
    3
    1
    Enter Array element of b: 
    9
    0
    3
    13
    5
    sum of 0 index 14
    sum of 1 index 10
    sum of 2 index 7
    sum of 3 index 16
    sum of 4 index 6

*/    