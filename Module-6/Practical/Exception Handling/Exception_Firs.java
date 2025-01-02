package com.exception;

//Write a program to demonstrate exception handling using try-catch-finally.

import java.util.Scanner;

public class Exception_Firs 
{
	public static void main(String[] args) 
	{
		try
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter No 1:");
            int a = sc.nextInt();
            System.out.println("Enter No 2:");
            int b = sc.nextInt();
            int c = a / b;
            System.out.println("Division is : " + c);
            System.out.println("Your Program is Completed ..");
        }
        catch(Exception e)
        {
            // System.out.println(e);
            e.printStackTrace();
        }
        finally
        {
            System.out.println("ABhay Gajjar");
        }
	}
}
