package com.pg.threads;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class Main
{

	public static void main(String[] args)
	{
		final int NUM_OF_THREADS = 5;
		ExecutorService threadPool = Executors.newFixedThreadPool(NUM_OF_THREADS);
		Set<Future<?>> set = new HashSet<Future<?>>();
		try
		{
			for (int i = 0; i < NUM_OF_THREADS; i++)
			{
				Future<?> future = threadPool.submit(new Runnable()
				{
					public void run()
					{
						System.out.println(Thread.currentThread().getId());
					}
				});
				set.add(future);
			}
			threadPool.shutdown();
			threadPool.awaitTermination(Long.MAX_VALUE, TimeUnit.MILLISECONDS);
			for (Future<?> future : set) {
				future.get();
			}
		}
		catch (Exception e)
		{
			e.printStackTrace();
			System.out.println("Test execution failed");
		}
	}

}
