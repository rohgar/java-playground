package com.test.blockingqueue;

import java.util.concurrent.BlockingQueue;

public class Reception implements Runnable
{

	BlockingQueue<Customer> queue = null;

	public Reception(BlockingQueue<Customer> queue)
	{
		this.queue = queue;
	}

	@Override
	public void run()
	{
		final int n = 10;
		System.out.println("10 Customers Waiting at the reception ... ");
		for (int i = 0; i < n; i++)
		{
			Customer customer = new Customer("Customer" + i);
			try
			{
				queue.put(customer);
				System.out.println("Put " + customer + " in the queue.");
			}
			catch (Exception e)
			{
				e.printStackTrace();
			}
		}
		System.out.println("No more customers to put in the queue.");
		try
		{
			queue.put(new Customer("Receptionist")); // when all customers are done, receptionist herself goes to dinner.
		}
		catch (InterruptedException e)
		{
			e.printStackTrace();
		}
	}

}
