package emp;
/*This class represents an employee with attributes like name, position, and salary.
It has a constructor to initialize an employee's details and getters/setters to access and modify these details.
The toString() method is overridden to provide a string representation of an employee's details.*/
public class Employee {
	private String name;
	private String position;
	private double salary;
	public Employee(String name, String position, double salary) {
		super();
		this.name = name;
		this.position = position;
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	} 
	
	@Override
		public String toString() {
			return "Employee{name="+this.name+", position="+this.position+", salary="+this.salary+"}";
		}
}
