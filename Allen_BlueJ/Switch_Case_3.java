import java.util.Scanner;
/**
 * This program calculates and displays various tasks based on the user's choice.
 * There are a total of 7 different choices
 * 
 * @author (Allen Thomas.M)
 * @author email (allenthomasmuttikal@gmail.com)
 * @author git(https://github.com/allenthomasmuttikal/Java_Project)
 * @version (v1.0)
 */
public class Switch_Case_3
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter 1 to check if a number is a  Palindrome Number");
        System.out.println("Enter 2 to check if a number is an Armstrong Number");
        System.out.println("Enter 3 to check if a number is a Prime Number");
        System.out.println("Enter 4 to check if a number is a Perfect Number");
        System.out.println("Enter 5 to check if a number is a Harshad  Number");
        System.out.println("Enter 6 to check if a number is a Kaprekar Number");
        System.out.println("Enter 7 to check if a number is an Automorphic Number");
        int choice = ob.nextInt();
        switch(choice)
        {
            case 1: System.out.println("Enter a number");
                    int num = ob.nextInt();
                    int temp = num;
                    int reverse = 0;
                    System.out.println("Output:");
                    while(temp != 0)
                    {
                        int r = temp % 10;
                        reverse = reverse * 10 + r;
                        temp /= 10;
                    }
                    if(num == reverse)
                    System.out.println(num+" is a Palindrome Number");
                    else
                    System.out.println(num+" is not a Palindrome Number");
                    break;
                    
            case 2: System.out.println("Enter a number");
                    int number = ob.nextInt();
                    int tem = number;
                    int rem = 0;
                    int sum = 0;
                    System.out.println("Output:");
                    while(tem != 0)
                    {
                        rem = tem % 10;
                        sum += (int)Math.pow(rem,3);
                        tem /= 10;
                    }
                    if(sum == number)
                    System.out.println(number+" is an Armstrong Number");
                    else
                    System.out.println(number+" is not an Armstrong Number");
                    break;
                    
            case 3: System.out.println("Enter a number");
                    int n = ob.nextInt();
                    int i = 1;
                    int count = 0;
                    System.out.println("Output:");
                    while(i <= n)
                    {
                        if(n % i == 0)
                        count++;
                        i++;
                    }
                    if(count == 2)
                    System.out.println(n+" is a Prime Number");
                    else
                    System.out.println(n+" is not a Prime Number");
                    break;
                    
            case 4: System.out.println("Enter a number");
                    int a = ob.nextInt();
                    int s = 0;
                    int j = 1;
                    System.out.println("Output:");
                    while(j < a)
                    {
                        if(a % j == 0)
                        s+=j;
                        j++;
                    }
                    if(s == a)
                    System.out.println(a+" is a Perfect Number");
                    else
                    System.out.println(a+" is not a Perfect Number");
                    break;
                    
            case 5: System.out.println("Enter a number");
                    int b = ob.nextInt();
                    int t = b;
                    int remainder = 0;
                    int summation = 0;
                    System.out.println("Output:");
                    while(t != 0)
                    {
                      remainder = t % 10;
                      summation+=remainder;
                      t /= 10;
                    }
                    if(b % summation == 0)
                    System.out.println(b+" is a Harshad Number");
                    else
                    System.out.println(b+" is not a Harshad Number");
                    break;
                    
            case 6: System.out.println("Enter a number");
                    int c = ob.nextInt();
                    int tempor = c;
                    int add = 0; int first = 0; int second = 0; int tally = 0; int square = 0;
                    while(tempor != 0)
                    {
                        tally++;
                        tempor /= 10;
                    }
                    square = c * c;
                    first = square / (int)Math.pow(10,tally);
                    second = square % (int)Math.pow(10,tally);
                    add = first + second;
                    System.out.println("Output:");
                    if(c == add)
                    System.out.println(c+" is a Kaprekar Number");
                    else
                    System.out.println(c+" is not a Kaprekar Number");
                    break;
                    
            case 7: System.out.println("Enter a number");
                    int d = ob.nextInt();
                    int sq = 0; int temporary = d; int reckon = 0; int last = 0;
                    while(temporary != 0)
                    {
                        reckon++;
                        temporary /= 10;
                    }
                    sq = d * d;
                    System.out.println("The square value of "+d+" is : "+sq);
                    last = sq % (int)Math.pow(10,reckon);
                    System.out.println("Output:");
                    if(d == last)
                    System.out.println(d+" is an Automorphic Number");
                    else
                    System.out.println(d+" is not an Automorphic Number");
                    break;
            default:System.out.println("Invalid Input");          
        }
    }
}