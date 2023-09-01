package org.example;

import java.util.Scanner;

public class MyClass4
{

    public static void main(String[] args)
    {
        final float pi = 3.14159f;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        float radius = input.nextFloat();
        CalculateCircumference(radius, pi);
        CalculateArea(radius, pi);
    }
    private static void CalculateCircumference(float radius, final float pi)
    {
        float circumference = 2.0f * pi * radius;
        System.out.println("The Circumference is: " + circumference);
    }
    private static void CalculateArea(float radius, final float pi)
    {
        float area = (float) (pi * Math.pow(radius, 2));
        System.out.println("The Area is: " + area);
    }
}