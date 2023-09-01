package org.example;

import java.util.Scanner;

public class MyClass2
{

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        NumberDivisibleBy(input);
    }
    private static void NumberDivisibleBy(Scanner input)
    {
        int divisor = 3;
        System.out.print("Enter the number:");
        int number = input.nextInt();

        if(number % divisor == 0)
        {
            System.out.println("The number is divisible by three.");
        }
        else
        {
            System.out.println("The number is not divisible by three.");
        }
    }
}