import java.util.Scanner;
/**
 * This program calculates and displays the area of a circle with the entered radius
 *
 * @author (Allen Thomas.M)
 * @author email (allenthomasmuttikal@gmail.com)
 * @author git(https://github.com/allenthomasmuttikal/Java_Project)
 * @version (v1.0)
 */
public class Area_of_Circle
{
    public static void main(String args[])
    {
      Scanner ob = new Scanner(System.in);
      float pi = 3.14f;
      float radius = 0.0f,area = 0.0f;
      System.out.println("Enter the radius");
      radius = ob.nextFloat();
      area = pi * radius * radius;
      System.out.println("Output:");
      System.out.println("The area of the circle with radius "+radius+" is : "+area);
    }
}
