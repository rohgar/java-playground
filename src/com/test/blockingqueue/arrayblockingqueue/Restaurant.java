package com.test.blockingqueue.arrayblockingqueue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

import com.test.blockingqueue.Customer;
import com.test.blockingqueue.Waiter;
import com.test.blockingqueue.Reception;

/**
 * Restaurant has a capacity of serving 3 people at a time. Thus 
 * we use a `ArrayBlockingQueue`. 
 * For a unbounded capacity, an `LinkedBlockingQueue` would be used.
 * 
 * New people come in and are picked by the reception and put in the queue.
 * The queued people are showed to their table by the waiter.
 * @author r
 */
public class Restaurant
{

	public static void main(String[] args)
	{
		BlockingQueue<Customer> queue = new ArrayBlockingQueue<Customer>(3);
		Reception producer = new Reception(queue);
		Waiter consumer = new Waiter(queue);
		
		new Thread(producer).start();
		new Thread(consumer).start();
	}
}
