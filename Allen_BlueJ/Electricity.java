import java.util.Scanner;
/**
 * This program calculates and displays the Electricity Bill amount based on the consumption.
 * Note: Units Consumed upto 100 is charged 1.25 Rs/Unit
 *       Units consumed abouve 100 units but below 201 units is charged 1.5 Rs/Unit
 *       Units above 200 are charged at 1.8 Rs/Unit
 *
 * @author (Allen Thomas.M)
 * @author email (allenthomasmuttikal@gmail.com)
 * @author git(https://github.com/allenthomasmuttikal/Java_Project)
 * @version (v1.0)
 */
public class Electricity
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter Consumer Name");
        String name = ob.nextLine();
        System.out.println("Enter Consumer Number");
        int num = ob.nextInt();
        System.out.println("Enter previous reading");
        double pre_read = ob.nextDouble();
        System.out.println("Enter current reading");
        double cur_read = ob.nextInt();
        double units_consumed = cur_read - pre_read;
        double bill = 0.0d;
        if(units_consumed <= 100.0)
        {
           bill = 1.25 * units_consumed;
        }
        else if(units_consumed > 100.0 && units_consumed <= 200)
        bill=(1.25*100.0) + 1.50 * (units_consumed-100);
        else 
        bill=(1.25*100.0) + (1.50*100.0) + 1.80 * (units_consumed-200);
        System.out.println("Output:");
        System.out.println("##########################################################################################");
        System.out.println("################################### BILL RECIEPT  ########################################");
        System.out.println("##########################################################################################");
        System.out.println("Consumer Name\tConsumer Number\tUnits Consumed\tBill Amount");
        System.out.println(name+"\t"+num+"\t"+units_consumed+"\t"+bill);
        System.out.println("##########################################################################################");       
        
    }
}
