package demo.languages.java.keyword.accesscontrol.person;

public class Person {
	
	private String name = "张三";
	
	String sex = "男";
	
	protected Long age = 10L;
	
	public String address = "黑龙江";
	
	private class Father{
		
	}
	
	class Mother{
		
	}
	
	protected class Sister{
		
	}
	
	public class Brother{
		
	}
	
	public static void main(String[] args) {
		Person person = new Person();
		System.out.println(person.name);
		System.out.println(person.sex);
		System.out.println(person.age);
		System.out.println(person.address);
	}

}

class Mouse {

	private String name = "旺财";
	
	String sex = "女";
	
	protected Long age = 1L;
	
	public String address = "哈尔滨";
	
	public static void main(String[] args) {
		Person person = new Person();
		//System.out.println(person.name);
		System.out.println(person.sex);
		System.out.println(person.age);
		System.out.println(person.address);
	}

}
