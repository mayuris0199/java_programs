/*
     Accept two dimensional array numbers and print it.
*/    
import java.util.Scanner;
public class Q7 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int m,n,i,j;
        System.out.print("enter number of rows: ");
        m = sc.nextInt();
        System.out.print("enter number of columns: ");
        n = sc.nextInt();
        int a[][] = new int[m][n];
        System.out.println("enter array element = ");

        for(i=0; i<m;i++)
          {
              for(j=0;j<n;j++)
               {
                 a[i][j] = sc.nextInt();
               }
          }     
        System.out.println("Array elements are:");

        for(i=0;i<m;i++)
        {
           for(j=0;j<n;j++)
             {
               System.out.print(a[i][j]+" ");
             }
             System.out.println();
        }     
    sc.close();
    }
}

/*---------------------OUTPUT---------------------

    enter number of rows: 3
    enter number of columns: 3
    enter array element = 
    2
    3
    7
    6
    5
    9
    3
    1
    9
    Array elements are:
    2 3 7
    6 5 9
    3 1 9

*/    