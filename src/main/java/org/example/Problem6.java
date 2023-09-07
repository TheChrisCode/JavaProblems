package org.example;
import java.util.Scanner;

public class Problem6
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        NumberDivisibleByThree(input);
    }
    
    private static void NumberDivisibleByThree(Scanner input)
    {
        System.out.print("Enter the number:");
        int number = input.nextInt();

        if(number % 3 == 0)
        {
            System.out.println("The number is divisible by three.");
        }
        else
        {
            System.out.println("The number is not divisible by three.");
        }
    }
}
