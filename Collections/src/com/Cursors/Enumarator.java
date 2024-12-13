package com.Cursors;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Vector;

public class Enumarator {

	public static void main(String[] args) {
		Vector<String> v = new Vector<String>();
		v.add("sharath");
		v.add("bhuvana");
		v.add("harish");
		v.add("brunda");
		// System.out.println(v);
		Enumeration<String> e = v.elements();
		while (e.hasMoreElements()) {
			String s = e.nextElement();
			System.out.println(s);

		}
		ArrayList<String> fruits = new ArrayList<>();
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Cherry");

		/*
		 * String firstFruit = fruits.get(0); // returns "Apple" String secondFruit =
		 * fruits.get(1); // returns "Banana" String thirdFruit = fruits.get(2);
		 */// returns "Cherry"
		for (int i = 0; i < fruits.size(); i++) {
			System.out.println(fruits.get(i));
		}

	}

}
