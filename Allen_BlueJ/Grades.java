import java.util.Scanner;
/**
 * This program calculates and displays the grade and average percentage recieved by student in PCB
 *
 * @author (Allen Thomas.M)
 * @author email (allenthomasmuttikal@gmail.com)
 * @author git(https://github.com/allenthomasmuttikal/Java_Project)
 * @version (v1.0)
 */
public class Grades
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter Student's Name");
        String name = ob.nextLine();
        System.out.println("Enter Student's marks in Physics, Chemistry and Biology");
        double p = ob.nextDouble();
        double c = ob.nextDouble();
        double b = ob.nextDouble();
        double avg = (p+c+b) / 3;
        System.out.println("Output:");
        System.out.println("Student's Name : "+name);
        if(avg >= 80)
        System.out.println("Grade : You have recieved DISTINCTION");
        else if(avg >= 60 && avg < 80)
        System.out.println("Grade : You have recieved FIRST DIVISION");
        else if(avg >= 45 && avg < 60)
        System.out.println("Grade : You have recieved SECOND DIVISION");
        else if(avg >= 40 && avg < 45)
        System.out.println("Grade : You have PASSED");
        else
        System.out.println("Grade : PROMOTION NOT GRANTED");
        System.out.println("Average Percentage : "+avg+"%");
    }
}