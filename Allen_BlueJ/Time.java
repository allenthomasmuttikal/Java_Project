import java.util.Scanner;
/**
 * This program calculates and displays the time in hours, minutes and seconds, when the time is entered in seconds
 *
 * @author (Allen Thomas.M)
 * @author email (allenthomasmuttikal@gmail.com)
 * @author git(https://github.com/allenthomasmuttikal/Java_Project)
 * @version (v1.0)
 */
public class Time
{
    public static void main(String args[])
    {
        /*
         * 1 min=60sec
         1 hr=60*60sec=3600secs
        18005secs=18005/3600=hrs
        18065secs=18065/3600=5hrs
        18065secs=(18065%3600)/60=1min
            18065secs=(18065%3600)%60=5secs
         */
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter the time in seconds");
        int sec = ob.nextInt();
        int hours = sec / 3600;
        int minutes = (sec % 3600) / 60;
        int seconds = (sec % 3600) % 60;
        System.out.println("Output:");
        System.out.println(sec+" seconds is "+hours+" hours "+minutes+" minutes and "+seconds+" seconds" );
    }
}
