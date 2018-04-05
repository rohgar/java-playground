package com.java.binarytreestring;

public class Node
{
	
	Integer data = null;
	Node left = null;
	Node right = null;
	
	Node(Integer data)
	{
		this.data = data;
	}
	
	@Override
	public String toString()
	{
		String s = "" + this.data;
		String leftValue = (left == null) ? "null" : left.data + "";
		String rightValue = (right == null) ? "null" : right.data + "";
		s += "(left = " + leftValue + ")";
		s += "(right = " + rightValue + ")";
		return s;
	}

}
