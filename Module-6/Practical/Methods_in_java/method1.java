package com.Array;

import java.util.Scanner;

//Write a program to find the maximum of three numbers using a method.

public class method1 
{
	public static void method1(int n1, int n2, int n3)
	{
		if(n1>n2 && n1>n3)
		{
			System.out.println("Maximum value is : "+n1);
		}
		else if(n2>n3 && n2>n1)
		{
			System.out.println("Maximum value is : "+n2);
		}
		else
		{
			System.out.println("Maximum value is : "+n3);
		}
		
	}
	
	public static void main(String[] args) 
	{
		int a , b , c;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter First Number : ");
		a = sc.nextInt();
		
		System.out.print("Enter Second Number : ");
		b = sc.nextInt();
		
		System.out.print("Enter Third Number : ");
		c = sc.nextInt();
		
		System.out.println();
		
		method1(a,b,c);
	
	}
}


