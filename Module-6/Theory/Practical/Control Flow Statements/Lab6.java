package com.simple2;

import java.util.Scanner;

public class Lab6 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter The Number of Terms : ");
		int n = sc.nextInt();
		
		int firstTerm=0 , secondTerm=1;
		
		System.out.print("Fibonacci Series : "+ firstTerm + " ,"+ secondTerm);
		
		for(int i=3;i<=n;i++)
		{
			int nextTerm = firstTerm + secondTerm;
			System.out.print(", "+nextTerm);
			firstTerm = secondTerm;
			secondTerm = nextTerm;
		}
		System.out.println();
	}
}
