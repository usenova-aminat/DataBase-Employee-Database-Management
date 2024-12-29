package org.example;

import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        EmployeeData employeeData = new EmployeeData();

        // 1. Создание нового сотрудника
        System.out.println("=== Creating a new employee ===");
        Employee newEmployee = new Employee("Omar Ali", "Frontend developer", 70000.0, new Date());
        employeeData.createEmployee(newEmployee);
        System.out.println("New employee added: " + newEmployee);

    }
}
