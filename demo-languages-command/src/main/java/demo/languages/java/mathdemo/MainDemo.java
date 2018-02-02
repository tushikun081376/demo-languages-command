package demo.languages.java.mathdemo;

public class MainDemo extends AbstractClass implements InterfaceA{

	public MainDemo(){
		
	}
	public static void main(String[] args) {
		
	}
}

abstract class AbstractClass{
	public void sendMsg(){
		System.out.println(1);
	}
	public static void main(String[] args) {
		System.out.println(1);
	}
}

interface InterfaceA{
	void sendMsg();
}