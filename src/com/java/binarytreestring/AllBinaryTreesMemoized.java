package com.java.binarytreestring;

import java.util.ArrayList;
import java.util.HashMap;

public class AllBinaryTreesMemoized
{

	private static HashMap<Integer, ArrayList<Node>> map = new HashMap<>();

	/**
	 * Get all the binary tree which have n non-null nodes. Represent the null nodes
	 * by x.
	 * 
	 * @param nLeft
	 * @param nRight
	 * @param node
	 * @return
	 */
	static ArrayList<Node> getAllBinaryTrees(int n)
	{

		ArrayList<Node> arrayList = map.get(n);
		if (arrayList != null)
		{
			return arrayList;
		}

		ArrayList<Node> result = new ArrayList<>();
		if (n == 0)
		{
			result.add(null);
			return result;
		}
		int remainingNodes = (n - 1); // excluding the root
		for (int i = 0; i <= remainingNodes; i++)
		{
			ArrayList<Node> left = getAllBinaryTrees(i);
			ArrayList<Node> right = getAllBinaryTrees(remainingNodes - i);
			for (int p = 0; p < left.size(); p++)
			{
				for (int q = 0; q < right.size(); q++)
				{
					Node node = new Node(n);
					node.left = left.get(p);
					node.right = right.get(q);
					result.add(node);
				}
			}
		}

		map.put(n, result);
		return result;
	}

}
