package com.List;

import java.util.ArrayList;
import java.util.Arrays;

public class ConversionProcess {

	public static void main(String[] args) {
		String[] s = { "sss", "ddd", "bbb" };
		ArrayList<String> a1 = new ArrayList<String>(Arrays.asList(s));
		a1.add("sharath");
		a1.add("kumar");
		System.out.println(a1);
		ArrayList<String> a2 = new ArrayList<String>();
		a2.add("bhuvan");
		a2.add("kumar");
		// String[] s1=new String[2];
		String[] s1 = new String[a2.size()];
		a2.toArray(s1);
		for (String ss : s1) {
			System.out.println(ss);

		}
		ArrayList a3 = new ArrayList();
		a3.add(12);
		a3.add("harish");
		Object[] o = a3.toArray();
		for (Object oo : o) {
			System.out.println(oo);

		}

	}

}
