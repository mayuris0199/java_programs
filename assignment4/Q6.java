/*
    Accept 5 numbers and sort them in accending order.
*/
import java.util.Scanner;
public class Q6
 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n,temp=0;
        System.out.print("Enter Array size = ");
        n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter Array elements = ");
        
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }

        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(arr[i] > arr[j])
                {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                   
                }
            }
        }

         System.out.println("Ascending Order:");

        for(int i=0;i<n-1;i++)
        {
            System.out.println(arr[i] + " ");
        }
        System.out.println(arr[n-1]);
      sc.close();
    }
 }

 /*----------------OUTPUT-------------------

    Enter Array size = 5
    Enter Array elements = 
    20
    30
    34
    1
    89
    Ascending Order:
    1
    20
    30
    34
    89

*/    