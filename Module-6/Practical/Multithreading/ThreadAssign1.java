package com.thread;

// Write a program to create and run multiple threads using the Thread class.

class PrintNumbers extends Thread 
{
    private String threadName;

    PrintNumbers(String name)
    {
        threadName = name;
    }

    public void run() 
    {
        for (int i = 0; i < 5; i++) 
        {
            System.out.println(threadName + ": " + i);
        }
    }
}
    
public class ThreadAssign1 
{
	public static void main(String[] args) 
	{
        PrintNumbers thread1 = new PrintNumbers("Thread-1");
        PrintNumbers thread2 = new PrintNumbers("Thread-2");

        thread1.start();
        thread2.start();

        try 
        {
            thread1.join();
            thread2.join();
        } 
        catch (InterruptedException e) 
        {
            System.out.println("Threads interrupted.");
        }

        System.out.println("Done!");
    }
}




 
