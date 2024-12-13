package com.sorting;

import java.util.ArrayList;
import java.util.Collections;

public class Comparable12 {

	public static void main(String[] args) {
		ArrayList<Emp> al = new ArrayList<Emp>();
		al.add(new Emp(333, "brunda"));
		al.add(new Emp(111, "sharath"));
		al.add(new Emp(222, "bhuvana"));
		al.add(new Emp(555, "harish"));
		
		

		Collections.sort(al);
		for (Emp e : al) {
			System.out.println(e.eid + " " + e.ename);
		}
	}

}
