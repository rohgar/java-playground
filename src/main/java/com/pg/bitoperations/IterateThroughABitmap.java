package com.pg.bitoperations;

public class IterateThroughABitmap
{

	public static void main(String[] args)
	{
		// Approach 1: prints through all the bits used to represent the whole integer ie. 32 in Java.
		int a = 150;
		for (int i = 0; i < Integer.BYTES * 8; i++)
		{
			int currentBit = getBit(a, i);
			System.out.println(i + ") " + currentBit);
		}
		
		System.out.println("-----------------------------");
		
		// Approach 2: prints through just the bits used to reprsent the value of this integer
		int cnt = 0;
		while (a != 0)
		{
			int currentBit = a & 1;
			System.out.println((cnt++) + ") " + currentBit);
			a >>>= 1;
		}
	}
	
	private static int getBit(int num, int index)
	{
		int bitRepresentationOfIndex = (1 << index);
		return ((num & bitRepresentationOfIndex) != 0) ? 1 : 0;
	}
}
