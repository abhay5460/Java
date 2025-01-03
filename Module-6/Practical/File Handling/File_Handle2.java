package com.io;

//Implement a program that reads a file line by line using BufferedReader.

import java.io.BufferedReader;
import java.io.FileReader;
//import java.io.IOException;

public class File_Handle2
{
    public static void main(String[] args) 
    {
        String filePath = "C:\\Users\\gajja\\eclipse-workspace\\corejava\\a3.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) 
        {
            String line;
            while ((line = br.readLine()) != null) 
            {
                System.out.println(line);
            }
        } 
        catch (Exception e) 
        {
        	e.printStackTrace();
        }
        finally
        {
        	System.out.println("File read line by line ..");
        }
    }
}
