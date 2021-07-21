/*
     Accept a name and count the number of vowel.
*/
import java.util.*;
public class Q14 {
    public static void main(String[] args)
    {
        int count=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String s = sc.next();
        
        for(int i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
            {
                count++;
            }
        }
        System.out.println("Number of vowels in the given sentence is: "+count);
        sc.close();
    }
    
}
/*-------------------------OUTPUT--------------------------------
    Enter a sentence: 
    welcomeToJavaWorld
    Number of vowels in the given sentence is: 7

*/    