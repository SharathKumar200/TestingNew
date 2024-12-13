package com.Cursors;

import java.util.ArrayList;
import java.util.Iterator;

public class Removeelement {

	public static void main(String[] args) {
		ArrayList<Book> books = new ArrayList<Book>();

		books.add(new Book("111", "sharath", "nanu"));
		books.add(new Book("222", "bhuvan", "ninu"));
		books.add(new Book("333", "kumar", "nanu2"));

		Iterator<Book> itr = books.iterator();

		while (itr.hasNext()) {
			Book b = itr.next();
			if (b.name.equals("sharath")) {
				itr.remove();

			}
		}
		while (itr.hasNext()) {
			Book b = itr.next();
			if (b.id == "222") {
				itr.remove();

			}
		}
		for (Book b : books) {
			System.out.println(b.id + " " + b.Author + " " + b.name);
		}

	}

}
