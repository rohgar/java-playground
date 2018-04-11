package com.pg.enums;

public enum Alphabets
{
	/**
	 * FLOW_CREATED
	 */
	A("A for Apple"),

	/**
	 * FLOW_DELETED
	 */
	B("B for Ball"),

	/**
	 * FLOW_RUNCREATED
	 */
	C("C for Cat");

	// raw value of the enum
	private final String text;

	/**
	 * @param text
	 */
	Alphabets(final String text)
	{
		this.text = text;
	}

	/**
	 * (non-Javadoc)
	 *
	 * @see java.lang.Enum#toString()
	 */
	@Override
	public String toString()
	{
		return text;
	}

}
