/**
 * 
 */
package src.reflection;

/**
 * @author ADD YOUR NAME 
 *
 */

// Reflection: https://docs.oracle.com/javase/tutorial/reflect/class/

// Demonstration of Reflection

// Given an object o, we want to know what class corresponds to o, the inheritance chain for o
// and the list of methods of the class

// Complete the code

import src.circle.ColoredCircle;

import java.lang.reflect.Method;

public class Reflection {

	/**
	 * Print the class corresponding to the object
	 * @param o the object
	 */
	public void correspondingClass(Object o) {
		if (o == null)
			throw new IllegalArgumentException("Object passesd is null");

		System.out.println("Inspecting class: " + o.getClass().getName());
	}

	/**
	 * Print the chain of super classes of the object 
	 * Format of the output:
	 * Inheritance chain:
	 * Cn inherits from Cn-1 inherits ... inherits from java.lang.Object
	 * @param o the object
	 */
	public void inheritanceChain(Object o) {
		if (o == null)
			throw new IllegalArgumentException("Object passesd is null");

		// TODO To complete
		// You need to use the EXACT format of the output
		// Hint: Use the method getSuperClass
		Class next = o.getClass().getSuperclass();
		System.out.print("Inheritance chain: \n");
		System.out.print(next);

		while(next!=null){

			if(next!=null){

				System.out.print(" "+ "inherits from" + " ");
			}
			System.out.print(next);

			next= next.getSuperclass();
		}
		System.out.println();

	}
	
	/**
	 * Print the list of methods of the object
	 * @param o an object
	 */
	public void listMethods(Object o) {
		if (o == null)
			throw new IllegalArgumentException("Object passesd is null");

		Method[] m = o.getClass().getMethods();

		// List of methods
		// TODO To complete
		// Print each method on one line
		for(int i = 0; i < m.length; i++){
			System.out.print(m[i]);
			System.out.print(" ");
		}
        // Use this EXACT format
		System.out.println("\n");
	}

	/**
	 * Constructor
	 */
	public Reflection() {
	}

	/**
	 * Demonstration
	 * @param args
	 */
	public static void main(String[] args) {

		Reflection r = new Reflection();
		String s = "";

		
		// Demonstration of the methods on an objet of type String
		// TODO To complete
		r.listMethods(s);
		r.inheritanceChain(s);
		r.correspondingClass(s);
		
		// Demonstration of the methods on an objet of type ColoredCircle
		// TODO To complete
		ColoredCircle c = new ColoredCircle();

		r.listMethods(c);
		r.inheritanceChain(c);
		r.correspondingClass(c);


	}

}
