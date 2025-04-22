import java.util.Scanner;
/**
 * This program calculates and displays various tasks based on the user's choice.
 * The 3 options are:
 * 1.square root of a number
 * 2.largest of any 2 numbers
 * 3.area of a circle
 * 
 * @author (Allen Thomas.M)
 * @author email (allenthomasmuttikal@gmail.com)
 * @author git(https://github.com/allenthomasmuttikal/Java_Project)
 * @version (v1.0)
 */
public class Switch_Case_1
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter 1 to find the square root of a number");
        System.out.println("Enter 2 to find the largest of any 2 numbers");
        System.out.println("Enter 3 to find the area of a circle");
        int choice = ob.nextInt();
        switch(choice)
        {
            case 1:System.out.println("Enter a number");
                    int a = ob.nextInt();
                    System.out.println("Output:");
                    System.out.println("The Square Root of "+a+" is : "+Math.sqrt(a));
                    break;
                    
            case 2:System.out.println("Enter any 2 numbers");
                    int b = ob.nextInt();
                    int c = ob.nextInt();
                    System.out.println("Output:");
                    if(b > c)
                    System.out.println(b+" is greater than "+c);
                    else
                    System.out.println(c+" is greater than "+b);
                    break;
                    
             case 3:System.out.println("Enter the radius");
                     double radius = ob.nextDouble();
                     double pi = 3.14d;
                     double area = pi * radius * radius;
                     System.out.println("Output:");
                     System.out.println("The area of  circle with radius "+radius+" is : "+area);
                     break;
        }
    }
}