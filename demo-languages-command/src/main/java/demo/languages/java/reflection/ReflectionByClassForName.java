package demo.languages.java.reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionByClassForName {

	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Class c1 = Class.forName("java.lang.String");
		c1.getAnnotations();
		c1.getConstructors();
		c1.getFields();
		c1.getMethods();
		Method charAt = c1.getMethod("charAt", int.class);
		System.out.println(charAt.invoke("1234", 3));
	}
}
