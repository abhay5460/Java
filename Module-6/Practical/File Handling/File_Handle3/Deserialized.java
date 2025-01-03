package com.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;
import java.nio.channels.FileLockInterruptionException;

public class Deserialized 
{
	public static void main(String[] args) 
	{
		Deserialized d1 = new Deserialized();
		Address address = d1.getDeserializedData();
		System.out.println(address);
	}
	public Address getDeserializedData()
	{
		Address address=null;
		
		try 
		{
			FileInputStream fis = new FileInputStream("abc.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			address = (Address)ois.readObject();
			ois.close();
			fis.close();
		} 
		catch(Exception e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return address;
	}
}
