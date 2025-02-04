package emp;

import java.util.ArrayList;

/*This class manages a collection of Employee objects using an ArrayList.
The addEmployee() method adds an employee to the directory.
The displayAllEmployees() method prints details of all employees in the directory.
The updateEmployee() method updates an employee's information at a specified index in the directory.
The deleteEmployee() method removes an employee from the directory at a specified index.*/
public class Directory {
	ArrayList<Employee> list = new ArrayList<>();
	public void addEmployee(Employee emp){
		list.add(emp);
		System.out.println("Emloyee details added Successfully");
	}
	
	public void displayAllEmployees(){
		System.out.println(list);
	}
	
	public void updateEmployee(int i,Employee emp) {
		list.set(i, emp);
		System.out.println("Employee details updated successfully");
	}
	
	public void deleteEmployee(int i) {
		list.remove(i);
	}
}
