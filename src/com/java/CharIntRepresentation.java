package com.java;

public class CharIntRepresentation
{

	public static void main(String[] args)
	{
		char aChar = 'a';
		int aInt = 'a';
		System.out.println("a as char = " + aChar); // prints a
		System.out.println("a as int = " + aInt);   // prints 97
		System.out.println("a as int = " + Character.getNumericValue('9'));   // prints 9
		System.out.println("a as int = " + Character.getNumericValue('a'));   // prints 10
	}

}
