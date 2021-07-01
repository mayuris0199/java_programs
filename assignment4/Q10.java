/*
    Perform multiplication of  two 2-D-arrays.
*/
import java.util.*;
public class Q10 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int m,n,p,q;

        System.out.println("Enter number of rows of matrix A");
        m = sc.nextInt();
        System.out.println("Enter number of columns of matrix A");
        n = sc.nextInt();
        int a[][] = new int[m][n];

        System.out.println("Enter number of rows of matrix B");
        p = sc.nextInt();
        System.out.println("Enter number of columns of matrix B");
        q = sc.nextInt();
        int b[][] = new int[p][q];

        int c[][] = new int[n][p];

        System.out.println("Enter elements of matrix A:");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("matrix A:");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("Enter elements of matrix B:");
        for(int i=0;i<p;i++)
        {
            for(int j=0;j<q;j++)
            {
                b[i][j] = sc.nextInt();
            }
        }
        System.out.println("matrix B:");
        for(int i=0;i<p;i++)
        {
            for(int j=0;j<q;j++)
            {
                System.out.print(b[i][j]+" ");
            }
            System.out.println();
        }
        
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<q;j++)
            {
                c[i][j] = a[i][j] * b[i][j];
            }
        }

        System.out.println("Multiplication of matrix A and matrix B is:");
        for(int i=0;i<m;i++)
        {
           for(int j=0;j<q;j++)
             {
               System.out.print(c[i][j]+" ");
             }
             System.out.println();
        }     

        sc.close();
    }
    
}

/*-----------------OUTPUT------------------------
    Enter number of rows of matrix A
    3
    Enter number of columns of matrix A
    3
    Enter number of rows of matrix B
    3
    Enter number of columns of matrix B
    2
    Enter elements of matrix A:
    4
    8
    9
    7
    1
    5
    2
    6
    3
    matrix A:
    4 8 9
    7 1 5
    2 6 3
    Enter elements of matrix B:
    1
    5
    0
    2
    3
    0
    matrix B:
    1 5
    0 2
    3 0
    Multiplication of matrix A and matrix B is:
    4 40
    0 2
    6 0
*/

incomplete