package employee2;
import java.util.Scanner;
public class Employee2
{
    String Name;
    int Num;
    double grossSalary;
    public static void main(String[] args)
    {
      String cat;
         Scanner scan = new Scanner(System.in);
         Employee2 emp=new Employee2();
         monthlyEmp month=new monthlyEmp();
      System.out.print("Enter your number:");
        emp.Num = scan.nextInt();
      System.out.print("Enter your Name:");
        emp.Name=scan.next();
      System.out.print("Enter your payment period:");
        cat = scan.next();
         
     if(null == cat)
      {System.out.print("no category specified");}
     else switch (cat) {
         case "month":
             System.out.println("category 1[monthly] OKAY!!....");
             System.out.println("Enter your gross salary:");
              month.grossSalary=scan.nextDouble();
              month.salary();
            System.out.println();  
            System.out.println("EMPLOYEE DESCROPTION:");
            System.out.println("=====================");  
            System.out.println("Number     :"+emp.Num);  
            System.out.println("Name       :"+emp.Name);  
            System.out.println("Category   :Monthly employee");
            System.out.println("Net salary :"+month.netSalary);
            System.out.println();
           break;
         case "week":
             System.out.println("category 2[weekly] OKAY!!...");
             weeklyEmp week=new weeklyEmp();
             week.salary();
            System.out.println();
            System.out.println("EMPLOYEE DESCROPTION:");
            System.out.println("=====================");  
            System.out.println("Number     :"+emp.Num);  
            System.out.println("Name       :"+emp.Name);  
            System.out.println("Category   :Weekly employee");
            System.out.println("Week wage  :"+week.weekWage); 
            System.out.println();
           break;
         default:
             System.out.print("no category specified");
           break;
        }
    }
}

class monthlyEmp extends Employee2
    {
      double tax,insurance;
      double netSalary;
     public void salary()
       {
        tax =(grossSalary*15)/100;
        insurance=(grossSalary*5)/100;
        netSalary=grossSalary-tax-insurance;
       } 
    }
 
class weeklyEmp extends Employee2
    {
      double weekWage;
      double hourRate;
      int nbrHours;
    public void salary()
       {  
        Scanner scan2 = new Scanner(System.in);
           System.out.print("Enter your hourly rate:");
             hourRate =scan2.nextDouble();
           System.out.print("Enter the number of hours worked this week:"); 
             nbrHours=scan2.nextInt();
         if(nbrHours<=40)
           weekWage=nbrHours*hourRate;
         else
           {
            int extra=nbrHours-40;
            double hourRate2=hourRate * 1.1;
            weekWage=40*hourRate+(extra*hourRate2);
           }
       }
    }

