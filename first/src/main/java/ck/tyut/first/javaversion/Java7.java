package ck.tyut.first.javaversion;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
//java7语法新特性
public class Java7 {
	int age = 0B11110001;// 增加二进制表示
	long phone = 187_3413_0859L;// 数字中可添加分隔符，jvm自动去除下划线
	List<String> list = new ArrayList<>();//泛型自动推导，原来List<String> list = new ArrayList<String>();

	// switch中增加对String类型的支持。
	public String generate(String name, String gender) {
		String title = "";
		switch (gender) {
		case "男":
			title = name + " 先生";
			break;
		case "女":
			title = name + " 女士";
			break;
		default:
			title = name;
		}
		return title;
	}

	//try-with-resources语句 
	//catch子句可以同时捕获多个异常
	public String read(String filename)   {
		try (BufferedReader reader = new BufferedReader(new FileReader(filename));OutputStream output = new FileOutputStream("") ) {//try()子句中可以管理多个资源
			StringBuilder builder = new StringBuilder();
			String line = null;
			while ((line = reader.readLine()) != null) {
				builder.append(line);
				builder.append(String.format("%n"));
			}
			Integer.parseInt("Hello");
			return builder.toString();
			
		}catch (IOException | NumberFormatException q) { // 使用'|'分割，多个类型，一个对象e

		}
		return null;
	}

}
