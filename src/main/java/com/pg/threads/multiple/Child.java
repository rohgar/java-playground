package com.pg.threads.multiple;

public class Child extends Thread
{
	private static String shared_ = null;

	public Child()
	{
		System.out.println("Constructor " + Thread.currentThread().getId());
	}

	public String getSharedString()
	{
		if (shared_ != null)
		{
			return shared_;
		}

		synchronized (Child.class)
		{
			shared_ = "I am shared - created by " + Thread.currentThread().getId();
		}

		return shared_;
	}

	@Override
	public void run()
	{
		try
		{
			while (true)
			{
				Thread.sleep(5000);
				System.out.println("Running " + Thread.currentThread().getId());
				System.out.println("Shared =  " + getSharedString());
			}
		}
		catch (InterruptedException e)
		{
			e.printStackTrace();
		}
	}
}
