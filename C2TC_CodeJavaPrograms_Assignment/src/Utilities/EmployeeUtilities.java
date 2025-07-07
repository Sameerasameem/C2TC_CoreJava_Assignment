package Utilities;

import Employees.Developer;
import Employees.Employee;
import Employees.Manager;

public class EmployeeUtilities {
	public static void main(String[] args) {
		Employee emp = new Employee("john", 1001, 5000.0);
		System.out.println("Name:"+ emp.getName());
		System.out.println("Id:"+ emp.getId());
		System.out.println("Salary:"+ emp.getSalary());
		Manager manager = new Manager("john", 1001, 5000.0,"sales");
		System.out.println("Department:"+ manager.getDepartment());
		Developer developer = new Developer("john", 1001, 5000.0,"java");
		System.out.println("programmingLanguage:" + developer.getProgrammingLanguage());
	}

}
