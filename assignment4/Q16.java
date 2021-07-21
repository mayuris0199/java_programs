/*
     Accept a name and reverse it.
*/
import java.util.*;
public class Q13 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String s = sc.nextLine();
        char y[] = s.toCharArray();
        int size = y.length;
        char a[] = new char[size];

        int i=0;
        while(i!=size)
        {
           a[size-1-i] = y[i];
           ++i;
        }
        System.out.print("Reverse of given string: ");
        System.out.print(a);
        sc.close();
    }
    
}
/*--------------------OUTPUT-------------------------
    Enter a String: 
    hello , How are you ?
    Reverse of given string: ? uoy era woH , olleh

*/    