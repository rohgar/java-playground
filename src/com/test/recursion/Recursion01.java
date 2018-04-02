package com.test.recursion;

public class Recursion01
{

	public static void main(String[] args)
	{
		int n = 2;
		test(n, n);
	}

	private static void test(int nLeft, int nRight)
	{
		if (nLeft < 0 || nRight < 0)
		{
			return;
		}
		System.out.println(String.format("(%d, %d)", nLeft, nRight));
		// System.out.println(String.format("nLeft = %d, nRight = %d", nLeft, nRight));
		if (nLeft == 0 && nRight == 0)
		{
			System.out.println("-----------------------");
		}
		test(nLeft - 1, nRight);
		test(nLeft, nRight - 1);
	}

}
