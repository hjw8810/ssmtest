package org.zsl.testmybatis;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {

	public static void main(String[] args) {
		Date currentTime = new Date();
		System.out.println(currentTime.getTime());
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String s = formatter.format(currentTime.getTime());
		System.out.println(s);
		
		
		 
	}

}
