package demo.languages.java.keyword.accesscontrol.person;

class BVB {

	private String a= "a";
	String b = "b";
	protected String c = "c";
	public String d ="d";
	
	public BVB(){
		System.out.println(this.a);
		System.out.println(this.b);
		System.out.println(this.c);
		System.out.println(this.d);
	}
}

class VBD {
	public VBD(){
		BVB bvb = new BVB();
		System.out.println(bvb.b);
		System.out.println(bvb.c);
		System.out.println(bvb.d);
	}
	
}