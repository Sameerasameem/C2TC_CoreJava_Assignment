package Assignment1;
import Assignment1.Employees.Developer;
import Assignment1.Employees.Employee;
import Assignment1.Employees.Manager;
import  Assignment1.Utilities.EmployeeUtilities;

public class AssignmentMain {
	public static void main(String [] args) {
		Manager manager = new Manager("alice", 1001, 90000.0,"sales");
		Developer developer = new Developer("bob", 1002, 80900.0, "java");
		System.out.println("Manager Details:"+ manager);
		System.out.println("Developer Details" + developer);
		
	}

}
