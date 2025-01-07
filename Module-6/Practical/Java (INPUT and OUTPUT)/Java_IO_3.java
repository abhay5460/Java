package com.io;

//Create a program that reads from one file and writes the content to another file.

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Java_IO_3
{
	public static void main(String[] args) 
	{
        BufferedReader reader = null;
        BufferedWriter writer = null;

        try 
        {
            reader = new BufferedReader(new FileReader("a2.txt"));
            writer = new BufferedWriter(new FileWriter("t1.txt"));

            String line;
            while ((line = reader.readLine()) != null) 
            {
                writer.write(line);
                writer.newLine();
            }
            System.out.println("File content copied successfully!");
        } 
        catch (IOException e) 
        {
            e.printStackTrace();
        } 
        finally 
        {
            try 
            {
                if (reader != null) 
                {
                    reader.close();
                }
                if (writer != null) 
                {
                    writer.close();
                }
            } catch (IOException e) 
            {
                e.printStackTrace();
            }
        }
    }
}
