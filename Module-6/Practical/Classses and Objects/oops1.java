package com.OOPS;
// Create a class Student with attributes (name, age) and a method to display the details.
import java.util.Scanner;

class Student
{
	String name;
	int age;
	String city;

	public void displayDetails()
	{
		System.out.println("Name is: "+name);	
		System.out.println("Age is: "+age);	
		System.out.println("City is: "+city);	
	}
}

public class oops1 
{
	public static void main(String[] args) 
	{
		Student obj = new Student();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter The name : ");
		String name = sc.nextLine();
		
		System.out.print("Enter The city : ");
		String city = sc.nextLine();
		
		System.out.print("Enter The age : ");
		int age = sc.nextInt();
		
		
		
		obj.name = name;
		obj.age = age;
		obj.city = city;
		
		System.out.println();
		
		obj.displayDetails();
	}
}
