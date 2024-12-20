package com.simple4;

import java.util.Scanner;

class Student
{
	String name;
	int age;
	String city;
	
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public int getAge() 
	{
		return age;
	}
	public void setAge(int age) 
	{
		this.age = age;
	}
	public String getCity() 
	{
		return city;
	}
	public void setCity(String city) 
	{
		this.city = city;
	}
}

public class oops1 
{
	public static void main(String[] args) 
	{
		Student sc = new Student();
		
		Scanner obj = new Scanner(System.in);
		
		System.out.print("Enter The name : ");
		String name = obj.nextLine();
		
	
		obj.nextLine();
		
		System.out.print("Enter The city : ");
		String city = obj.nextLine();
		
		System.out.print("Enter The age : ");
		int age = obj.nextInt();
		
		sc.setName(name);
		sc.setAge(age);
		sc.setCity(city);
		
		System.out.println("Student Name is : "+sc.getName());
		System.out.println("Student Age is : "+sc.getAge());
		System.out.println("Student City is : "+sc.getCity());
	}
}
