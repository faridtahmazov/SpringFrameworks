package com.company.repository;

import com.company.model.Employee;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class EmployeeRepository {
    List<Employee> employees = new ArrayList<>();

    public void save(Employee employee){
        this.employees.add(employee);
        System.out.println("Employee added Database!");
    }

    public void delete(Employee employee){
        this.employees.remove(employee);
        System.out.println("Employee removed Database!");
    }

    public Employee find(int index){
        Employee employee = this.employees.get(index);
        System.out.println("We fined employee: " + employee);

        return employee;
    }
}
