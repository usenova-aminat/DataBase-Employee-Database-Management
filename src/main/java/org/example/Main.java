package org.example;

import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        EmployeeData employeeData = new EmployeeData();

        System.out.println("    Creating a new employee    ");
        Employee newEmployee = new Employee("Emilia Clark", "tester", 50000.0, new Date());
        employeeData.createEmployee(newEmployee);
        System.out.println("New employee added: " + newEmployee);


        System.out.println("\n    Reading employee by ID    ");
        int employeeId = 7;
        Employee fetchedEmployee = employeeData.getEmployeeById(employeeId);
        if (fetchedEmployee != null) {
            System.out.println("Employee found: " + fetchedEmployee);
        } else {
            System.out.println("Employee with ID " + employeeId + " not found.");
        }


        System.out.println("\n    Updating employee    ");
        if (fetchedEmployee != null) {
            fetchedEmployee.setPosition("SEO");
            fetchedEmployee.setSalary(100000.0);
            employeeData.updateEmployee(fetchedEmployee);
            System.out.println("Updated employee: " + fetchedEmployee);
        } else {
            System.out.println("Cannot update - employee not found.");
        }

        
        System.out.println("\n=== Deleting employee ===");
        int deleteId = 1;
        employeeData.deleteEmployee(deleteId);
        System.out.println("Employee with ID " + deleteId + " deleted.");

    }

}
