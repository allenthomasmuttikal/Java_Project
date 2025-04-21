import java.util.Scanner;
public class Sunny_Number
{
    public static void main(String args[])
    {
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=ob.nextInt();
        int next_N=n+1;
        if(Math.sqrt(n+1)%1==0)
        System.out.println("It is a Sunny Number");
        else
        System.out.println("Not a sunny number");
        
    }
}
