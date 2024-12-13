package com.LinkedList;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListex {

	public static void main(String[] args) {
		LinkedList<Book> ll = new LinkedList<Book>();

		ll.add(new Book(111, "ratan", "C"));
		ll.add(new Book(222, "JM", "java"));
		ll.add(new Book(333, "Mj", "C#"));

		ListIterator<Book> litr = ll.listIterator();

		while (litr.hasNext()) {
			Book lt = litr.next();
			if (lt.id == 111)
				litr.remove();

		}
		for (Book b : ll) {
			System.out.println(b.id + " " + b.author + " " + b.name);
		}
		for (int i = 0; i < ll.size(); i++) {
			Book c = ll.get(i);
			System.out.println(c.id + " " + c.author + " " + c.name);

		}
	}

}
