import java.util.Scanner;
/**
 * This program calculates and displays the number of years,months and days based on the number of days entered.
 *
 * @author (Allen Thomas.M)
 * @author email (allenthomasmuttikal@gmail.com)
 * @author git(https://github.com/allenthomasmuttikal/Java_Project)
 * @version (v1.0)
 */
public class DAYS
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter the number of days");
        int days = ob.nextInt();
        int year = days/365;
        int months = (days%365) / 30;
        int D = (days%365) % 30;
        System.out.println("Output:");
        System.out.println("The number of years are : "+year);
        System.out.println("The number of months are : "+months);
        System.out.println("The number of days are : "+D);
    }
}