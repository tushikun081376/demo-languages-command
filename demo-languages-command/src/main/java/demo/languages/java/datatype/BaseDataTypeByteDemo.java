package demo.languages.java.datatype;


public class BaseDataTypeByteDemo {

	public static void main(String[] args) {
		byte a = 127;
		System.out.println(a);
		
		byte[] b = {1,2,3};
		
		System.out.println(b.length);
		System.out.println(b[0]+b[1]+b[2]);
		
		System.out.println(Byte.SIZE);
		System.out.println(Byte.MAX_VALUE);
		System.out.println(Byte.MIN_VALUE);
		
		char f = 'a';
		System.out.println(f);
	}
}
