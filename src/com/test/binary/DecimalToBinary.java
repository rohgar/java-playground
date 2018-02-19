package com.test.binary;

public class DecimalToBinary
{
	public static void main(String[] args)
	{
		System.out.println(convertDecimalToBinary(5));
	}
	
	private static String convertDecimalToBinary(int decimal)
	{
		StringBuffer result = new StringBuffer();
		
		int modulus = 0;
		int division = decimal;
		while (division > 0)
		{
			modulus = division % 2;
			division = division / 2;
			result.insert(0, modulus);
		}
		
		return result.toString();
	}
}
