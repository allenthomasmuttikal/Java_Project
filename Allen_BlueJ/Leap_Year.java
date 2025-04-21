import java.util.Scanner;
/**
 * This program checks and displays if the entered year is a Leap Year.
 *
 * @author (Allen Thomas.M)
 * @author email (allenthomasmuttikal@gmail.com)
 * @author git(https://github.com/allenthomasmuttikal/Java_Project)
 * @version (v1.0)
 */
public class Leap_Year
{
     public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter the year");
        int year = ob.nextInt();
        System.out.println("Output:");
        if(year % 4 == 0 && year % 100 != 0) // Leap Year is divisible by 4 and not by 100(not a century year).
        System.out.println(year+" is a Leap Year");
        else if(year % 100 == 0 && year % 400 == 0) // Leap year is divisible by both 100 and 400. 
        System.out.println(year+" is a Leap Year");
        else
        System.out.println(year+" is not a Leap Year");
    }
}