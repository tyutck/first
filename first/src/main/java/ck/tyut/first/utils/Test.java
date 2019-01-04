package ck.tyut.first.utils;

public abstract class Test {

	
	public static void main(String[] args){
		try{
			return;
		}finally{
			System.out.println("aaaa");
		}
		
//		byte b = (byte)129;
//		System.out.println(b);
	}
	
	public void a(){
		int a = ITest.a;
	}
	
	public static void IntegerCahe(){
		Integer a = 1;
		Integer b = 1;
		Integer c = 222;
		Integer d = 222;
		Integer e = Integer.valueOf("1");
		Integer f = Integer.valueOf(1);
		Integer g = new Integer(1) ;
		Integer h = new Integer("1") ;
		
		Long l = 1L;
		
		System.out.println(a == b);
		System.out.println(c == d);
		System.out.println(a == e);
		System.out.println(a == f);
		System.out.println(a == g);
		System.out.println(a == h);
	}
	
}
