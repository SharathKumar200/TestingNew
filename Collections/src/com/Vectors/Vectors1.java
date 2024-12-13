package com.Vectors;

import java.util.Vector;

public class Vectors1 {

	public static void main(String[] args) {
		Vector<String> v = new Vector<String>(2, 6);
		System.out.println(v.capacity());
		v.add("sharath");
		v.add("bhuvana");
		v.add("brunda");
		v.add("harish");
		System.out.println(v);
		System.out.println(v.capacity());

		Vector<String> v1 = new Vector<String>();
		v1.addAll(v);
		v1.add("brunda");
		v1.add("harish");
		System.out.println(v1);
	}

}
