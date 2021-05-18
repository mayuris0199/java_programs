/* 
    Accept 5 numbers in an array and print the max no in array.
*/
import java.util.Scanner;
public class Q4 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("enter size of array:- ");
        n= sc.nextInt();
        int array[] = new int[n];
        int largest = array[0];
        System.out.println("enter elements");
        for(int i=0;i<n;i++)
        {
            array[i] = sc.nextInt();
        }
        for(int num : array)
        {
           if(largest < num)
               {
                   largest = num ;
               }
        }
         System.out.println("largest element is= "+largest);
        sc.close();
    }
}

/*------------------OUTPUT-----------------------
    enter size of array:- 
    5
    enter elements
    34
    67
    4
    9
    45
    largest element is= 67
*/    