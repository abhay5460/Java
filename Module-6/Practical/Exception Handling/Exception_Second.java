package com.exception;

//Implement multiple catch blocks for different types of exceptions.

public class Exception_Second 
{
	public static void main(String[] args) 
	{
		try 
		{
			int[] numbers = {1, 2, 3};
		    System.out.println("Element at index 5: " + numbers[2]); 
		            
		    String text = null;
		    System.out.println(text.length()); 

		} 
		catch (ArrayIndexOutOfBoundsException e) 
		{
		    System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
		} 
		catch (NullPointerException e) 
		{
		    System.out.println("Caught NullPointerException: " + e.getMessage());
		} 
		catch (Exception e) 
		{
		    System.out.println("Caught Exception: " + e.getMessage());
		}
	}
}
