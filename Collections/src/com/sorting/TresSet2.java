package com.sorting;

import java.util.Comparator;
import java.util.TreeSet;

public class TresSet2 {

	public static void main(String[] args) {
		TreeSet<Product> t = new TreeSet<Product>(new My4());
		t.add(new Product(111, "pen", 50));
		t.add(new Product(444, "pencil", 100));
		t.add(new Product(222, "book", 500));
		t.add(new Product(333, "marker", 500));
		for (Product p : t) {
			System.out.println(p.projectid + " " + p.name + " " + p.amount);
		}

	}

}

class My4 implements Comparator<Product> {

	public int compare(Product p1, Product p2) {

		return -p1.name.compareTo(p2.name);

	}

}