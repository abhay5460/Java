package com.Package;

//Create a user-defined package and import it into another program.

public class Package1 
{
	public String publicField = "Public Field";
	
	protected String protectedField = "Protected Field";
	
	String defaultField = "Default Field";
	
	private String privateField = "Private Field";
	
	public void publicMethod() 
	{
	     System.out.println("Public Method");
	}
	
	protected void protectedMethod()
	{
	     System.out.println("Protected Method");
	}

	
	void defaultMethod() 
	{
	     System.out.println("Default Method");
	}
	
	private void privateMethod() 
	{
	     System.out.println("Private Method");
	}
	 	
	public void displayPrivateField() 
	{
	     System.out.println(privateField);
	}
	
	public void callPrivateMethod() 
	{
	     privateMethod();
	}
	
	
//	public static void main(String[] args) 
//	{
//		System.out.println("This is user-defined package.");
//	}
}

