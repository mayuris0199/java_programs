/*
    Accept roll number,name,marks of english,hindi,marathi and calculate the 
    following total marks, percentage and print all details of student
 */

import java.util.Scanner;
public class Q9 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int roll_No,eng,hindi,marathi;
        double total_Marks,per;
        long number;
        String name;
        
         name = sc.nextLine();
         roll_No = sc.nextInt();
         number = sc.nextLong();
         eng = sc.nextInt();
         hindi = sc.nextInt(); 
         marathi = sc.nextInt();
         
      
         total_Marks = (int)(eng+hindi+marathi);
         
         per = (double)((total_Marks*100)/300);
         
         System.out.println("name of student="+name);
         System.out.println("roll number="+roll_No);
         System.out.println("number ="+number);
         System.out.println("total marks out of 300 is="+total_Marks);
         System.out.println("percentage of student="+per); 
         sc.close();  
    }
}

/*-----------------OUTPUT-----------------------
    Ram 
    23
    1243567890
    89
    90
    99
    name of student=Ram 
    roll number=23
    number =1243567890
    total marks out of 300 is=278.0
    percentage of student=92.66666666666667
*/    