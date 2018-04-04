package com.java.recursion;

public class Recursion02
{

	public static void main(String[] args)
	{
		int n = 1;
		int index = 0;
		test(index, n, n, ""); // when both the n go to 0, the index will 2*n.
	}

	private static void test(int index, int nLeft, int nRight, String str)
	{
		if (nLeft < 0 || nRight < 0)
		{
			return;
		}
		if (nLeft == 0 && nRight == 0)
		{
			// System.out.println(String.format("(%d, %d)", nLeft, nRight));
			System.out.println(str);
			System.out.println("-----------------------");
		}
		StringBuffer sb = new StringBuffer(str);
		test(index + 1, nLeft - 1, nRight, sb.insert(index, 'a').toString());
		sb = new StringBuffer(str);
		test(index + 1, nLeft, nRight - 1, sb.insert(index, 'b').toString());
	}

}
