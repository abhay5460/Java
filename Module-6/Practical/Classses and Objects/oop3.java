package com.OOPS;

import java.util.Scanner;

//Implement a simple class with getters and setters for encapsulation.

public class oop3
{
	private String name;
	private int age;
	
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
		if(age>0)
		{
			this.age=age;
		}
		else
		{
			System.out.println("Age must be positive.");
		}
	}
	public static void main(String[] args) 
	{	
		oop3 o1 = new oop3();
		
		o1.setName("Abhay");
		o1.setAge(20);
		
		System.out.println("Name : "+o1.getName());
		System.out.println("No : "+o1.getAge());

		o1.setAge(-5);
	}
}



