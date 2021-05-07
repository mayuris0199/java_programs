/*
  Accept id ,name and basic salary of an employee and calculate the da,hra,ta,
  grossalary, i tax,net salary.
   
  Da = basic salary *5%
  Hra = basic salary * 12%
  Ta = basic salary * 8%
  gross salary = basic salary + Hra +Da +Ta
  i tax = basic salary * 10%
  net salary = gross salary - i tax
 */

import java.util.Scanner;
public class Q10 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int id ;
        int Da,Hra,Ta,i_tax;
        String name;
        double basic_Salary,gross_Salary,net_Salary;
        
        name = sc.nextLine();
        id = sc.nextInt();
        basic_Salary = sc.nextDouble();
        
         Da = (int) ((basic_Salary *5)/100);
         Hra =(int)((basic_Salary * 12)/100);
         Ta =(int) ((basic_Salary * 8)/100);
         gross_Salary = (basic_Salary + Hra +Da +Ta);
         i_tax =(int) ((basic_Salary * 10)/100);
         net_Salary = (gross_Salary - i_tax);
         
         
         System.out.println("employee name:-"+name);
         System.out.println("id of employee:-"+id);
         System.out.println("Da is :-"+Da);
         System.out.println("Hra is:-"+Hra);
         System.out.println("Ta is:-"+Ta);
         System.out.println("gross_Salary:-"+ gross_Salary);
         System.out.println("i_tax:-"+i_tax);
         System.out.println("net_Salary is :-"+net_Salary);
         sc.close();
    }
    
}

/*--------------------OUTPUT-------------------
    Sham
    67853
    65000
    employee name:-Sham
    id of employee:-67853
    Da is :-3250
    Hra is:-7800
    Ta is:-5200
    gross_Salary:-81250.0
    i_tax:-6500
    net_Salary is :-74750.0
*/   