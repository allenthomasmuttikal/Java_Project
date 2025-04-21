import java.util.Scanner;
/**
 * This program checks and displays if the entered number is a Positive or Negative Number.
 *
 * @author (Allen Thomas.M)
 * @author email (allenthomasmuttikal@gmail.com)
 * @author git(https://github.com/allenthomasmuttikal/Java_Project)
 * @version (v1.0)
 */
public class Positive_or_Negative
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = ob.nextInt();
        System.out.println("Output:");
        if(num > 0)
        System.out.println(num+" is a Positive Number");
        else if(num < 0)
        System.out.println(num+" is a Negative Number");
        else
        System.out.println(num+" is zero");
    }
}
