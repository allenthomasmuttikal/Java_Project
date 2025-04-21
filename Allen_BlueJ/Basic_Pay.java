import java.util.Scanner;
/**
 * This program calculates and displays the Dearness Allowance,House Rent Allowance,Gross Salary,Provident Fund deducted and Net Salary.
 * Based on the Basic Salary of the Employee
 *
 * @author (Allen Thomas.M)
 * @author email (allenthomasmuttikal@gmail.com)
 * @author git(https://github.com/allenthomasmuttikal/Java_Project)
 * @version (v1.0)
 */
public class Basic_Pay
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter Employee's Name");
        String name = ob.nextLine();
        System.out.println("Enter Employee's Basic Salary");
        double basic_pay = ob.nextDouble();
        double pf = (12.5/100.0) * basic_pay;
        double da = (30.0/100.0) * basic_pay;
        double hra = (15.0/100.0) * basic_pay;
        double gross=basic_pay+da+hra;
        double net=gross-pf;
        System.out.println("Output:");
        System.out.println("Employee's Name : "+name);
        System.out.println("Basic Salary : "+basic_pay);
        System.out.println("Dearness Allowance : "+da);
        System.out.println("House Rent Allowance : "+hra);
        System.out.println("Gross Salary : "+gross);
        System.out.println("Provident Fund deducted : "+pf);
        System.out.println("Net Salary : "+net);
    }
}