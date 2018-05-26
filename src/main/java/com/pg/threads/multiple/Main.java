package com.pg.threads.multiple;

public class Main
{

	public static void main(String[] args)
	{
		Child thread1 = new Child();
		Child thread2 = new Child();
		Child thread3 = new Child();

		thread1.start();
		if (thread1.isAlive())
		{
			System.out.println("Multiple calls to start() will cause an Exception.");
		}
		else
		{
			thread1.start();
		}
		thread2.start();
		thread3.start();
	}

}
