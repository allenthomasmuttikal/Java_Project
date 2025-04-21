import java.util.Scanner;
public class Summer_Java_Code
{
    public static void main(String args[])
    {
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter 1 to display Pattern");
        System.out.println("Enter 2 to display 3 names in the ascending order");
        System.out.println("Enter 3 to check if the entered word is Palindrome");
        int opt=ob.nextInt();
        switch(opt)
        {
            case 1:System.out.println("Enter an odd number as a base for the Pyramid");
                    int base=ob.nextInt();int base1=base;
                    double midvalue1=0.0d;
                    midvalue1=base/2;
                    double midvalue2=Math.ceil(midvalue1);
                    for(double i=midvalue2++;i>=1;i--)
                    {
                        for(int j=1;j<=i;j++)
                        {
                            System.out.print(" ");
                            
                        }
                        for(int k=base;k>=base1;k-=2)
                        {
                            System.out.println("1");
                        }
                        base1-=2;
                                            }
                    break;
                    
            case 2:int rows=5;
             int m=(int)Math.ceil(rows/2);
             System.out.println(m);
                    
                    
                                            
        }
    }
}
