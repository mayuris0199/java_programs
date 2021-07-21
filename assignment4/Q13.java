/*
     Accept a name and convert it into UpperCase.
*/
import java.util.*;
public class Q13 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String s = sc.next();
        System.out.println(s.toUpperCase());
        sc.close();
    }
    
}
/*-----------------------OUTPUT-----------------
    Enter a String: 
    mayuri
    MAYURI
    
*/    