package testJVM;


import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Refleksija {

	public static void main(String[] args) {
		Student s1 = new Student();

		// Class kreiran od strane JVM
		Class c1 = s1.getClass();

		// ispisati tip objekta
		System.out.println("Tip objekta:");
		System.out.println(c1.getName());

		// ispisati sve metode objekta
		System.out.println("\nMetode objekta:");

		Method m[] = c1.getDeclaredMethods();
		for (Method method : m)
			System.out.println(method.getName());

		// ispisati sva polja objekta
		System.out.println("\nPolja objekta:");

		Field f[] = c1.getDeclaredFields();
		for (Field field : f)
			System.out.println(field.getName());

	}
}

