package com.sai.programs;

public class Employee implements Comparable<Employee> {

	String Name;
	int age;
	int id;
	
	
	public Employee(String name, int age, int id) {
		super();
		Name = name;
		this.age = age;
		this.id = id;
	}


	@Override
	public int compareTo(Employee o) {
		
		if(this.age<o.age) {
			return -1;
		}
		else if(this.age>age) {
			return 1;
		}
		return 0;
	}
	
	
}
