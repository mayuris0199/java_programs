/*
     Accept a name and check whether it is palindrom or not.
*/
import java.util.*;
public class Q17 {
    static boolean isPalindrome(String str)
    {
        int i=0,j=str.length()-1;

        while(i<j)
        {
            if(str.charAt(i)!=str.charAt(j))
            return false;

            i++;
            j--;
        }

        return true;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your String:- ");
        String str = sc.next();

        if (isPalindrome(str))
            System.out.print("String is a palindrom");
        else
            System.out.print("String is not a palindrom"); 
    }
}
/*--------------------OUTPUT-----------------------
    Enter your String:- 
    ABCDEFG
    String is not a palindrom

    OR

    Enter your String:-
    ABCDCBA
    String is a palindrom
*/    