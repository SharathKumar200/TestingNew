package com.List;

import java.util.ArrayList;

public class ArrayList2 {

	public static void main(String[] args) {

		ArrayList al = new ArrayList();
		al.add(new Emp(1, "sharath"));
		al.add(new Student(2, "Kumar"));
		al.add(10);
		al.add(10.0);
		al.add(100);
		al.add("sharath");
		al.add('b');
		al.add('s');
		al.add(10);
		al.add(null);
		System.out.println(al.toString());
		for (Object o : al) {
			if (o instanceof Emp) {
				Emp e = (Emp) o;
				System.out.println(e.eid + " " + e.ename);

			}
			if (o instanceof Student) {
				Student s = (Student) o;
				System.out.println(s.sid + " " + s.sname);

			}
			if (o instanceof Integer) {
				System.out.println(o);

			}
			if (o instanceof String) {
				System.out.println(o);

			}
			if (o == null) {
				System.out.println(o);
			}

		}

	}

}
