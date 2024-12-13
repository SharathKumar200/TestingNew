package com.sorting;

import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSet4thcons {

	public static void main(String[] args) {
		TreeSet<Integer> t = new TreeSet<Integer>();
		for (int i = 1; i <= 10; i++) {
			t.add(i);
		}
		SortedSet<Integer> s1 = t.subSet(2, 6);

		TreeSet<Integer> t2 = new TreeSet<Integer>(s1);
		System.out.println(t2);

		SortedSet<Integer> s2 = t.tailSet(2);

		TreeSet<Integer> t3 = new TreeSet<Integer>(s2);
		System.out.println(t3);

		SortedSet<Integer> s4 = t.headSet(6);

		TreeSet<Integer> t4 = new TreeSet<Integer>(s4);
		System.out.println(t4);

	}

}
