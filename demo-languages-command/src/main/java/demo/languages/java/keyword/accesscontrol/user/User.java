package demo.languages.java.keyword.accesscontrol.user;

import demo.languages.java.keyword.accesscontrol.person.Person;

public class User{
	
	public static void main(String[] args) {
		/**
		 * 外部类的修饰符：只有public和default
		 * public修饰的类可以被其他任何类访问
		 * default类只能在本包中被访问
		 */
		Person person = new Person();
		//Dog dog = new Dog();
		
		//System.out.println(person.name);
		//System.out.println(person.sex);
		//System.out.println(person.age);
		System.out.println(person.address);
	}

}
