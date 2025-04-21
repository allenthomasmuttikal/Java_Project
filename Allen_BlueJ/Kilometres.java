import java.util.Scanner;
/**
 * This program calculates the fare depending on the distance travelled based on the slab defined.
 * upto 5  km = Rs.50.
 * next 10 km = Rs.12/km.
 * next 20 km = Rs.13/km.
 * further distance=Rs.15/km
 * 
 * @author (Allen Thomas.M)
 * @author email (allenthomasmuttikal@gmail.com)
 * @author git(https://github.com/allenthomasmuttikal/Java_Project)
 * @version (v1.0)
 */
public class Kilometres
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter the distance travelled in kilometeres");
        int dist = ob.nextInt();
        int fare = 0;
        if(dist <= 5)
        fare = 50;
        else if(dist > 5 && dist <= 15)
        fare = 50 + 12 * (dist-5);
        else if(dist > 15 && dist <= 35)
        fare = 50 + (12*10) + 13 * (dist-15);
        else
        fare = 50 + (12*10) + (13*20) + 15 * (dist-35);
        System.out.println("Output:");
        System.out.println("The fare to be paid for "+dist+" kilometers travelled is: \u20B9"+fare);
    }
}