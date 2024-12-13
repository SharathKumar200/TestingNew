package com.Cursors;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class AddingListi {

	public static void main(String[] args) {
		ArrayList<String> a1 = new ArrayList<String>();
		a1.add("sharath");
		a1.add("bhuvan");
		a1.add("harish");
		a1.add("brunda");
		a1.add("kumar");

		ListIterator<String> itr = a1.listIterator();

		itr.add("kumar");

		while (itr.hasNext()) {
			String s = itr.next();
			if (s.equals("sharah"))
				itr.remove();
			if (s.equals("bhuvan"))
				itr.set("bhuvaneshwari");

		}
		System.out.println(a1);
	}

}
