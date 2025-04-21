import java.util.Scanner;
/**
 * This program compares and displays which among the entered 2 numbers is greater
 *
 * @author (Allen Thomas.M)
 * @author email (allenthomasmuttikal@gmail.com)
 * @author git(https://github.com/allenthomasmuttikal/Java_Project)
 * @version (v1.0)
 */
public class Largest_of_two_Numbers
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter any 2 numbers");
        int a = ob.nextInt();
        int b = ob.nextInt();
        System.out.println("Output:");
        if(a > b)
        System.out.println(a+" is greater than "+b);
        else if(b > a)
        System.out.println(b+" is greater than "+a);
        else
        System.out.println(" Both the numbers are equal");
    }
}