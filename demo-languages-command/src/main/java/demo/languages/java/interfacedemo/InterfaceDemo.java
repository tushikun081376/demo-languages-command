package demo.languages.java.interfacedemo;


public class InterfaceDemo extends AbstractClass implements InterfaceA{

	public InterfaceDemo(){
		
	}
}

abstract class AbstractClass{
	public void sendMsg(){
		System.out.println(1);
	}
}

interface InterfaceA{
	void sendMsg();
}