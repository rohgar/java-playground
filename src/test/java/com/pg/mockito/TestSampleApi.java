package com.pg.mockito;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;

import com.pg.mockito.LocalClass;
import com.pg.mockito.client.SampleApi;

public class TestSampleApi
{
	private SampleApi api = Mockito.mock(SampleApi.class);
	private LocalClass local = new LocalClass(api);
	private ArgumentCaptor<String> stringArgumentCaptor = ArgumentCaptor.forClass(String.class);

	@Test
	public void testSampleStringsDummyUser()
	{
		final String USER = "dummyUser";
		Mockito.when(api.getSampleStringsForUser(USER)).thenReturn(Arrays.asList("Hello", "Alphabets", "World"));

		// test the local.getSampleStringsStartingWithA() function
		List<String> filteredStrings = local.getSampleStringsStartingWithA(USER);
		assert (filteredStrings.size() == 1);
		for (String str : filteredStrings)
		{
			assert (str.startsWith("a") || str.startsWith("A"));
			System.out.println("sample string = " + str);
			assert (!str.isEmpty());
		}

		// verify that getSampleStringsForUser was called with the same username we
		// passed in line 22. This will fail if the
		// local.getSampleStringsStartingWithA() is not called
		Mockito.verify(api).getSampleStringsForUser(stringArgumentCaptor.capture());
		assert (stringArgumentCaptor.getValue().equals(USER));
	}

}
