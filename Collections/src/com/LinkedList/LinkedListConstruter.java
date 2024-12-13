package com.LinkedList;

import java.util.LinkedList;

public class LinkedListConstruter {

	public static void main(String[] args) {
		LinkedList<String> lt = new LinkedList<String>();
		lt.add("sharath");
		lt.add("bhuvana");
		lt.add("brunda");
		lt.add("harish");

		lt.addFirst("kumar");
		lt.addLast("kumar");
		
		
		lt.add(2, "bhuvaneshwarii");
		System.out.println(lt.size());
		System.out.println(lt);
	}

}
