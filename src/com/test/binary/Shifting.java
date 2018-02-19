package com.test.binary;

public class Shifting
{
	
	public static void main(String[] args)
	{
		int a = 0xFF;
		System.out.println(a);
		
		leftShift(-2, 1);
		leftShift(2, 1); 
		leftShift(-2147418116, 1);
		leftShift(2, -1);
		
		signedRightShift(2, -1);
		logicalRightShift(2, -1);
	}

	private static void leftShift(int num, int shiftBy)
	{
		System.out.println(num + " i.e. " + Integer.toBinaryString(num));
		int result = num << shiftBy;
		System.out.println(result + " i.e. " + Integer.toBinaryString(result));
		System.out.println("---------------------");
	}
	
	private static void signedRightShift(int num, int shiftBy)
	{
		System.out.println(num + " i.e. " + Integer.toBinaryString(num));
		int result = num >> shiftBy;
		System.out.println(result + " i.e. " + Integer.toBinaryString(result));
		System.out.println("---------------------");
	}
	
	private static void logicalRightShift(int num, int shiftBy)
	{
		System.out.println(num + " i.e. " + Integer.toBinaryString(num));
		int result = num >>> shiftBy;
		System.out.println(result + " i.e. " + Integer.toBinaryString(result));
		System.out.println("---------------------");
	}
	
}
