import java.util.Scanner;
/**
 * This program checks and displays if the entered number is a Sunny Number.
 *
 * @author (Allen Thomas.M)
 * @author email (allenthomasmuttikal@gmail.com)
 * @author git(https://github.com/allenthomasmuttikal/Java_Project)
 * @version (v1.0)
 */
public class Sunny_Number
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = ob.nextInt();
        int next_N = n + 1;
        System.out.println("Output:");
        if(Math.sqrt(n + 1) % 1 == 0)
        System.out.println(n+" is a Sunny Number");
        else
        System.out.println(n+" is not a Sunny Number");
        
    }
}
