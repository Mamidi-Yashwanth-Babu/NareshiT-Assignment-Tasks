package emp;

import java.util.ArrayList;

/*EmployeeDirectoryExample Class (Main Class):
This class contains the main() method where an instance of Directory is created.
Two employees, "Alice" and "Bob," are added to the directory with their respective positions and salaries.
The displayAllEmployees() method is called to show all employees.
The details of "Bob" are updated to reflect a change in position and salary.
"Alice" is deleted from the directory.
Finally, the updated list of employees is displayed again.*/
public class EmployeeDirectoryExample {
	public static void main(String[] args) {
		Directory dir = new Directory();
		dir.addEmployee(new Employee("Alice", "Manager", 60000.0));
		dir.addEmployee(new Employee("Bob", "Developer", 50000.0));
		dir.displayAllEmployees();
		dir.updateEmployee(1, new Employee("Bob", "Senior Developer", 55000.0));
		dir.displayAllEmployees();
	}
}
