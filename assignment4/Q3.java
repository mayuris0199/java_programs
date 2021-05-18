/*
    Accept numbers and count the positive numbers,negative numbers and zeros .
*/
import java.util.Scanner;
public class Q3 
{    
    static void Checknumber(int[] arr)
    {
        int positive=0,negative=0,zero=0;

        for(int num : arr)
        {
            if(num>0)
            {
                ++positive;
            }
            else if(num<0)
            {
                ++negative;
            }
            else
            {
                ++zero;
            }  
        }
        System.out.println("count of positive no is = "+positive);
        System.out.println("count of negative no is = "+negative);
        System.out.println("count of zeros present in numbers = "+zero);
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n;
        //int positive=0,negative=0,zeros=0;
        System.out.println("enter size of array");
        n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("enter array element");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
            
        }    
   
        Checknumber(arr);
        sc.close();
    }
}

/*------------------OUTPUT--------------------

    enter size of array
    10
    enter array element
    0
    12
    -45
    0
    4
    -6
    14
    -57
    0
    34
    count of positive no is = 4
    count of negative no is = 3
    count of zeros present in numbers = 3
*/    