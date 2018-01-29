package demo.languages.java.keyword.accesscontrol.person;

public class Person {
	
	private String name = "张三";
	
	String sex = "男";
	
	protected Long age = 10L;
	
	public String address = "黑龙江";
	
	public static void main(String[] args) {
		Person person = new Person();
		System.out.println(person.name);
		System.out.println(person.sex);
		System.out.println(person.age);
		System.out.println(person.address);
	}

}
