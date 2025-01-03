package com.io;

//Write a program to read and write content to a file using FileReader and FileWriter.

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class File_Handle1
{
	public static void main(String[] args)
	{
		try 
		{
			FileWriter fw = new FileWriter("t1.txt");
			String s = "Hi I am abhay gajjar.";
			fw.write(s);
			fw.flush();
			fw.close();
			System.out.println("Data Write");
		} 
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		try
		{
			FileReader fr = new FileReader("a2.txt");
			int x;
			while((x=fr.read())!=-1)
			{
				System.out.print((char)x);
			}
			fr.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
