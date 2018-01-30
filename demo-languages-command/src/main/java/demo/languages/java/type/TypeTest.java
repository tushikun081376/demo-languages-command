package demo.languages.java.type;

import java.util.ArrayList;
import java.util.List;

public class TypeTest<T> {
	
	private T t;
	
	public TypeTest(T key){
		this.t = key;
	}
	
	public T getT(){
		return t;
	}
	
	private static String b;
	
	public static void main(String[] args) {
//		List<String> stringArrayList = new ArrayList<String>();
//		List<Integer> integerArrayList = new ArrayList<Integer>();
//
//		Class classStringArrayList = stringArrayList.getClass();
//		Class classIntegerArrayList = integerArrayList.getClass();
//
//		if(classStringArrayList.equals(classIntegerArrayList)){
//			System.out.println("泛型测试：类型相同");
//		}
//		
//		TypeTest t = new TypeTest("1111");
//		System.out.println(t.getT());
//		System.out.println(t instanceof TypeTest);
//		
//		TypeTest<String> t1 = new TypeTest<String>("1111");
//		System.out.println(t.getT());
//		//System.out.println(t instanceof TypeTest<String>);
		
		String a = null;
		System.out.println(a);
		System.out.println(b);
		
	}

}
