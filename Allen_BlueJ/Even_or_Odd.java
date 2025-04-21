import java.util.Scanner;
/**
 * This program checks and displays if the entered number is an even or odd number
 *
 * @author (Allen Thomas.M)
 * @author email (allenthomasmuttikal@gmail.com)
 * @author git(https://github.com/allenthomasmuttikal/Java_Project)
 * @version (v1.0)
 */
public class Even_or_Odd
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = ob.nextInt();
        System.out.println("Output:");
        if(num % 2 == 0)
        System.out.println(num+" is an Even Number");
        else
        System.out.println(num+" is an Odd Number");
    }
}
