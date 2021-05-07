/*
    print the following format.
    6)  a
        ab
        abc
        abcd
 */

public class Q14f 
{
   public static void main(String[] args)
   {
      for(int i=0;i<4;i++) 
      {
          for(int j=0;j<=i;j++)
          {
              System.out.print((char)(j+97));
          }
          System.out.println();
      }
   }
}


/*----------------OUTPUT-----------------
    a
    ab
    abc
    abcd

*/
