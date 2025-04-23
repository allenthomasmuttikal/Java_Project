import java.util.Scanner;
/**
 * This program is to display the number of days in a month depending on the user's input.
 * It does it through the  Fall Through Condition.
 * 
 * NOTE: Fall through condition : This condition occurs in the switch control statement 
 * when there is no break keyword mention for the particular case in the switch statement
 * and cause execution of the cases till no break statement occurs or exit from the switch 
 * statement. This condition has its own advantage and disadvantage and it totally depends 
 * upon the type of operation we want in our program. 
 *
 * @author (Allen Thomas.M)
 * @author email (allenthomasmuttikal@gmail.com)
 * @author git(https://github.com/allenthomasmuttikal/Java_Project)
 * @version (v1.0)
 */
public class Days_Months
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter any months number(1-12)");
        int month = ob.nextInt();
        System.out.println("Enter the year");
        int year = ob.nextInt();
        switch(month)
        {
            case 1: 
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:System.out.println("There are 31 days in this month");
                    break;
                    
            case 4:
            case 6:
            case 9:
            case 11:System.out.println("There are 30 days in this month");
                    break;
                    
            case 2: if(year % 400 == 0 && year % 100 == 0)
                    System.out.println("There are 29 days in this month");
                    else if(year % 4 == 0 && year % 100 != 0)
                    System.out.println("There are 29 days in this month");
                    else
                    System.out.println("There are 28 days in this month");
                    break;
            default:System.out.println("Invalid Input"); 
        }
    }
}