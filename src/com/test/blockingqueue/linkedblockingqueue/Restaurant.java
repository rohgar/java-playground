package com.test.blockingqueue.linkedblockingqueue;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

import com.test.blockingqueue.Customer;
import com.test.blockingqueue.Waiter;
import com.test.blockingqueue.Reception;

/**
 * Restaurant has a capacity of serving n people at a time (i.e. unbounded). THus 
 * we use a `LinkedBlockingQueue`. 
 * For a limited capacity, an `ArrayBlockingQueue` would be used.
 * 
 * New people come in and are picked by the reception and put in the queue.
 * The queued people are showed to their table by the waiter.
 * @author r
 */
public class Restaurant
{

	public static void main(String[] args)
	{
		BlockingQueue<Customer> queue = new LinkedBlockingQueue<Customer>();
		Reception producer = new Reception(queue);
		Waiter consumer = new Waiter(queue);
		
		new Thread(producer).start();
		new Thread(consumer).start();
	}
	
}
