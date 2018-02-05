package com.mk.test;

public class Employee implements Comparable<Employee> {

	private int age;
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + "]";
	}

	@Override
	public int compareTo(Employee o) {
		return (this.name.compareTo(o.getName()));
	}

	public Employee(String name) {
		super();
		this.name = name;
	}

}
