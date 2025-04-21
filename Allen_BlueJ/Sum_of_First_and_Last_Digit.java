import java.util.Scanner;
/**
 * This program calculates and displays the sum of the first and last digit of the entered 3 digit number
 *
 * @author (Allen Thomas.M)
 * @author email (allenthomasmuttikal@gmail.com)
 * @author git(https://github.com/allenthomasmuttikal/Java_Project)
 * @version (v1.0)
 */
public class Sum_of_First_and_Last_Digit
{
  public static void main(String args[])
  {
     Scanner ob = new Scanner(System.in);
     System.out.println("Enter the 3 digit number");
     int num = ob.nextInt();
     int first = num / 100,last = num % 10,sum = first + last;
     System.out.println("Output:");
     System.out.println("The first digit is : "+first);
     System.out.println("The last digit is : "+last);
     System.out.println("The sum of the first and last digit is : "+sum);
  }
}

