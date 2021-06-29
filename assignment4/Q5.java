/*  Accept 5 number in an array such that the square is stored in the next elements of the array.
    Ex. 5  25  12  144  3   9 . 
*/
import java.util.Scanner;
public class Q5
  {
     public static void main(String[] args)
     {
         Scanner sc = new Scanner(System.in);
         int n;
         int arr[] = new int[10];
         
         System.out.println("Enter the element in array");
         for(int i=0;i<10;i++)
         {
             if(i%2==0)
             {
                 n=sc.nextInt();
                 arr[i]=n;
                 arr[i+1]=n*n;
             }
         }
         System.out.println("Square of array element");
         for(int j=0;j<10;j=j+2)
         {
             System.out.println(arr[j]+" --> "+arr[j+1]);
         }
     }
}

/*---------------------OUTPUT-----------------

    Enter the element in array
    2
    5
    7
    4
    9
    Square of array element
    2 --> 4
    5 --> 25
    7 --> 49
    4 --> 16
    9 --> 81

*/