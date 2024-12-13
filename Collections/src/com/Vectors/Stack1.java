package com.Vectors;

import java.util.Stack;

public class Stack1 {

	public static void main(String[] args) {
		Stack<String> s = new Stack<String>();
		s.push("sharath");
		s.push("bhuvana");
		s.push("brunda");
		s.push("harish");
		System.out.println(s);
		System.out.println(s.search("brunda"));
		s.pop();
		System.out.println(s.peek());
		System.out.println(s.empty());
		System.out.println(s);
		s.clear();
		System.out.println(s.empty());
	}

}
