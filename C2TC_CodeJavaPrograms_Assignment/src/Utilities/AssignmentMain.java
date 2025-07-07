
package Utilities;
import Employees.Developer;
import Employees.Employee;
import Employees.Manager;
import Utilities.EmployeeUtilities;

public class AssignmentMain {
	public static void main(String [] args) {
		Manager manager = new Manager("alice", 1001, 90000.0,"sales");
		Developer developer = new Developer("bob", 1002, 80900.0, "java");
		System.out.println("Manager Details:"+ manager);
		System.out.println("Developer Details" + developer);
		
	}

}
