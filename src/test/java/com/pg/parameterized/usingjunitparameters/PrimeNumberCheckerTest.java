package com.pg.parameterized.usingjunitparameters;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import com.pg.parameterized.PrimeNumberChecker;

/**
 * Parameterized test example. Parameterzied tests allows to run the same test
 * with different values.
 * 
 * @author rohit
 *
 */
@RunWith(Parameterized.class)
public class PrimeNumberCheckerTest
{
	@Parameterized.Parameters
	public static Collection<Object[]> inputNumbers()
	{
		List<Object[]> list = new ArrayList<Object[]>();
		list.add(new Object[] { 2, true });
		list.add(new Object[] { 6, false });
		// return Arrays.asList(new Object[][] { { 2, true }, { 6, false });
		return list;
	}

	private Integer inputNumber;
	private Boolean expectedResult;
	private final PrimeNumberChecker primeNumberChecker = new PrimeNumberChecker();

	public PrimeNumberCheckerTest(Integer inputNumber, Boolean expectedResult)
	{
		this.inputNumber = inputNumber;
		this.expectedResult = expectedResult;
	}

	// This test will run 4 times since we have 5 parameters defined
	@Test
	public void testPrimeNumberChecker()
	{
		System.out.println("Parameterized Number is : " + inputNumber);
		assertEquals(expectedResult, primeNumberChecker.isPrime(inputNumber));
	}

}
