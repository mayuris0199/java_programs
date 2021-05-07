/*
  Print all the number divisible by 3 and 5 in the range of 1 to 20.
 */

public class Q5
{
    public static void main(String[] args)
    {
    
      for(int i=1;i<=20;i++)
       {
        if(i%3==0 && i%5==0)
        {
            System.out.println("number divisible by 3 and 5:-"+i);  
        }
       }
    }
    
}

/*----------------OUTPUT-----------------
   
    number divisible by 3 and 5:-15

*/