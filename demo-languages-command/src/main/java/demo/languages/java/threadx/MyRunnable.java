package demo.languages.java.threadx;

public class MyRunnable implements Runnable {
	
	private volatile boolean active;
	static int a = 1;

	public void run() {
		active = true;
		while (active) // 第一行
		{
			System.out.println(active);
			// 代码
		}
	}

	public void stop() throws InterruptedException {
		active = false; // 第二行
		System.out.println(2);
	}
	
	public void start(){
		new Thread(this).start();
	}
}