import java.util.Scanner;
/**
 * This program calculates and displays various tasks based on the user's choice.
 * There are a total of 6 choices.
 * 
 * @author (Allen Thomas.M)
 * @author email (allenthomasmuttikal@gmail.com)
 * @author git(https://github.com/allenthomasmuttikal/Java_Project)
 * @version (v1.0)
 */
public class  Switch_Case_4
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter 1 to print the factors of a number");
        System.out.println("Enter 2 to print the sum of the factors of a number");
        System.out.println("Enter 3 to print the fibonacci series till a limit ");
        System.out.println("Enter 4 to print the odd numbers till a limit");
        System.out.println("Enter 5 to print the odd numbers in the reverse order from 30-15");
        System.out.println("Enter 6 to find the sum of the digits in odd positions of a number");
        int choice = ob.nextInt();
        switch(choice)
        {
            case 1: System.out.println("Enter a number");
                    int num = ob.nextInt();
                    int i = 1;
                    System.out.println("Output:");
                    while(i <= num)
                    {
                        if(num % i == 0)
                        System.out.println(i);
                        i++;
                    }
                    break;
                    
            case 2: System.out.println("Enter a number");
                    int number = ob.nextInt();
                    int j = 1; int sum = 0;
                    while(j <= number)
                    {
                        if(number % j == 0)
                        sum+=j;
                        j++;
                    }
                    System.out.println("Output:");
                    System.out.println("The sum of the factors of "+number+" is : "+sum);
                    break;
                    
            case 3: System.out.println("Enter a limit");
                    int limit=ob.nextInt();
                    int a = 0; int b = 1; int c = 3;
                    System.out.println("Output:");
                    System.out.print(a+","+b);
                    while(c <= limit)
                    {
                        int d = a + b;
                        System.out.print(","+d);
                        a = b;
                        b = d;
                        c++;
                    }
                    break;
                    
            case 4: System.out.println("Enter a limit");
                    int lim = ob.nextInt();
                    int k = 1;
                    System.out.println("Output:");
                    while(k <= lim)
                    {
                        if(k % 2 != 0)
                        System.out.println(k);
                        k++;
                    }
                    break;
                    
            case 5: int l = 30;
                    int m = 15;
                    System.out.println("Output:");
                    while(l >= m)
                    {
                        if(l % 2 != 0)
                        System.out.print (l+",");
                        l--;
                    }
                    break;
                    
            case 6: System.out.println("Enter a number");
                    int e = ob.nextInt();
                    int rem = 0;
                    int count = 0;
                    int temp = e;
                    int t = temp;
                    int summation = 0;
                    while(temp != 0)
                    {
                        count++;
                        temp /= 10;
                    }
                    while(e != 0)
                    {
                        rem = e % 10;
                        if(count % 2 != 0)
                        summation+=rem;
                        e /= 10;
                        count--;
                    }
                    System.out.println("Output:");
                    System.out.println("The sum of the digits in odd positions of "+t+" is : "+summation );
                    break;
            default:System.out.println("Invalid Input"); 
        }
    }
}