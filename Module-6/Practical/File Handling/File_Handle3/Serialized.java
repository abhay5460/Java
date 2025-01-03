package com.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Serialized 
{
	public static void main(String[] args) 
	{
		Serialized s1 = new Serialized();
		s1.setSerializedData();
	}
	public void setSerializedData()
	{
		Address address = new Address();
		address.setCountry("India");
		address.setState("Gujarat");
		address.setCity("Ahmedabad");
		
		try 
		{
			FileOutputStream fos = new FileOutputStream("abc.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(address);
			oos.flush();
			fos.flush();
			oos.close();
			fos.close();
			System.out.println("Data Write");
		} 
		catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
