package com.Cursors;

import java.util.ArrayList;
import java.util.Iterator;

public class Iterator1 {

	public static void main(String[] args) {
		ArrayList<String> a1 = new ArrayList<String>();

		a1.add("sharath");
		a1.add("harish");
		a1.add("bhuvana");
		a1.add("brunda");

		Iterator s = a1.iterator();

		while (s.hasNext()) {
			String ss = (String) s.next();
			System.out.println(ss);
		}
	}

}
