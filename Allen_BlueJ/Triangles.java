import java.util.Scanner;
/**
 * This program calculates if a triangle is possible from the entered dimension. In addition it classifies the type of triangle.
 *
 * @author (Allen Thomas.M)
 * @author email (allenthomasmuttikal@gmail.com)
 * @author git(https://github.com/allenthomasmuttikal/Java_Project)
 * @version (v1.0)
 */
public class Triangles
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter dimensions of 3 sides of a triangle");
        int a = ob.nextInt();
        int b = ob.nextInt();
        int c = ob.nextInt();
        System.out.println("Output:");
        if(a+b>c && b+c>a && a+c>b)
        {
           System.out.println("Triangle is Possible");   
        
          if(a == b && b == c)
          System.out.println("It is an Equilateral Triangle");
          else if(a == b || b == c || a == c)
          System.out.println("It is an Isosceles Triangle");
          else
          System.out.println("It is a Scalene Triangle");
        }
        else
        System.out.println("Triangle is not Possible");
    }
}