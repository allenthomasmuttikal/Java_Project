import java.util.Scanner;
public class Tribonacci 
{
    public static void main(String args[])
    {
       Scanner ob=new Scanner(System.in);
       System.out.println("Enter the limit");
       int lim=ob.nextInt();
       int a=0,b=1;  
       int sum=1;
       System.out.print(a+","+b+","+sum);
              for(int c=4;c<=lim;c++)
       {
           int d=a+b+sum;
           System.out.print(","+d);
           a=b;
           b=sum;
           sum=d;
       }
    }
    }
