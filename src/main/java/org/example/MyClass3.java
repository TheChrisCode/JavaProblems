package org.example;

import java.util.Scanner;

public class MyClass3
{

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        NumberDivisibleBy(input);
    }
    private static void NumberDivisibleBy(Scanner input)
    {
        System.out.print("Enter a Number: ");
        int number1 = input.nextInt();

        System.out.print("Enter a number: ");
        int number2 = input.nextInt();

        if(number2 * 2 % number1 * 3 == 0)
        {
            System.out.println("The second number doubled is divisible by the first number tripled.");
        }
        else
        {
            System.out.println("The second number doubled is not divisible by the first number tripled.");
        }
    }
}