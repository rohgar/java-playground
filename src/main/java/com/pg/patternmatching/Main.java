package com.pg.patternmatching;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main
{

	private static final Pattern _dataflowPattern = Pattern.compile(".*\\/data_flows\\/(.*)");
	private static final Pattern _dataflowRunsPattern1 = Pattern.compile(".*\\/data_flows\\/(.*?)\\/runs");
	private static final Pattern _dataflowRunsPattern2 = Pattern.compile(".*\\/data_flows\\/(.*?)\\/runs\\/(.*)");

	public static void main(String[] args)
	{
		String requestURL = "https://localhost:9080/v2/data_flows/1234";
		String output = null;
		/* For URLs matching {host}/v2/data_flows/{id} */
		Matcher matcher = _dataflowPattern.matcher(requestURL);
		if (matcher.find())
		{
			output = "Matched _dataflowPattern";
		}
		/* For URLs matching {host}/v2/data_flows/{id}/runs */
		matcher = _dataflowRunsPattern1.matcher(requestURL);
		if (matcher.find())
		{
			output = "Matched _dataflowRunsPattern1";
		}
		/* For URLs matching {host}/v2/data_flows/{id}/runs/{run_id} */
		matcher = _dataflowRunsPattern2.matcher(requestURL);
		if (matcher.find())
		{
			output = "Matched _dataflowRunsPattern2";
		}

		System.out.println(output);
	}

}
