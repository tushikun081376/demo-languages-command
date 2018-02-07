package demo.languages.java.keyword.finalx;

import demo.languages.java.enumx.Signal;
import demo.languages.java.keyword.finalx.FinalFatherClass.FinalSubClass;

public final class FinalClass {
	
	final String a = "1";
	
	final void show(String str){
		System.out.println(str);
	}
	
	public static void main(String[] args) {
		FinalClass f = new FinalClass();
		//f.a = "2";//The final field FinalClass.a cannot be assigned
	}
}

class FinalFatherClass{
	void show(){
		System.out.println(1);
	}
	static class FinalSubClass extends FinalFatherClass{
		void show(){
			System.out.println(2);
			//Cannot override the final method from FinalFatherClass
 		}
	}
	public static void main(String[] args) {
		new FinalSubClass().show();
	}
	void ss(){
		 
		Signal color = Signal.RED;
		switch(color){
		case RED:
			color = Signal.GREEN;
			break;
		case GREEN:
			color = Signal.YELLOW;
			break;
		case YELLOW:
			color = Signal.RED;
			break;
		}
		System.out.println("Signal=="+color);
		
		int a = 2;
		switch(a){
		case 1:
			color = Signal.GREEN;
			break;
		case 2:
			color = Signal.YELLOW;
			break;
		case 3:
			color = Signal.RED;
			break;
		}
		System.out.println("int=="+color);
		
		char b = 'a';
		switch(b){
		case 'a':
			color = Signal.GREEN;
			break;
		case 'b':
			color = Signal.YELLOW;
			break;
		case 'c':
			color = Signal.RED;
			break;
		}
		System.out.println("char=="+color);
		
		String c = "a";
		switch(c){
		case "a":
			color = Signal.GREEN;
			break;
		case "b":
			color = Signal.YELLOW;
			break;
		case "c":
			color = Signal.RED;
			break;
		}
		System.out.println("String=="+color);
	}
}

/*class FinalChild extends FinalClass{
	//The type FinalChild cannot subclass the final class FinalClass
}*/
