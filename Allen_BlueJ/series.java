import java.util.Scanner;
/**
 * This program displays certain patterns based on the user's choice.
 *
 * @author (Allen Thomas.M)
 * @author email (allenthomasmuttikal@gmail.com)
 * @author git(https://github.com/allenthomasmuttikal/Java_Project)
 * @version (v1.0)
 */
public class series
{
    public static void main(String args[])
    {
       Scanner ob = new Scanner(System.in);
       System.out.println("Enter numbers from 1-10 to display respective patterns");
       int choice = ob.nextInt();
         switch(choice)
       {              
           case 1:System.out.println("Output:");
                  for(int n = 1;n <= 5;n++)
                  {
                    for(int j = 1;j <= n;j++)
                    System.out.print(n);
                    System.out.println("");
                  }
                  break;
                  
           case 2:System.out.println("Output:");
                   for(int a = 6;a >= 1;a--)
                  {
                    for(int b = 1;b <= a;b++)
                    System.out.print(a);
                    System.out.println("");
                  }
                  break;
                  
           case 3: System.out.println("Output:");
                   for(int c = 9;c >= 1;c -= 2 )
                   {
                    for(int d = 5;d >= 1;d--)
                    System.out.print(c);
                    System.out.println("");
                   }
                   break;
                   
           case 4: System.out.println("Output:");
                   for(int e = 9;e >= 1;e -= 2)
                   {
                       for(int f = e;f <= 9;f += 2)
                       System.out.print(f);
                       System.out.println("");
                   }
                   break;
            
           case 5: System.out.println("Output:");
                   for(int g = 9;g >= 1;g -= 2)
                  { 
                   for(int h = 9;h >= g;h -= 2)
                   System.out.print(h);
                   System.out.println("");
                   
                   }
                   break;
                   
           case 6: System.out.println("Output:");
                   for(int i =9;i >= 1;i -= 2)
                   {
                     for(int k = i;k >= 1;k -= 2)
                     System.out.print(k);
                     System.out.println("");
                   }       
                  break;
                  
           case 7:System.out.println("Output:");
                   for(int o = 5;o >= 1;o--)
                  {
                      for(int p = o;p >= 1;p--)
                      System.out.print(p);
                      System.out.println("");
                  }
                  break;
                         
           case 8: System.out.println("Output:");
                   for(int q = 1;q <= 9;q += 2)
           
                    {
                       for(int r = 9;r >= q;r -= 2)
                        {
                           System.out.print(r);
                       }
                       System.out.println("");
                       }
                  break;
                  
           case 9:int count = 1;
                   System.out.println("Output:");
                       for(int t = 1;t <= 10;t++)
                   {                                         
                       for(int s = 1;s <= t;s++)
                       {
                          System.out.print(count+" ");
                          count++;
                       }
                          System.out.println("");
                          if(count > 10)
                          break;
                   }
                    break;
                    
           case 10:System.out.println("Output:");
                   for(int l = 1;l <= 5;l++)
                  {
                      for(int m = 1;m <= l;m++)
                      {
                          if(m % 2 == 0)
                          System.out.print("#");
                          else
                          System.out.print("*");
                                                }
                      System.out.println("");
                  }
                  break;         
           
           default:System.out.println("Invalid Input");       
       }
    }
}   