package Reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Helper {

    public static void main(String[] args) throws NoSuchFieldException, SecurityException {

        Class ReflectionDemoclass = Demo.class;
        Class className = Demo.class;

        System.out.println("className=="+className);
        System.out.println("getSuperclass"+ReflectionDemoclass.getSuperclass());
        System.out.println("getPackage"+ReflectionDemoclass.getPackage());

        Field[] fields =ReflectionDemoclass.getFields();
        for(Field oneField: fields)
            System.out.println("public fields are =="+oneField.getName());
        Field[] privatefields =ReflectionDemoclass.getDeclaredFields();
        for(Field oneField: privatefields)
            System.out.println("fields are =="+oneField.getName());
        Method[] methods =ReflectionDemoclass.getDeclaredMethods();
        for(Method m: methods)
            System.out.println("methods::::"+m.getName());

    }
}
