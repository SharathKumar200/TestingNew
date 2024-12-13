package com.List;

import java.util.ArrayList;

public class OneCollectionToAnother {

	public static void main(String[] args) {
//		ArrayList al = new ArrayList();
//		al.add(10);
//		al.add("sharath");
//		al.add(null);
//
//		ArrayList al2 = new ArrayList(al);
//
//		al2.add(20);
//		al2.add("kumar");
//
//		System.out.println(al2);

		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		ArrayList<Integer> al2 = new ArrayList<Integer>();

		al2.add(20);
		ArrayList<Integer> al3 = new ArrayList<Integer>();

		

		al3.addAll(al);
		al3.addAll(al2);
		al3.add(30);
		System.out.println(al3);

	}

}
