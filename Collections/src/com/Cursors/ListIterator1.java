package com.Cursors;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIterator1 {

	public static void main(String[] args) {
		ArrayList<String> a1 = new ArrayList<String>();
		a1.add("sharath");
		a1.add("bhuvana");
		a1.add("brinda");
		a1.add("harish");

		ListIterator lt = a1.listIterator();

		while (lt.hasNext()) {
			Object s = (String) lt.next();
			System.out.println(s);

		}

		while (lt.hasPrevious()) {
			String s = (String) lt.previous();
			System.out.println(s);

		}
	}

}
