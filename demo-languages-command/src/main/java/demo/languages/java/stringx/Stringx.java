package demo.languages.java.stringx;

public class Stringx {
	
	public static void main(String[] args) {
		float a = 1.0f;
		int b = 2;
		String c = "3";
		
		System.out.printf("浮点型变量的值为 %f, 整型变量的值为 %d, 字符串变量的值为 is %s", a, b, c);
		System.out.println("\n");
		// 你也可以这样写
		String fs;
		fs = String.format("浮点型变量的值为 %f, 整型变量的值为 %d, 字符串变量的值为 %s",a, b, c);
		System.out.println(fs);
		
		
	}

}
