package com.test.binary;

public class BitRepresentation
{
	public static void main(String[] args)
	{
		System.out.println("num = " + Integer.toBinaryString(8));      // prints 1000
		System.out.println("num = " + Integer.toBinaryString(1 << 0)); // prints 1
		System.out.println("num = " + Integer.toBinaryString(1 << 1)); // prints 10
		System.out.println("num = " + Integer.toBinaryString(-1 << 1)); // prints 11111111111111111111111111111110
		
		
	}
}
