import java.util.Scanner;
/**
 * This program displays a series or the sum of a series depending on the user's choice,using for loops.
 *
 * @author (Allen Thomas.M)
 * @author email (allenthomasmuttikal@gmail.com)
 * @author git(https://github.com/allenthomasmuttikal/Java_Project)
 * @version (v1.0)
 */
public class Series1
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter 1 to display series 1");
        System.out.println("Enter 2 to print the sum of series 2");
        System.out.println("Enter 3 to print the sum of series 3");
        System.out.println("Enter 4 to print the sum of series 4");
        System.out.println("Enter 5 to display series 5");
        System.out.println("Enter 6 to display series 6");
        int choice = ob.nextInt();
        switch(choice)
        {
            case 1: System.out.println("Enter a limit");
                    int limit = ob.nextInt(); int s = 0;
                    System.out.println("Output:");
                    System.out.println("The series is : ");
                    for(int i = 0;i < limit;i++)
                    {
                        s += (int)Math.pow(10,i);
                        System.out.print(s+" ");
                    }
                    break;
                    
            case 2: System.out.println("Enter a value for variable 'a' ");
                    int a = ob.nextInt();int sum = 0;
                    for(int j = 1;j <= a;j++)
                    {
                        sum += (int)Math.pow(a,j);
                    }
                    System.out.println("Output:");
                    System.out.println("The sum of the series is : "+sum);
                    break;
            case 3: System.out.println("Enter a value for variable 'a' ");
                    int c = ob.nextInt();double total=0.0d;
                    for(int l = 1;l <= 20;l++)
                    {
                        total += (c * l);
                    }
                    System.out.println("Output:");
                    System.out.println("The sum of the series is : "+total);
                    break;
                    
            case 4: int tally = 0;
                    for(int m = 1;m <= 19;m++)
                    {
                        tally += (m * (m + 1) );
                    }
                    System.out.println("Output:");
                    System.out.println("The sum of the series is : "+tally);
                    break;
            
            case 5: System.out.println("Enter a limit");
                    int e = ob.nextInt();
                    System.out.println("Output:");
                    System.out.println("The series is : ");
                    for(int o = 1;o <= e;o++)
                    {
                        System.out.print((int)Math.pow(o,3) - 1+",");
                    }
                    break;
                    
            case 6: System.out.println("Enter a limit");
                    double f = ob.nextDouble();
                    System.out.println("Output:");
                    System.out.println("The series is : ");
                    for(double p = 1.50;p <= f;p += 1.50)
                    {
                        System.out.print(p+",");
                    }
                    break;
            default:System.out.println("Invalid Input"); 
        }
    }
}