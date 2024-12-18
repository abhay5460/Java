package com.simple2;

import java.util.Scanner;

public class Lab5 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int choice;
		
		do
		{
			System.out.println("Menu :");
			System.err.println("1. ADD");
			System.out.println("2. Substract");
			System.out.println("3. Multiply");
			System.out.println("4. Divide");
			System.out.println("5. Exit");
			System.out.println("Enter Your Choice : ");
			choice = sc.nextInt();
			
			if(choice >= 1 && choice <=4)
			{
				System.out.print("Enter First Number : ");
				double num1 = sc.nextDouble();
				System.out.print("Enter Second Number : ");
				double num2 = sc.nextDouble();
				
				switch(choice)
				{
					case 1 :
							System.out.println("Result :"+(num1+num2));
							break;
					case 2 :
							System.out.println("Result :"+(num1-num2));
							break;
					case 3 :
							System.out.println("Result :"+(num1*num2));
							break;
					case 4 :
							if(num2!=0)
							{
								System.out.println("Result : "+(num1/num2));
							}
							else
							{
								System.out.println("Error : Division by zero is not allowed.");
							}
							break;
				}
			}
			else if(choice != 5)
			{
				System.out.println("Invalid choice.Please Try Again");
			}
		}while(choice != 5);
		
		System.out.println("Progran Terminited.");
	}
}
