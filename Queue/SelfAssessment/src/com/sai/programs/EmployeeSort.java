package com.sai.programs;

import java.util.Arrays;

import java.util.List;

public class EmployeeSort {

	public static void main(String[] args) {
		Employee e1 = new Employee("sai", 24, 12);
		Employee e2 = new Employee("shiva", 25, 12);
		Employee e3 = new Employee("siri", 22, 15);
		Employee e4 = new Employee("karun", 22, 3);
		Employee e5 = new Employee("megh", 22, 18);
		
		
		List<Employee> employeeList = Arrays.asList(new Employee[]{e1,e2,e3,e4,e5});
		
		employeeList.sort(null);
		
		for(int i =0 ; i< employeeList.size();i++) {
			System.out.println(employeeList.get(i).age + " "+ employeeList.get(i).Name);
		}
		
		
		employeeList.sort((i, j) -> i.id>j.id?1:i.id<j.id?-1:0);
		
		System.out.println("using comparator");
		for(int i =0 ; i< employeeList.size();i++) {
			System.out.println(employeeList.get(i).id + " "+ employeeList.get(i).Name);
		}
		
		

}
}
