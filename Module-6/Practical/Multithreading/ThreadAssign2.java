package com.thread;

//Implement thread synchronization using synchronized blocks or methods.

class Counter 
{
    private int count = 0;

    public synchronized void increment() 
    {
        count++;
    }

    public int getCount() 
    {
        return count;
    }
}

class CounterThread extends Thread 
{
    private Counter counter;

    CounterThread(Counter counter) 
    {
        this.counter = counter;
    }

    public void run() 
    {
        for (int i = 0; i < 1000; i++) 
        {
            counter.increment();
        }
    }

    public static void main(String[] args) 
    {
        Counter counter = new Counter();

        CounterThread thread1 = new CounterThread(counter);
        CounterThread thread2 = new CounterThread(counter);

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

        System.out.println("Final count: " + counter.getCount());
    }
}

