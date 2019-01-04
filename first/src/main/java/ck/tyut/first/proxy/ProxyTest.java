package ck.tyut.first.proxy;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Collection;

public class ProxyTest {
	public static void main(String[] args) {
		Class clazz = Proxy.getProxyClass(ProxyTest.class.getClassLoader(), Collection.class);
		System.out.println(clazz.getName());
		
		Method[] methods = clazz.getMethods();
		for(Method method : methods){
			System.out.println(method.getName());
		}
		System.out.println("---------------------");
		Constructor[] constructors = clazz.getConstructors();
		for(Constructor constructor : constructors){
			System.out.println(constructor.getName());
		}
	}
}
