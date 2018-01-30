package demo.languages.java.datatype;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.Stack;
import java.util.Vector;

public class BaseDataTypeDemo {

	public static void main(String[] args) {
		char a = 'a';
		int b = a;
		System.out.println(b);
		byte c = (byte) a;
		System.out.println(c);
		
		String d = "helloWorld";
		byte[] e = d.getBytes();
		System.out.println(e.clone());
		char[] f = d.toCharArray();
		for(byte g:e){
			System.out.println(g);
		}
		System.out.println(f);
		List arraylist = new ArrayList();
		List linklist = new LinkedList();
		List vector = new Vector<>();
		List stack = new Stack();
		
		arraylist.add("1");
		arraylist.add("2");
		arraylist.add("3");
		Iterator it = arraylist.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
		
		Set set = new HashSet();
		
	}
}
