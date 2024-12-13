package com.sorting;

import java.util.Comparator;
import java.util.TreeSet;

public class Treeset1 {

	public static void main(String[] args) {
		TreeSet<String> t = new TreeSet<String>(new MyComp());
		t.add("ratan");
		t.add("anu");
		t.add("durga");
		t.add("sravya");
		t.add("bhuvan");
		System.out.println(t);

		TreeSet<Integer> t1 = new TreeSet<Integer>(new MyComp1());

		for (int i = 1; i <= 100; i++) {
			t1.add(i);

		}
		System.out.println(t1);
	}
}

class MyComp implements Comparator<String> {

	public int compare(String s1, String s2) {

		return -s1.compareTo(s2);
	}

}

class MyComp1 implements Comparator<Integer> {

	public int compare(Integer o1, Integer o2) {

		return -o1.compareTo(o2);
	}

}