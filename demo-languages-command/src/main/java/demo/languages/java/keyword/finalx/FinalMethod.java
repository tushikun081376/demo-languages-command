package demo.languages.java.keyword.finalx;

public class FinalMethod {
	public static void main(String[] args) {
		System.out.println(Simple.a);
		Simple.go();
		
		Simple s = new Simple();
		System.out.println(Simple.a);
		s.go();
	}
} 

class Simple {
	static String a = "1";
	static void go() {
		System.out.println("Welcome");
	}
}
