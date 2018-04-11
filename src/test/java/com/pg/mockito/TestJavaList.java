package com.pg.mockito;

import java.util.List;

import org.junit.Test;
import org.mockito.Mockito;

@SuppressWarnings("unchecked")
public class TestJavaList
{
	@Test
	public void testListSize()
	{
		List<String> list = Mockito.mock(List.class);
		Mockito.when(list.size()).thenReturn(2, 3);

		assert (list.size() == 2);
		assert (list.size() == 3);
	}

	@Test
	public void testListElements()
	{
		List<String> list = Mockito.mock(List.class);
		Mockito.when(list.get(Mockito.anyInt())).thenReturn(Mockito.anyString());

		assert (list.get(0) != null);
		System.out.println("list.get(0) = " + list.get(0));
	}

	@Test(expected = RuntimeException.class)
	public void testListInvalidIndex()
	{
		List<String> list = Mockito.mock(List.class);
		Mockito.when(list.get(-1)).thenThrow(new RuntimeException("Invalid Index!"));

		assert (list.get(-1) != null);
	}
}
