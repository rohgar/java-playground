package com.java.binarytreestring;

import java.util.ArrayList;

public class Main
{

	public static void main(String[] args)
	{
		int n = 5;
		long starttime = System.currentTimeMillis();
		ArrayList<Node> trees = AllBinaryTreesMemoized.getAllBinaryTrees(n);
		System.out.println("Time elapsed = " + (System.currentTimeMillis() - starttime) + ",Count = " + trees.size());
		for (Node node : trees)
		{
			System.out.println(PrintBinaryTreeStrings.getString(node));
		}

		starttime = System.currentTimeMillis();
		trees = AllBinaryTrees.getAllBinaryTrees(n);
		System.out.println("Time elapsed = " + (System.currentTimeMillis() - starttime) + ",Count = " + trees.size());
		for (Node node : trees)
		{
			System.out.println(PrintBinaryTreeStrings.getString(node));
		}
	}

}
