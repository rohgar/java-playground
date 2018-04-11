package com.pg.mockito;

import java.util.ArrayList;
import java.util.List;

import com.pg.mockito.client.SampleApi;

public class LocalClass
{

	private SampleApi sampleApi;

	public LocalClass(SampleApi sampleApi)
	{
		this.sampleApi = sampleApi;
	}

	/**
	 * Retrieves a list of sample strings from the SampleAPI, and filters all the
	 * strings that start with letter "a" or "A", and returns them with the user
	 * name appended.
	 *
	 * @return
	 */
	public List<String> getSampleStringsStartingWithA(String user) throws RuntimeException
	{
		if (sampleApi == null)
		{
			throw new RuntimeException("Invalid user ...");
		}
		final List<String> sampleStrings = sampleApi.getSampleStringsForUser(user);
		List<String> result = new ArrayList<String>();
		for (String str : sampleStrings)
		{
			if (str.startsWith("a") || str.startsWith("A"))
			{
				result.add(str);
			}
		}
		return result;
	}
}
