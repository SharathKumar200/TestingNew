package com.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class Collectionsorting {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("sharath");
		al.add("bhuvana");
		al.add("brunda");
		al.add("harish");
		System.out.println("before sorthong:" + al);
		Collections.sort(al);
		System.out.println("After sorthong:" + al);

		LinkedList<Integer> lt = new LinkedList<Integer>();
		lt.add(3);
		lt.add(6);
		lt.add(7);
		lt.add(2);
		lt.add(9);

		lt.add(0);
		System.out.println("before sorthong:" + lt);
		Collections.sort(lt);
		System.out.println("After sorthong:" + lt);
	}

}
