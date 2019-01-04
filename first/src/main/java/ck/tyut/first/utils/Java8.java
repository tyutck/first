package ck.tyut.first.utils;

import java.util.Arrays;
import java.util.function.Supplier;

//java8语法新特性
public class Java8 {

	public void lambda() {
		Arrays.asList("a", "b", "d").forEach(e -> System.out.println(e));

		String separator = ",";
		Arrays.asList("a", "b", "d").forEach((String e) -> System.out.print(e + separator));

		Arrays.asList("a", "b", "d").sort((String e1, String e2) -> e1.compareTo(e2));

		Arrays.asList("a", "b", "d").sort((e1, e2) -> {
			int result = e1.compareTo(e2);
			return result;
		});

	}

	// 接口的默认方法和静态方法
	private interface Defaulable {
		// 默认方法和抽象方法的区别是抽象方法必须要被实现，默认方法不是。作为替代方式，接口可以提供一个默认的方法实现，所有这个接口的实现类都会通过继承得倒这个方法（如果有需要也可以重写这个方法）
		default String defaultMothed() {
			return "接口默认方法";
		}

		static String staticMothed() {
			return "接口静态方法";
		}

	}
	
	//
	public static class Car {
		    public static Car create( final Supplier< Car > supplier ) {
		        return supplier.get();
		    }             
		    public static void collide( final Car car ) {
		        System.out.println( "Collided " + car.toString() );
		    }
		    public void follow( final Car another ) {
		        System.out.println( "Following the " + another.toString() );
		    }
		 
		    public void repair() {
		        System.out.println( "Repaired " + this.toString() );
		    }
		}
	final Car car = Car.create( Car::new );
//	final List< Car > cars = Arrays.asList( car );
//	cars.forEach( Car::collide );


}
