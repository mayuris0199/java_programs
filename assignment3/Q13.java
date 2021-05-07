/*
    print the faonacci series of n numbers.
 */

public class Q13 {
    public static void main(String[] args)
    {
        int a=0,b=1,sum;
        
        for(int i=0;i<=10;i++)
        {
            sum= a + b;
             a = b;
             b = sum;
             
             System.out.print(sum+" + ");
        }
        
    }
    
}


/*----------------OUTPUT-----------------
    
    1 + 2 + 3 + 5 + 8 + 13 + 21 + 34 + 55 + 89 + 144 +

*/