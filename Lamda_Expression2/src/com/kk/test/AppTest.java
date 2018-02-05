package com.kk.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AppTest {

	public static void main(String[] args) {
		Employee emp1 = new Employee(90);
		Employee emp2 = new Employee(80);
		Employee emp3 = new Employee(70);
		Employee emp4 = new Employee(60);

		List<Integer> list = new ArrayList<>();
		list.add(emp1.getAge());
		list.add(emp2.getAge());
		list.add(emp3.getAge());
		list.add(emp4.getAge());
		
		Collections.sort(list, (s1, s2) -> s1.compareTo(s2));
		
		list.forEach((k) -> {
			System.out.println(k);
		});

	}

}
