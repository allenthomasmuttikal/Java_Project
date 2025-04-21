import java.util.Scanner;
public class Fibonacci
{
    public static void main(String args[])
    {
       Scanner ob=new Scanner(System.in);
       System.out.println("Enter the limit");
       int lim=ob.nextInt();
       int a=0,b=1;
       System.out.print(a+","+b);
              for(int c=3;c<=lim;c++)
       {
           int d=a+b;
           System.out.print(","+d);
           a=b;
           b=d;
       }
    }
    }
