package demo.languages.java.util;

import java.util.Calendar;

public class CalendarD {

	public static void main(String[] args) {
		Calendar ca = Calendar.getInstance();
		ca.set(0, 1, 1);
		System.out.println(ca.get(Calendar.YEAR) + "-" + ca.get(Calendar.MONTH) + "-" + ca.get(Calendar.DATE));
	}
}
