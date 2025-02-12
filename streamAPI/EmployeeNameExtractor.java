package streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeNameExtractor {
	public static void main(String[] args) {
		List<Employee> employees = Arrays.asList(
				new Employee("Alice", 1),
	            new Employee("Bob", 2),
	            new Employee("Charlie", 3),
	            new Employee("Scott", 4));
		
		List<String> EmployeeNames = employees.stream().map(Employee::getEmpName)
				.collect(Collectors.toList());
		System.out.println(EmployeeNames);
	}
}
