import java.util.Scanner;
/**
 * This program calculates and displays the Recipt Slip for Purchase of Electronics Goods (Air-Conditioner / LCD Tv).
 * The Net Cost for the product depends on the Discount obtained based on the Purchase Price and Tax.
 *
 * @author (Allen Thomas.M)
 * @author email (allenthomasmuttikal@gmail.com)
 * @author git(https://github.com/allenthomasmuttikal/Java_Project)
 * @version (v1.0)
 */
public class Electronics_World
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter Consumer Name");
        String name = ob.nextLine();
        System.out.println("The Choices are Air-Conditioner and LCD Tv.\nEnter:\n1. for Air-Conditioner\n2. for LCD Tv");
        int choice = ob.nextInt();
        double purchase = 0.0d;
        double discount = 0.0d;
        double retail_price = 0.0d;
        double tax = 0.0d;
        double payable_amt = 0.0d;
        
        if(choice == 1)
        {
            System.out.println("Enter amount of Air-Conditioner");
            purchase = ob.nextDouble();
            if(purchase <= 20000)
            discount = purchase*5.0/100.0;
            else if(purchase > 20000 && purchase <= 40000)
            discount = purchase * (7.5/100.0);
            else if(purchase > 40000 && purchase <= 60000)
            discount = purchase * (10.0/100.0);
            else 
            discount = purchase * (12.0/100.0);
            
            retail_price = purchase-discount;
            tax = retail_price * (12.5/100.0);
            payable_amt = retail_price + tax;
            System.out.println("#########################################################################");
            System.out.println("######################### Reciept Slip ##################################");
            System.out.println("#########################################################################");
            
            System.out.println("Consumer's name : "+name);
            System.out.println("Price of Air-Conditioner : "+purchase);
            System.out.println("The Discount : "+discount);
            System.out.println("The tax : "+tax);
            System.out.println("The amount to be paid : "+payable_amt);
            System.out.println("#########################################################################");
        }
        else if (choice == 2)
        {
            System.out.println("Enter amount of LCD Tv");
            purchase = ob.nextDouble();
            if(purchase <= 20000)
            discount = purchase * (2.5/100.0);
            else if(purchase > 20000 && purchase <= 40000)
            discount = purchase * (5.0/100.0);
            else if(purchase > 40000 && purchase <= 60000)
            discount = purchase * (7.0/100.0);
            else 
            discount = purchase * (8.5/100.0);
            
            retail_price = purchase - discount;
            tax = retail_price * (12.5/100.0);
            payable_amt = retail_price + tax;
            
            System.out.println("#########################################################################");
            System.out.println("######################### Reciept Slip ##################################");
            System.out.println("#########################################################################");
            System.out.println("Consumer's name : "+name);
            System.out.println("Price of LCD Tv : "+purchase);
            System.out.println("The Discount : "+discount);
            System.out.println("The tax : "+tax);
            System.out.println("The amount to be paid : "+payable_amt);   
            System.out.println("#########################################################################");
        }
        else
            System.out.println("Invalid Choice");
    }
}