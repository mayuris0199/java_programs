/*
     Accept a name and print it vertically.
*/
import java.util.*;
public class Q12 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Name: ");
        String s = sc.next();
        System.out.println();
        System.out.println("vertical string is:");
        for(int i=0;i<s.length();i++)
        {
            System.out.println(s.charAt(i));
        }
        sc.close();
    }
  
}

/*--------------------OUTPUT----------------------
    Enter Your Name: 
    Welcome

    vertical string is:
    W
    e
    l
    c
    o
    m
    e

*/    