package sef.FinalActivity;

import java.util.ArrayList;
import java.util.List;

import sef.FinalActivity.Person;
import sef.FinalActivity.Employee;
import sef.FinalActivity.SalaryComparator;

public class FirstActivity{
	public static void main(String[] args) {
		
		List<Employee> employees = new ArrayList<Employee>(0);
		
		
		Employee em1 = new Employee("John");
		Employee em2 = new Employee("Elvis");
		Employee em3 = new Employee("Kelvin");
		Employee em4 = new Employee("Usain");
		
		em1.setSalary(1000.0);
		em2.setSalary(9999.0);
		em3.setSalary(255.0);
		em4.setSalary(1234.0);
		
		employees.add(em1);
		employees.add(em2);
		employees.add(em3);
		employees.add(em4);
		
		
		employees.sort(new SalaryComparator());
		
		for (int i = 0; i < employees.size(); i++)
		{
			System.out.println("Employee name: " + employees.get(i).getName());
			System.out.println("Employee salary: " + employees.get(i).getSalary());
			System.out.println("-------------------");
		}
		
		
		Person personTest = new Person("Ivan"); 
		
		
		try {
			personTest.setFirstName("Ivan3"); 
		} catch (Exception e) {
			System.out.println("Failed setFirstName: " + e.getMessage());
		}

		
		try {
			personTest.setSecondName("TheTerrible1"); 
		} catch (Exception e) {
			System.out.println("Failed setSecondName: " + e.getMessage());
		}

		
		try {
			personTest.setFirstName("Ivanovich"); 
		} catch (Exception e) {
			System.out.println("Failed setFirstName: " + e.getMessage());
		}
		
		System.out.println("Person name: " + personTest.getFirstName());
	}
}