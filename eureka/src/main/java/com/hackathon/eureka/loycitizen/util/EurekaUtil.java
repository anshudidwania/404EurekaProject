package com.hackathon.eureka.loycitizen.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class EurekaUtil {

	public static Date convertStringToDate(String dateString) {
		    try {
				return new SimpleDateFormat("dd-MMM-yyyy").parse(dateString);
			} catch (ParseException e) {
				e.printStackTrace();
			} 
		    return null;
	}
}
