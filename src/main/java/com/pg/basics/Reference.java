package com.pg.basics;

public class Reference
{

	private static class Node {
	    public Integer data = null;
	    public Node next = null; 

	    public Node(int data) {
	        this.data = data;
	    }
	    
	    @Override
	    public String toString()
	    {	
	    		StringBuffer sb = new StringBuffer();
	    		Node temp = this;
	    		while (temp != null)
	    		{
	    			sb.append(temp.data + ", ");
	    			temp = temp.next;
	    		}
	    		return sb.toString();
	    }
	}
	
	public static void main( String[] args)
	{
		Node n1 = new Node(1);
	    Node n2 = new Node(2);
	    Node n3 = new Node(3);
	    Node n4 = new Node(4);
	    n1.next = n2;
	    n2.next = n3;
	    n3.next = n4;
	    
	    System.out.println(n1);
	    System.out.println(n2);
	    n2 = n3;
	    System.out.println(n1);
	    System.out.println(n2);
	}
}