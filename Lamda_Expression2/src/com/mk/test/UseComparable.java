package com.mk.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UseComparable {

	public static void main(String[] args) {
		Employee employee1 = new Employee("Name89");
		Employee employee2 = new Employee("Name80");
		Employee employee3 = new Employee("Name44");
		Employee employee4 = new Employee("Name55");
		Employee employee5 = new Employee("Name45");

		List<Employee> employee = new ArrayList<>();
		employee.add(employee1);
		employee.add(employee2);
		employee.add(employee3);
		employee.add(employee4);
		employee.add(employee5);
		
		Collections.sort(employee);

		for (Employee emp : employee) {
			System.out.println(emp);
		}
		System.out.println("employee.size()::"+ employee.size());
	}

}
