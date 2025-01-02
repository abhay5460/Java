package com.Array;
// Implement string comparison using equals() and compareTo() methods.
public class array_third 
{
	public static void main(String[] args) 
	{
		 String string1 = "Hello";
	     String string2 = "hello";
	     String string3 = "Hello";

	     System.out.println("Using equals() method:");
	     System.out.println("string1 equals string2: " + string1.equals(string2)); 
	     System.out.println("string1 equals string3: " + string1.equals(string3)); 

	     System.out.println("\nUsing compareTo() method:");
	     System.out.println("string1 compareTo string2: " + string1.compareTo(string2)); 
	     System.out.println("string1 compareTo string3: " + string1.compareTo(string3));

	     System.out.println("\nUsing compareToIgnoreCase() method:");
	     System.out.println("string1 compareToIgnoreCase string2: " + string1.compareToIgnoreCase(string2)); 

	}
}
