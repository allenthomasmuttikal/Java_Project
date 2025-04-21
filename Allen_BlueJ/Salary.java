import java.util.Scanner;
/**
 * This program calculates and displays the PF deducted and amount recieved as HRA and EDU.
 * Based on basic salary of the Employee
 *
 * @author (Allen Thomas.M)
 * @author email (allenthomasmuttikal@gmail.com)
 * @author git(https://github.com/allenthomasmuttikal/Java_Project)
 * @version (v1.0)
 */
public class Salary
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter Employee's Name");
        String name = ob.nextLine();
        System.out.println("Enter Employee's Basic Salary");
        double basic_pay = ob.nextDouble();
        double pf = (12.0/100.0) * basic_pay;
        double edu = (20.0/100.0) * basic_pay;
        double hra = (10.0/100.0) * basic_pay;
        System.out.println("Output:");
        System.out.println("The amount deducted as Provident Fund : "+pf);
        System.out.println("The amount recieved for Education : "+edu);
        System.out.println("The amount recieved for House Rent Allowance : "+hra);
    }
}