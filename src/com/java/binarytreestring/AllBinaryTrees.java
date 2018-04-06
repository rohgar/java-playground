package com.java.binarytreestring;

import java.util.ArrayList;

public class AllBinaryTrees
{

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
		ArrayList<Node> result = new ArrayList<>();
		if (n == 0)
		{
			result.add(null);
			return result;
		}
		int remainingNodes = (n - 1); // excluding the root
		for (int i = 0; i <= remainingNodes; i++)
		{
			ArrayList<Node> leftSolutions = getAllBinaryTrees(i);
			ArrayList<Node> rightSolutions = getAllBinaryTrees(remainingNodes - i);
			for (int p = 0; p < leftSolutions.size(); p++)
			{
				for (int q = 0; q < rightSolutions.size(); q++)
				{
					Node node = new Node(n);
					node.left = leftSolutions.get(p);
					node.right = rightSolutions.get(q);
					result.add(node);
				}
			}
		}

		return result;
	}

}
