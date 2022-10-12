package com.xworkz.comparable;

import java.util.TreeSet;

public class Employee implements Comparable<Employee> {

	public Integer id;
	public String name;

	public Employee(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}

	@Override
	public int compareTo(Employee o) {
		return this.name.compareTo(o.name);
	}

	public static void main(String[] args) {

		Employee employee = new Employee(10, "Dyamanna");
		Employee employee2 = new Employee(30, "Puneet");
		Employee employee3 = new Employee(15, "Roshal");
		Employee employee4 = new Employee(18, "Xavier");

		TreeSet<Employee> tree = new TreeSet<Employee>();
		tree.add(employee);
		tree.add(employee2);
		tree.add(employee3);
		tree.add(employee4);

		System.out.println(tree);

	}

}
