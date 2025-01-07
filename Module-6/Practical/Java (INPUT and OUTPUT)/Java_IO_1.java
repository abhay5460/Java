package com.io;

//Write a program to read input from the console using Scanner.

import java.util.Scanner;

public class Java_IO_1 
{
	public static void main(String[] args)
	{
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.println("Hello, " + name + "! You are " + age + " years old.");

        scanner.close();
    }
}

