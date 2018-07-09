package com.pg.parameterized;

public class PrimeNumberChecker
{

	public Boolean isPrime(final Integer primeNumber)
	{
		for (int i = 2; i < (primeNumber / 2); i++)
		{
			if (primeNumber % i == 0)
			{
				return false;
			}
		}
		return true;
	}

}
