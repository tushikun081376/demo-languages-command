package demo.languages.java.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionByClass {
	
	public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Method method = String.class.getMethod("toString", null);
		System.out.println(method.invoke("123", null));
		
		Method method2 = String.class.getMethod("substring", int.class,int.class);
		System.out.println(method2.invoke("123", 1,2));
		
		Method[] methods = String.class.getMethods();
		Constructor<?>[] constructors = String.class.getConstructors();
		
	}

}
