package com.io;

//Implement a file copy program using FileInputStream and FileOutputStream.

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Java_IO_2
{
    public static void main(String[] args) {
        FileInputStream inputStream = null;
        FileOutputStream outputStream = null;

        try {
            inputStream = new FileInputStream("t1.txt");
            outputStream = new FileOutputStream("t1.txt");

            int byteRead;
            while ((byteRead = inputStream.read()) != -1) 
            {
                outputStream.write(byteRead);
                System.out.println("abhay gajjar");
            }
            System.out.println("File copied successfully!");
        } catch (IOException e) 
        {
            e.printStackTrace();
        } 
        finally 
        {
            try 
            {
                if (inputStream != null) 
                {
                    inputStream.close();
                }
                if (outputStream != null) 
                {
                    outputStream.close();
                }
            } catch (IOException e) 
            {
                e.printStackTrace();
            }
        }
    }
}
