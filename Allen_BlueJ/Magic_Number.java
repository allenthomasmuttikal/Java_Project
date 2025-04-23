import java.util.Scanner;
/**
 * The program calls an entered number as a magic number if the repeated sum of its digits equals to 1 
 * Example: 253 -> 2 + 5 + 3 = 10 -> 1 + 0 = 1 (Hence 253 is a Magic Number)
 * Example: 254 -> 2 + 5 + 4 = 11 -> 1 + 1 = 2 (254 is not a Magic Number since repeated sum of its digits not 1)
 *
 * @author (Allen Thomas.M)
 * @author email (allenthomasmuttikal@gmail.com)
 * @author git(https://github.com/allenthomasmuttikal/Java_Project)
 * @version (v1.0)
 */
public class Magic_Number
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = ob.nextInt();
        int n = num; int a = 0;
        while(num > 9)
        {
            int sum = 0;
            while(num != 0)
            {
                a = num % 10;
                sum += a;
                num /= 10;
            }
            num = sum;
        }
        System.out.println("Output:");
        System.out.println("The repeated sum of digits is : "+num);
        if(num == 1)
        System.out.println(n+" is a Magic Number");
        else
        System.out.println(n+" is not a Magic Number");
    }
}