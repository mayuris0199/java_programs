/*
  print all prime numbers from 1 to 50.
 */

public class Q12
{
  public static void main(String[] args)
  {  
        int i,flag=0;
          
        System.out.println("prime nubers from 1 to 50 ");
        for( i =2; i<=50;i++ )
        {    
            flag=0;
         for(int j=2;j<i;j++)
           {
             if(i%j==0)
             {
                 flag=1;
                 break;
             }
           }  
         if(flag==0)
         {
             System.out.println(i);
         } 
        } 
         
      
      }  
}

/*----------------OUTPUT-----------------
    prime nubers from 1 to 50 
    
    2
    3
    5
    7
    11
    13
    17
    19
    23
    29
    31
    37
    41
    43
    47

*/