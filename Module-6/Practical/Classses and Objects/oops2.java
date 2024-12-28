package com.OOPS;
//Create multiple constructors in a class and demonstrate constructor overloading.
public class oops2 
{
	public static void main(String[] args) 
	{
		Google sc = new Google();
		sc = new Google("abhay");
	}
}

class Google
{
	Google()
	{
		System.out.println("Default Constructor.");
	}
	Google(String name)
	{
		System.out.println("HII "+name);
	}
}
