package com.thread;

//Use inter-thread communication methods like wait(), notify(), and notifyAll().

public class ThreadAssign3
{
    public static void main(String[] args) 
    {
        final Object lock = new Object();

        Thread producer = new Thread(() -> 
        {
            synchronized (lock) {
                System.out.println("Producer is producing...");
                try
                {
                    Thread.sleep(3000); 
                } catch (InterruptedException e)
                {
                    e.printStackTrace();
                }
                System.out.println("Producer is done producing, notifying...");
                lock.notify(); 
            }
        });

        Thread consumer = new Thread(() -> 
        {
            synchronized (lock) 
            {
                System.out.println("Consumer is waiting...");
                try 
                {
                    lock.wait(); 
                } catch (InterruptedException e) 
                {
                    e.printStackTrace();
                }
                System.out.println("Consumer is consuming...");
            }
        });

        consumer.start();
        producer.start();

        try 
        {
            consumer.join();
            producer.join();
        } catch (InterruptedException e) 
        {
            e.printStackTrace();
        }

        System.out.println("Both threads are done!");
    }
}
