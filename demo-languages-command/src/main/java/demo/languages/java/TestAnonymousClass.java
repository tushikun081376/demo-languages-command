package demo.languages.java;

public class TestAnonymousClass {
	
	//静态内部类
	private static class A{}
	
	//成员内部类
	private class B{}
	
	public static void main(String args[]) {
		//局部内部类
		class C{
			
		}
		TestAnonymousClass testAnonymousClass = new TestAnonymousClass();
		testAnonymousClass.show();
	}

	// 在这个方法中构造了一个匿名内部类
	private void show() {
		/**
		 * 匿名类实现方式1：继承一个类，重写其方法
		 * 形式为：new <类或接口> <类的主体>
		 */
		Out anony = new Out() { // 获取匿名内部类实例
			void show() { // 重写父类的方法
				System.out.println("this is Anonymous InterClass showing.");
			}
		};
		anony.show();// 调用其方法
		
		/**
		 * 匿名类实现方式2：实现一个接口，可以是多个
		 * 形式为：new <类或接口> <类的主体>
		 */
		Bus bus = new Bus(){
			@Override
			public void draw(String str) {
				System.out.println(str+"this is bus showing");
			}
		};
		bus.draw("hello");
	}
}

// 已有类Out；匿名内部类通过重写其方法获得另外的实现
class Out {
	void show() {
		System.out.println("this is Out showing.");
	}
}

interface Bus{
	void draw(String str);
}
