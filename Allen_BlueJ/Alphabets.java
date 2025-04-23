import java.util.Scanner;
/**
 * This program displays, either all the upper case(A-Z) or lower case(a-z) alphabets depending on the user's choice.
 *
 * @author (Allen Thomas.M)
 * @author email (allenthomasmuttikal@gmail.com)
 * @author git(https://github.com/allenthomasmuttikal/Java_Project)
 * @version (v1.0)
 */
public class Alphabets
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter 1 to print all the upper case alphabets from A-Z");
        System.out.println("Enter 2 to print all the lower case alphabets from a-z");
        int choice = ob.nextInt();
        switch(choice)
        {
          case 1: int a = 65;
                System.out.println("Output:");
                while(a <= 90)
                {
                   System.out.println((char)(a)); 
                   a++;
                }
                break;
                
          case 2: int b = 97;
                  System.out.println("Output:");
                  while(b <= 122)
                  {
                      System.out.println((char)(b));
                      b++;
                  }
                  break;
          default:System.out.println("Invalid Input");         
        }
    }
}