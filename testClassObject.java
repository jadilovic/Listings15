package testJVM;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class testClassObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student s1 = new Student();
		
		Class c1 = s1.getClass();
		System.out.println(c1.getName());
		
		Method[] m = c1.getDeclaredMethods();
		for(Method meth: m)
			System.out.println(meth.getName());
		
		Field[] f = c1.getDeclaredFields();
		for(Field field: f)
			System.out.println(field.getName());
		
		Student s2 = new Student();
		Class c2 = s2.getClass();
		System.out.println(c2.getName());
	}
}
