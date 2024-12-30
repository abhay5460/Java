package com.Array;

// Write a program to create and initialize an object using a parameterized constructor.

public class Constructor1 
{
	private String model;
	private String color;
	private int year;
	
	 public Constructor1(String model, String color, int year) 
	 {
	     this.model = model;
	     this.color = color;
	     this.year = year;
	 }
	
	 public void displayDetails() 
	 {
	     System.out.println("Model: " + model);
	     System.out.println("Color: " + color);
	     System.out.println("Year: " + year);
	 }

	 public static void main(String[] args) 
	 {
		  Constructor1 myCar = new Constructor1("Tesla Model 3", "Red", 2023);

		  myCar.displayDetails();
	}
}
