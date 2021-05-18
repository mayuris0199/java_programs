/*
     Accept two dimensional array numbers and print it.
*/    
import java.util.Scanner;
public class Q7 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("enter array size= ");
        n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("enter array element = ");

        for(int i=0; i<n;i++)
        {
            a[i] = sc.nextInt();
        }
    sc.close();
    }
}
