package com.List;

import java.util.ArrayList;

public class ArrayListgenerics {

	public static void main(String[] args) {
//		ArrayList<Integer> al = new ArrayList<Integer>();
//		al.add(10);
//		ArrayList al = new ArrayList();
//		al.add(new Emp(111, "sharah"));
//		al.add(new Student(11, "kumar"));
//		for (Object aa : al) {
//			if (aa instanceof Emp) {
//				Emp e = (Emp) aa;
//				System.out.println(e.eid + " " + e.ename);
//
//			}
//			if (aa instanceof Student) {
//				Student s = (Student) aa;
//				System.out.println(s.sid + " " + s.sname);
//			}
//
//		}
		ArrayList<Emp> al = new ArrayList<Emp>();
		al.add(new Emp(111, "Sharath"));
		for (Emp e : al) {
			System.out.println(e.eid + " " + e.ename);
		}
		Emp e = al.get(0	);

		System.out.println(e.eid + " " + e.ename);
	}

}
