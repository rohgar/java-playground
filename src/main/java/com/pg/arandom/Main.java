package com.pg.arandom;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Main {

	public static void main(String[] args) throws ParseException {
		String str = "20030530";
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		final java.util.Date date = formatter.parse(str);
		final long toMillis = date.getTime()/(1000 * 60 * 60 * 24);
		System.out.println("millis = " + toMillis);
//		final int toInt = Integer.valueOf(date);
//		System.out.println("millis" + toMillis);

	}

}
