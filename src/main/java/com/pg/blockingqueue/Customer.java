package com.pg.blockingqueue;

public class Customer
{

	private String name = null;

	public String getName()
	{
		return name;
	}

	public Customer(String name)
	{
		this.name = name;
	}

	@Override
	public String toString()
	{
		return this.name;
	}
}
