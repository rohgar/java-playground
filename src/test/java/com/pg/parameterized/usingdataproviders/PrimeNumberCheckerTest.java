package com.pg.parameterized.usingdataproviders;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;

import com.pg.parameterized.PrimeNumberChecker;
import com.tngtech.java.junit.dataprovider.DataProvider;
import com.tngtech.java.junit.dataprovider.DataProviderRunner;
import com.tngtech.java.junit.dataprovider.UseDataProvider;

@RunWith(DataProviderRunner.class)
public class PrimeNumberCheckerTest
{

	@DataProvider
	public static Object[][] inputNumbers()
	{
		return new Object[][] { { 2, true }, { 6, false } };
	}

	private final PrimeNumberChecker primeNumberChecker = new PrimeNumberChecker();

	@Test
	@UseDataProvider("inputNumbers")
	public void testPrimeNumberChecker(Integer inputNumber, Boolean expectedResult)
	{
		System.out.println("Parameterized Number is : " + inputNumber);
		assertEquals(expectedResult, primeNumberChecker.isPrime(inputNumber));
	}

}
