package com.pg.mockito;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import com.pg.mockito.LocalClass;
import com.pg.mockito.client.SampleApi;

@RunWith(MockitoJUnitRunner.class)
public class TestSampleApiUsingAnnotations
{
	@Mock
	private SampleApi api;

	@InjectMocks
	private LocalClass local;

	@Captor
	private ArgumentCaptor<String> stringArgumentCaptor;

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
