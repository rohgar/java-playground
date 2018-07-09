package com.pg.arandom;

import java.util.HashMap;
import java.util.Map;

public class StaticTester
{

	public static final String MIME_TEXT_CSV = "text/csv";
	public static final String MIME_TEXT_PLAIN = "text/plain";
	public static final String MIME_APPLICATION_JSON = "application/json";
	public static final String MIME_APPLICATION_OCTET = "application/octet-stream";
	private static final Map<String, String> MIME_TYPE_FILE_TYPE_MAP = new HashMap<String, String>();

	static
	{
		MIME_TYPE_FILE_TYPE_MAP.put(MIME_TEXT_CSV, "csv");
		MIME_TYPE_FILE_TYPE_MAP.put(MIME_TEXT_PLAIN, "txt");
		MIME_TYPE_FILE_TYPE_MAP.put(MIME_APPLICATION_JSON, "json");
	}

	public static Map<String, String> getHashMap()
	{
		return MIME_TYPE_FILE_TYPE_MAP;
	}

}
