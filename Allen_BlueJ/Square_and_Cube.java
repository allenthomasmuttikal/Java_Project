import java.util.Scanner;
/**
 * This program calculates and displays the sqaure and cube of the entered number
 *
 * @author (Allen Thomas.M)
 * @author email (allenthomasmuttikal@gmail.com)
 * @author git(https://github.com/allenthomasmuttikal/Java_Project)
 * @version (v1.0)
 */
public class Square_and_Cube
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = ob.nextInt();
        int square = num * num,cube = num * num * num;
        System.out.println("Output:");
        System.out.println("The Square of "+num+" is : "+square);
        System.out.println("The cube of "+num+" is : "+cube);
    }
}
