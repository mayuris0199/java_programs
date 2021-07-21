/*
     Accept a name and find its length.
*/
import java.util.*;
public class Q15 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String s = sc.next();
        System.out.println(s.length());
        sc.close();
    }
    
}

/*-------------------OUTPUT---------------------

    Enter a String: 
    welcome!
    8
*/    