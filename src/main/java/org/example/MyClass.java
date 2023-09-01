package org.example;

import java.util.Scanner;

public class MyClass
{

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int[] inputs = new int[3];
            for (int i = 0; i < 3; i++)
            {
                System.out.print("Enter a Number: ");
                inputs[i] = input.nextInt();
            }
            findLowestNumber(inputs);
            findLargestNumber(inputs);
        }
    private static void findLowestNumber(int[] inputs)
    {
        int lowestNumber = inputs[0];
        if (inputs[1] < inputs[0])
        {
            if (inputs[2] < inputs[1])
            {
                lowestNumber = inputs[2];
            }
            else
            {
                lowestNumber = inputs[1];
            }
        }
        else if (inputs[2] < inputs[0])
        {
                lowestNumber = inputs[2];
        }
        else
        {
            lowestNumber = inputs[0];
        }

        System.out.println("Lowest Number: " + lowestNumber);
    }
    private static void findLargestNumber(int[] inputs)
    {
        int largestNumber = inputs[0];
        if (inputs[1] > inputs[0])
        {
            if (inputs[2] > inputs[1])
            {
                largestNumber = inputs[2];
            } else
            {
                largestNumber = inputs[1];
            }
        } else if (inputs[2] > inputs[0])
        {
            largestNumber = inputs[2];
        } else
        {
            largestNumber = inputs[0];
        }

        System.out.println("Largest Number: " + largestNumber);
    }
}