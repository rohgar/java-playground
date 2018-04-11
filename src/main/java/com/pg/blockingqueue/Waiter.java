package com.pg.blockingqueue;

import java.util.concurrent.BlockingQueue;

public class Waiter implements Runnable
{
	BlockingQueue<Customer> queue = null;

	public Waiter(BlockingQueue<Customer> queue)
	{
		this.queue = queue;
	}

	@Override
	public void run()
	{
		try
		{
			Customer customer = new Customer(""); // empty customer
			while (!customer.getName().equals("Receptionist"))
			{
				customer = queue.take(); // take waits if the head is empty. Poll returns null.
				if (customer != null)
				{
					System.out.println("Received " + customer + ". Taking to an empty table ...");
					Thread.sleep(1000); // 1 seconds
				}
			}
			System.out.println("All have been seated ...");
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}

}
