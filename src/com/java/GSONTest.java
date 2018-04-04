package com.java;

import com.google.gson.*;

public class GSONTest 
{

	public static void main(String[] args) 
	{
		
		String status = "[{\"MajorRunStatus\":\"Killed\", \"MinorRunStatus\":\"Submitted\", \"StatusUpdateDate\":\"2018-02-05T21:14:29.531+0000\"}]";
		JsonArray jarray = new JsonParser().parse(status).getAsJsonArray();
		if (jarray != null && jarray.size() > 0) 
		{
			JsonObject jobject = jarray.get(0).getAsJsonObject();
			String majorStatus = jobject.get("MajorRunStatus").getAsString();
			if (majorStatus.equalsIgnoreCase("Killed")) 
			{
				System.out.print("Status was killed");
			}
			else
			{
				System.out.print("Not killed");
			}
		}
	}

}
