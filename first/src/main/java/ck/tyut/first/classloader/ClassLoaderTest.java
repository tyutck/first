package ck.tyut.first.classloader;
/**
 * JDK 默认提供了如下几种ClassLoader
 * 
 * Bootstrp loader
 *	Bootstrp加载器是用C++语言写的，它是在Java虚拟机启动后初始化的，它主要负责加载%JAVA_HOME%/jre/lib,-Xbootclasspath参数指定的路径以及%JAVA_HOME%/jre/classes中的类。
 *
 * ExtClassLoader  
 *	Bootstrp loader加载ExtClassLoader,并且将ExtClassLoader的父加载器设置为Bootstrp loader.ExtClassLoader是用Java写的，具体来说就是 sun.misc.Launcher$ExtClassLoader，ExtClassLoader主要加载%JAVA_HOME%/jre/lib/ext，此路径下的所有classes目录以及java.ext.dirs系统变量指定的路径中类库。

 * AppClassLoader 
 *	Bootstrp loader加载完ExtClassLoader后，就会加载AppClassLoader,并且将AppClassLoader的父加载器指定为 ExtClassLoader。AppClassLoader也是用Java写成的，它的实现类是 sun.misc.Launcher$AppClassLoader，另外我们知道ClassLoader中有个getSystemClassLoader方法,此方法返回的正是AppclassLoader.AppClassLoader主要负责加载classpath所指定的位置的类或者是jar文档，它也是Java程序默认的类加载器。
 * 
 * 自定义类加载器，常见的web应用servlet加载器
 * */
public class ClassLoaderTest {
	
	public static void main(String[] args) throws Exception {
		System.out.println(ClassLoaderTest.class.getClassLoader().getClass().getName());
		System.out.println(System.class.getClassLoader());
		ClassLoader loader = ClassLoaderTest.class.getClassLoader();
		while(loader != null){
			System.out.println(loader.getClass().getName());
			loader  = loader.getParent();
		}
		System.out.println(loader);

		Class c1 = new MyClassLoad().loadClass("UserService");
		Object object = c1.newInstance();
		System.out.println(object);
	}
}
