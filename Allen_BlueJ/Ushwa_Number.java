import java.util.Scanner;
/**
 * This program checks and displays if the entered 4 digit number is an Ushwa Number
 *
 * @author (Allen Thomas.M)
 * @author email (allenthomasmuttikal@gmail.com)
 * @author git(https://github.com/allenthomasmuttikal/Java_Project)
 * @version (v1.0)
 */
public class Ushwa_Number
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter a 4 digit number");
        int num = ob.nextInt();
        int number = num;
        int sum = 0;
        while(num != 0)
        { 
            sum += num % 10;
            num /= 10; 
        }
        int summation = number % 10 + number / 1000;
        System.out.println("Output:");
        if(2 * summation == sum)
        {
            System.out.println(number+" is an Ushwa Number");
        }
        else
        System.out.println(number+" is not an Ushwa Number");
}
}