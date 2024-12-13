package com.List;

import java.util.ArrayList;
import java.util.Collections;

public class SwappingAndSubList {

	public static void main(String[] args) {
		ArrayList<String> a1 = new ArrayList<String>();
		a1.add("sharath");
		a1.add("harish");
		a1.add("bhuvana");
		a1.add("brunda ");
		System.out.println("Before:" + a1);
		Collections.swap(a1, 1, 3);
		System.out.println("After:" + a1);

		ArrayList<String> a2 = new ArrayList<String>(a1.subList(1, 4));
		System.out.println(a2);

	}

}
