package com.okdevtv.tdd.hello;

import java.text.NumberFormat;
import java.util.Locale;

public class StringUtils {

	public static String comma(int num) {
		return NumberFormat.getNumberInstance(Locale.US).format(num);
	}

}
