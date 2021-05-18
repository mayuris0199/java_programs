/*
    Accept 5 numbers in an array such that the square is stored in the next elements of the array.
     [5 , 25, 12 , 144 , 3 , 9] 
*/
import java.util.Scanner;
 public class Q5 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n,i,oddind=1;
        System.out.print("Enter array size= ");
        n= sc.nextInt();
        int arr[] = new int[n]; 
        int square = arr[0];
        System.out.println("Enter array element= ");
        while(true)
        {
            while(oddind <n && arr[oddind]%2 == 1)
                   oddind +=2;

            break;       
        }

        for( i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        } 
        for(int num: arr)
        {
             square = num *num; 
             arr[oddind] = square ;
        }
        System.out.println(arr[oddind]);
        
        sc.close();
    }
}
