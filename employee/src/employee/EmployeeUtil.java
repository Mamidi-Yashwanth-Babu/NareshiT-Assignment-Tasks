package employee;

import java.util.*;
import java.util.stream.Collectors;

public class EmployeeUtil {
    
    public static HashMap<String, ArrayList<Employee>> categorizeEmployeesByGender(ArrayList<Employee> employees) {
        HashMap<String, ArrayList<Employee>> employeeMap = new HashMap<>();
        
        for (Employee emp : employees) {
            employeeMap.computeIfAbsent(emp.getGender().toLowerCase(), k -> new ArrayList<>()).add(emp);
        }
        
        return employeeMap;
    }
    
    public static List<Employee> getSortedMaleEmployees(Map<String, ArrayList<Employee>> employeeMap) {
        return employeeMap.getOrDefault("male", new ArrayList<>())
                .stream()
                .sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
                .collect(Collectors.toList());
    }
    
    public static List<String> getAllEmployeeNames(Map<String, ArrayList<Employee>> employeeMap) {
        List<String> names = new ArrayList<>();
        
        employeeMap.getOrDefault("male", new ArrayList<>()).forEach(emp -> names.add(emp.getName()));
        employeeMap.getOrDefault("female", new ArrayList<>()).forEach(emp -> names.add(emp.getName()));
        
        return names;
    }
    
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee(1, "Aarati Mehra", 75000, "Female"),
                new Employee(2, "Rohith Sharma", 65000, "male"),
                new Employee(3, "Rajesh Reddy", 85000, "male"),
                new Employee(4, "Neha Gupta", 72000, "Female"),
                new Employee(5, "Priya Desai", 60000, "Female"),
                new Employee(6, "Vikram Singh", 90000, "male")
        );
        
        HashMap<String, ArrayList<Employee>> employeeMap = categorizeEmployeesByGender(new ArrayList<>(employees));
        
        System.out.println("Categorized Employees: " + employeeMap);
        System.out.println("Sorted Male Employees: " + getSortedMaleEmployees(employeeMap));
        System.out.println("All Employee Names (Male First): " + getAllEmployeeNames(employeeMap));
    }
}
