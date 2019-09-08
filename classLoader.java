package testJVM;

public class classLoader {

	public static void main(String[] args) {

		// Java code to demonstrate Class Loader subsystem 
		        // String class is loaded by bootstrap loader, and 
		        // bootstrap loader is not Java object, hence null 
		        System.out.println(String.class.getClassLoader()); 
		  
		        // Test class is loaded by Application loader 
		        System.out.println(classLoader.class.getClassLoader()); 
		    } 
	}

