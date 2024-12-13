package com.List;

import java.util.ArrayList;

public class ArrayListMethods {
	public static void main(String[] args) {
		/*
		 * ArrayList al = new ArrayList(); al.add(11); al.add("sharath"); al.add(null);
		 * al.add(args); System.out.println(al);
		 * 
		 * System.out.println(al.size()); al.add(3, "sharath1"); // al.add(2, "kumar");
		 * System.out.println(al); al.add(21); System.out.println(al);
		 * 
		 * al.set(0, "bs"); System.out.println(al);
		 * 
		 * System.out.println(al.isEmpty()); al.clear();
		 * System.out.println(al.isEmpty());
		 */
		Emp a1 = new Emp(12, "sharath");
		Emp a2 = new Emp(123, "kumar");
		Emp a3 = new Emp(123, "arun");
		Emp a4 = new Emp(123, "kumar");
		ArrayList<Emp> al = new ArrayList<Emp>();

		al.add(a1);
		al.add(a2);
		ArrayList<Emp> al1 = new ArrayList<Emp>(al);
		al.add(a3);
		al.add(a4);
		al1.addAll(al);
		
		 System.out.println(al1.contains(al));
		 System.out.println(al1.containsAll(al));

		for (Emp e : al) {
			System.out.println(e.eid + " " + e.ename);
		}
		

	}

}
