package com.pg.mockito.service;

import java.util.List;

public interface SampleApi
{

	public List<String> getSampleStrings(String user);
	
	public List<Integer> getSampleIntegers(String user);
	
}
