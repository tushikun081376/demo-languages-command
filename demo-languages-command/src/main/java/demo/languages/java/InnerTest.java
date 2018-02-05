package demo.languages.java;

public class InnerTest {
	private String instAtt = "实例变量";
	private static String Att = "静态变量";
	private static String staticAtt = "外部类的类变量";

	public void test() {
		int methodAtt = 1;
		final int methodFinalAtt = 2;
		/** 非静态方法里的内部类 */
		class MethodInnerClass {
			@Override
			public String toString() {
				// 非静态方法里无法访问实例的外部变量
				System.out.println("非静态方法的内部类可以访问外部类的实例变量：" + instAtt);
				System.out.println("非静态方法的内部类可以访问外部类的静态变量：" + staticAtt);
				// 非静态方法里无法访问方法的非final的变量
				// System.out.println(methodAtt);
				System.out.println("非静态方法的内部类可以访问方法的final变量：" + methodFinalAtt);
				return "my nick name is white";
			}
		}
		new MethodInnerClass().toString();
		System.out.println("-------------我是007的分隔符-------------");
		/** 非静态方法的匿名内部类 */
		new Object() {
			@Override
			public String toString() {
				System.out.println("非静态方法的匿名内部类可以访问外部类的实例变量：" + instAtt);
				System.out.println("非静态方法的匿名内部类可以访问外部类的静态变量：" + staticAtt);
				// 非静态方法里匿名内部类无法访问方法的非final的变量
				// System.out.println(methodAtt);
				System.out.println("非静态方法的匿名内部类可以访问方法的final变量："
						+ methodFinalAtt);
				return "我是匿名内部类";
			}
		}.toString();
	}

	public static void main(String[] args) {
		int methodAtt = 1;
		final int methodFinalAtt = 2;
		/** 静态方法里的内部类 */
		class MethodInnerClass {
			@Override
			public String toString() {
				// 静态方法里无法访问实例的外部变量
				// System.out.println(instAtt);
				System.out.println("静态方法的内部类可以访问外部类的静态变量：" + staticAtt);
				// 静态方法里无法访问方法的非final的变量
				// System.out.println(methodAtt);
				System.out.println("静态方法的内部类可以访问方法的final变量：" + methodFinalAtt);
				return "my nick name is white";
			}
		}
		new MethodInnerClass().toString();
		/** 静态方法的匿名内部类 */
		new Object() {
			@Override
			public String toString() {
				// 静态方法的匿名内部类不能访问外部类的非静态变量
				// System.out.println("非静态方法的匿名内部类可以访问外部类的非静态变量："+instAtt);
				System.out.println("非静态方法的匿名内部类可以访问外部类的静态变量：" + staticAtt);
				// 静态方法里匿名内部类无法访问方法的非final的变量
				// System.out.println(methodAtt);
				System.out.println("非静态方法的匿名内部类可以访问方法的final变量："
						+ methodFinalAtt);
				return "我是匿名内部类";
			}
		}.toString();
		new InnerTest().test();
		// 建立静态内部类(staticInnerClass)的对象
		ImOutClass.StaticInnerClass staticIC = new ImOutClass.StaticInnerClass();
		staticIC.access();
		/**
		 * 建立非静态内部类(non-staticInnerClass)的对象.
		 * 注意这种建立对象的格式首先创建外部类的对象然后使用对象.new来创建。
		 */
		ImOutClass outC = new ImOutClass();
		ImOutClass.InstInnerClass inC = outC.new InstInnerClass();
		inC.access();
	}
}

class ImOutClass {
	private static String staticAtt = "外部类的类变量";
	private String instAtt = "外部类的实例变量";
	private static String xx = "外部静态变量";

	// privateStringxx="外部类的实例变量";
	// 外部类的非静态方法
	public void instanMethod() {
		System.out.println("和外部类实例方法");
	}

	// 外部类的静态方法
	public static void staticMethod() {
		System.out.println("和外部类静态方法");
	}

	/** 静态内部类(staticInnerClass) */
	public static class StaticInnerClass {
		public static void InnerClass() {
			System.out.println("我是静态内部类");
		}

		public void access() {
			System.out.println("我可以访问" + staticAtt);
			staticMethod();
			System.out.println("我可以访问外部的静态变量" + xx);
			// 非静态的方法instanMethod()无法从静态的地方使用
			// instanMethod();
		}
	}

	/** 非静态内部类(non-staticInnerClass) */
	public class InstInnerClass {
		public InstInnerClass() {
			System.out.println("我是成员级内部类，非静态内部类");
		}

		public void access() {
			System.out.println("我可以访问" + instAtt);
			instanMethod();
			staticMethod();
			System.out.println("我可以访问外部的静态变量" + xx);
		}
	}
}