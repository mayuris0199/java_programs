/*
 print the following format.
     7) a
        bc   
        def
        ghij
 */

public class Q14g
{
  public static void main(String[] args)
  {
      {
        int num = 97;
        
        for (int i = 0; i < 4; i++)
        {
            for (int j = 0; j <= i; j++)
            {
                System.out.print((char) num );
               num++;
            }
            System.out.println();
        }
    }
  }
}


/*----------------OUTPUT-----------------
    a
    bc
    def
    ghij

*/