package ck.tyut.first.javaversion;

import ck.tyut.first.service.UserService;

import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Map;

public class Java5 {

    //
    public static void main(String[] args) throws Exception {
        Class clazz = UserService.class;
        Method method =  clazz.getMethod("speak",String[].class);
        //反射,当实际方法是静态方法时，对象参数可传null
        //实际方法参数为数组时，需转换为object
        method.invoke(null,(Object)new String[]{"111","222","333"});
        // T... a 传参时，需要注意基本类型数组，无法转换为object类型数组
        System.out.println(Arrays.asList(new int[]{1,2,3}).size());
        System.out.println(Arrays.asList(new String[]{"111","222","333"}).size());

        Type[] types = Java5.class.getMethod("aaa",Map.class).getGenericParameterTypes();
        ParameterizedType type = (ParameterizedType) types[0];
        System.out.println(type.getTypeName());
        System.out.println(type.getRawType());
        System.out.println(type.getActualTypeArguments()[1]);
        System.out.println(type.getOwnerType());
    }

    public static <T,V> void aaa(Map<T,V> map){

    }
}
