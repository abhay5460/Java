package com.simple2;

import java.util.Scanner;

public class Lab4
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a Number : ");
		int number = sc.nextInt();
		
		if(number % 2==0)
		{
			System.out.println(number + " is even.");
		}
		else
		{
			System.out.println(number + " is odd.");
		}
	}
}
