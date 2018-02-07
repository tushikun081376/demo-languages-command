package demo.languages.java.threadx;

public class MyRunnableTest {
	
	public static void main(String[] args) throws InterruptedException {
		MyRunnable t1 = new MyRunnable();
		MyRunnable t2 = new MyRunnable();
		System.out.println(++t1.a);
		System.out.println(++t1.a);
		System.out.println(t2.a);
	}
}
