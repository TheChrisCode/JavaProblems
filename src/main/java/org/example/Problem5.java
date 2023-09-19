package org.example;

import java.util.Scanner;

public class Problem5
{

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int[] inputs = new int[5];
            for (int i = 0; i < 5; i++)
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
        for (int i = 1; i < 5; i++)
        {
            if(inputs[i] < lowestNumber)
            {
                lowestNumber = inputs[i];
            }
        }

        System.out.println("Lowest Number: " + lowestNumber);
    }
    private static void findLargestNumber(int[] inputs)
    {
        int largestNumber = inputs[0];
        for (int i = 1; i < 5; i++)
        {
            if(inputs[i] > largestNumber)
            {
                largestNumber = inputs[i];
            }
        }

        System.out.println("Largest Number: " + largestNumber);
    }
}
