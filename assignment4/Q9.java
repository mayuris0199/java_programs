/*
    perform addition of two 2-D-array.
*/
import java.util.Scanner;
public class Q9 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int m,n;
    
        System.out.print("enter number of rows of matrix A : ");
        m = sc.nextInt();
        System.out.print("enter number of columns of matrix A : ");
        n = sc.nextInt();
        int a[][] = new int[m][n];

        System.out.print("enter number of rows of matrix B : ");
        m = sc.nextInt();
        System.out.print("enter number of columns of matrix B : ");
        n = sc.nextInt();
        int b[][] = new int[m][n];

        int c[][] = new int[m][n];

        System.out.println("enter array element of matrix A: ");
        for(int i=0; i<m;i++)
          {
              for(int j=0;j<n;j++)
               {
                 a[i][j] =sc.nextInt(); 
               }
          }  
        System.out.println("enter array element of matrix B: ");   
        for(int i=0; i<m;i++)
          {
              for(int j=0;j<n;j++)
               {
                 b[i][j] =sc.nextInt();
               }
          }   

          for(int i=0; i<m;i++)
          {
              for(int j=0;j<n;j++)
               {
                 c[i][j] = a[i][j] + b[i][j];
               }
          }   

          System.out.println("Addition of array element is:");
       for(int i=0;i<m;i++)
        {
           for(int j=0;j<n;j++)
             {
               System.out.print(c[i][j]+" ");
             }
             System.out.println();
        }     
          sc.colse();  
    }
    
}
/*------------------OUTPUT---------------------
  enter number of rows of matrix A : 3
  enter number of columns of matrix A : 3
  enter number of rows of matrix B : 3
  enter number of columns of matrix B : 3
  enter array element of matrix A: 
  1  
  6
  9
  3
  8
  5
  2
  3
  0
  enter array element of matrix B: 
  1
  5
  7
  0
  3
  4
  2
  7
  1
  Addition of array element is:
  2 11 16
  3 11 9
  4 10 1
  
*/