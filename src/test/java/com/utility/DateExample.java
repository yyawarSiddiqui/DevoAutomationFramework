package com.utility;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExample {

	public static void main(String[] args) {

		Date date = new Date();
		System.out.println(date.toString());

		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-YYYY HH:mm");
		System.out.println(simpleDateFormat.format(date));

	}

}
