import java.util.Scanner;
/**
 *This program calculates and displays various tasks based on the user's choice.
 * The 6 options are:
 * 1.print numbers from 1-10
 * 2.print numbers from 10-1
 * 3.flip/reverse a number
 * 4.count and display the number of digits in a number
 * 5.find and display the sum of the digits of a number
 * 6.find and display the factorial of a number
 * 
 * @author (Allen Thomas.M)
 * @author email (allenthomasmuttikal@gmail.com)
 * @author git(https://github.com/allenthomasmuttikal/Java_Project)
 * @version (v1.0)
 */
public class Switch_Case_2
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter 1 to print numbers from 1-10");
        System.out.println("Enter 2 to print numbers from 10-1");
        System.out.println("Enter 3 to flip/reverse a number");
        System.out.println("Enter 4 to count and display the number of digits in a number");
        System.out.println("Enter 5 to find and display the sum of the digits of a number");
        System.out.println("Enter 6 to find and display the factorial of a number");
        int choice = ob.nextInt();
        switch(choice)
        {
            case 1: int a = 1;
                    System.out.println("Output:");
                    while(a <= 10)
                    {
                        System.out.println(a);
                        a++;
                    }
                    break;
                    
            case 2: int b = 10;
                    System.out.println("Output:");
                    while(b >= 1)
                    {
                        System.out.println(b);
                        b--;
                    }
                    break;
                    
            case 3: System.out.println("Enter a number");
                    int num = ob.nextInt();
                    System.out.println("Output:");
                    System.out.println("The reversed number of "+num+" is : ");
                    while(num != 0)
                    {
                        int c = num % 10;
                        System.out.print(c);
                        num /= 10;
                    }
                    break;
                    
            case 4: System.out.println("Enter a number");
                    int number = ob.nextInt();
                    int temp = number;
                    int count = 0;
                    System.out.println("Output:");
                    while(number != 0)
                    {
                        count++;
                        number /= 10;
                    }
                    System.out.println("The number of digits in "+temp+" is : "+count);
                    break;
                    
            case 5: System.out.println("Enter a number");
                    int n = ob.nextInt();
                    int j = n;
                    int sum = 0;
                    while(n != 0)
                    {
                        sum += n % 10;
                        n /= 10;
                    }
                    System.out.println("Output:");
                    System.out.println("The sum of the digits in "+j    +" is : "+sum);
                    break;
                    
            case 6: System.out.println("Enter a number");
                    int d = ob.nextInt();
                    long factorial = 1;
                    int i = 1;
                    while(i <= d)
                    {
                        factorial *= i;
                        i++;
                    }
                    System.out.println("Output:");
                    System.out.println("The factorial of "+d+" is : "+factorial);
                    break;
            default:System.out.println("Invalid Input");         
        }   
    }
}