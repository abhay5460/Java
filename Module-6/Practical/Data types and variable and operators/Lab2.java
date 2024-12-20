package com.simple2;

import java.util.Scanner;
public class Lab2 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();

        double Addition = num1 + num2;
        double Substraction = num1 - num2;
        double Multiplication = num1 * num2;
        double Division = num1 / num2;

        System.out.println("Addition is : " +Addition);
        System.out.println("Substraction is : " +Substraction);
        System.out.println("Multiplication is : " +Multiplication);
        System.out.println("Division is : " +Division);

 
        System.out.println("Is first number equal to second? " + (num1 == num2));
        System.out.println("Is first number not equal to second? " + (num1 != num2));
        System.out.println("Is first number greater than second? " + (num1 > num2));
        System.out.println("Is first number less than second? " + (num1 < num2));
        System.out.println("Is first number greater than or equal to second? " + (num1 >= num2));
        System.out.println("Is first number less than or equal to second? " + (num1 <= num2));
	}
}
