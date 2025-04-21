import java.util.Scanner;
/**
 * This program calculates and displays the Simple Interest,Compound Interest and the Difference between the two.
 *
 * @author (Allen Thomas.M)
 * @author email (allenthomasmuttikal@gmail.com)
 * @author git(https://github.com/allenthomasmuttikal/Java_Project)
 * @version (v1.0)
 */
public class Interest
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter the principal");
        double P = ob.nextDouble();
        System.out.println("Enter the rate of interest");
        double R = ob.nextDouble();
        System.out.println("Enter the duration in years");
        double D = ob.nextDouble();
        double SI = (P*R*D) / 100.0;
        double A = P * Math.pow((1+R / 100.0), D);
        double CI = A - P;
        double DIFF = CI - SI;
        System.out.println("Output:");
        System.out.println("The Simple Interest is : "+SI);
        System.out.println("The Compound Interest is : "+CI);
        System.out.println("The Difference between Simple and Compound Interest is : "+DIFF);
    }
}