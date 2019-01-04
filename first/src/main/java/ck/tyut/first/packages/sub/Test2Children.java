package ck.tyut.first.packages.sub;

import ck.tyut.first.packages.Test2;

public class Test2Children extends Test2{
	public static void main(String[] args){
		Test2 test2 = new Test2();
		test2.method_public();
	}
	
	public String method_protected_child(){
		return method_protected();
	}
}
