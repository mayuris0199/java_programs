/*
    Demonstrate a transpose matrix.
*/
import java.util.*;
public class Q11 {
    public static void main(String[] args)
     {
         Scanner sc = new Scanner(System.in);
         int m,n;
         System.out.println("Enter row of matrix A:");
         m = sc.nextInt();
         System.out.println("Enter column of matrix A:");
         n = sc.nextInt();

         int matrix[][] = new int[m][n];
         int transposeMatrix[][] = new int[m][n];
         
         System.out.println("enter element of matrix: ");
         for(int i=0;i<m;i++)
         {
             for(int j=0;j<n;j++)
             {
                matrix[i][j] = sc.nextInt();
             }
         }

         System.out.println("Normal Matrix is: ");
         for(int i=0;i<m;i++)
         {
             for(int j=0;j<n;j++)
             {
                System.out.print(matrix[i][j] +" ");
             }
              System.out.println();
         }

         for(int i=0;i<m;i++)
         {
             for(int j=0;j<n;j++)
             {
                 transposeMatrix[i][j] = matrix[j][i] ;
             }
         }

         System.out.println("transpose Matrix is: ");
         for(int i=0;i<m;i++)
         {
             for(int j=0;j<n;j++)
             {
                System.out.print(transposeMatrix[i][j] +" ");
             }
              System.out.println();
         }
        sc.close();
     }
}

/*-------------------OUTPUT-----------------------
    Enter row of matrix A:
    3
    Enter column of matrix A:
    3
    enter element of matrix: 
    1
    5
    8
    9
    2
    6
    0
    10
    3
    Normal Matrix is: 
    1 5 8
    9 2 6
    0 10 3
    transpose Matrix is:
    1 9 0
    5 2 10
    8 6 3

*/    