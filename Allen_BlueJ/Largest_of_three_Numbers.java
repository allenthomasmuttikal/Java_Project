import java.util.Scanner;
/**
 * This program checks and displays the Greatest Number of the entered 3 numbers
 *
 * @author (Allen Thomas.M)
 * @author email (allenthomasmuttikal@gmail.com)
 * @author git(https://github.com/allenthomasmuttikal/Java_Project)
 * @version (v1.0)
 */
public class Largest_of_three_Numbers
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter any 3 numbers");
        int a = ob.nextInt(); 
        int b = ob.nextInt();
        int c = ob.nextInt();
        System.out.println("Output:");
        if(a > b && a > c)
        System.out.println(a+" is Greatest");
        else if(b > a && b > c)
        System.out.println(b+" is Greatest");
        else if(c > a && c > b)
        System.out.println(c+" is Greatest");
        else if(a == b && b == c)
        System.out.println(" All 3 numbers are equal");
    }
}