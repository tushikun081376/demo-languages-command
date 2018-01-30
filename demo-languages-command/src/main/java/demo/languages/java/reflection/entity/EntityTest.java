package demo.languages.java.reflection.entity;

public class EntityTest {
	
	private String className;
	
	public EntityTest(String className){
		this.className = this.getClass().getName();
	}
	public EntityTest(){
		this.className = this.getClass().getName();
	}
	
	public static void main(String[] args) {
		int a =1;
		
		byte c = 3;
		double b =2;
		Double d = 4d;
		Float e = 5f;
		System.out.println(new EntityTest().className);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d instanceof Double);
		System.out.println(e);
	}

}
