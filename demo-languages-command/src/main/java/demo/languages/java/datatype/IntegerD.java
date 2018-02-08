package demo.languages.java.datatype;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class IntegerD {

	public static void main(String[] args) {
		Integer a = 10;
		Integer b = 10;
		System.out.println(a == b); // true
		System.out.println(a.equals(b)); // true
		Integer c = 1000;
		Integer d = 1000;
		System.out.println(c == d); // false
		System.out.println(c.equals(d)); // true
		
		Calendar ca = Calendar.getInstance();
		ca.set(0, 1, 1);
		System.out.println(ca.get(Calendar.YEAR) + "-" + ca.get(Calendar.MONTH) + "-" + ca.get(Calendar.DATE));
	}
}
