package com.java.binarytreestring;

public class PrintBinaryTreeStrings
{
	private static StringBuffer sb = new StringBuffer();

	static String getString(Node node)
	{
		sb = new StringBuffer();
		createBinaryTreeString(node);
		return sb.toString();
	}

	private static void createBinaryTreeString(Node node)
	{
		if (node == null)
		{
			sb.append("x");
			return;
		}
		sb.append("(");
		createBinaryTreeString(node.left);
		createBinaryTreeString(node.right);
		sb.append(")");
	}
}
