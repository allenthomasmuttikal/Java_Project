import java.util.Scanner;
public class Sum_and_Product
{
    public static void main(String args[])
    {
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter 2 numbers");
        int a=ob.nextInt();
        int b=ob.nextInt();
        int sum=a+b;
        int prod=a*b;
        System.out.println("The sum of the 2 numbers is "+sum);
        System.out.println("The product of the 2 numbers is  "+prod);
            }
}
