package com.pg.patternmatching;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main
{

	// For URLs matching {host}/v2/one
	private static final Pattern one = Pattern.compile(".*\\/v[0-9]\\/one$");
	// For URLs matching {host}/v2/one/runs
	private static final Pattern two = Pattern.compile(".*\\/v[0-9]\\/one\\/([^\\/]*)$");
	// For URLs matching {host}/v2/one/{id}/clone
	private static final Pattern three = Pattern.compile(".*\\/v[0-9]\\/one\\/(.*?)\\/clone$");
	// For URLs matching {host}/v2/one/{id}/runs
	private static final Pattern four = Pattern.compile(".*\\/v[0-9]\\/one\\/(.*?)\\/runs$");
	// For URLs matching {host}/v2/one/{id}/runs/{run_id}
	private static final Pattern five = Pattern.compile(".*\\/v[0-9]\\/one\\/(.*?)\\/runs\\/([^\\\\/]*)$");

	public static void main(String[] args)
	{
		String requestURL = "https://localhost:9080/v2/data_flows/1234a/runs/12313/";
		String output = match(requestURL);
		System.out.println(output);
	}

	private static String match(String requestURL)
	{
		/* For URLs matching {host}/v2/data_flows/{id}/runs/{run_id} */
		Matcher matcher = one.matcher(requestURL);
		if (matcher.find())
		{
			return "Matched _dataflow_Pattern";
		}
		/* For URLs matching {host}/v2/data_flows/{id}/runs */
		matcher = two.matcher(requestURL);
		if (matcher.find())
		{
			return "Matched _dataflow_id_Pattern";
		}
		/* For URLs matching {host}/v2/data_flows/{id}/runs */
		matcher = three.matcher(requestURL);
		if (matcher.find())
		{
			return "Matched _dataflow_id_clone_Pattern";
		}
		/* For URLs matching {host}/v2/data_flows/{id} */
		matcher = four.matcher(requestURL);
		if (matcher.find())
		{
			return "Matched _dataflow_id_runs_Pattern";
		}
		/* For URLs matching {host}/v2/data_flows/{id} */
		matcher = five.matcher(requestURL);
		if (matcher.find())
		{
			return "Matched _dataflow_id_runs_id_Pattern";
		}

		return null;
	}

}
