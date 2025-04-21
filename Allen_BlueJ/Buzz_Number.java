import java.util.Scanner;
/**
 * This program checks and displays if the entered number is a Buzz Number
 * 
 * NOTE:In a mathematical context, a "buzz number" is a number that either 
 * ends in the digit 7 or is divisible by 7. A number that satisfies either
 * of these conditions is considered a buzz number.
 * 
 * @author (Allen Thomas.M)
 * @author email (allenthomasmuttikal@gmail.com)
 * @author git(https://github.com/allenthomasmuttikal/Java_Project)
 * @version (v1.0)
 */
public class Buzz_Number
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = ob.nextInt();
        System.out.println("Output:");
        if(num % 7 == 0 || num % 10 == 7)
        System.out.println(num+" is a Buzz Number");
        else
        System.out.println(num+" is not a Buzz Number");
    }
}