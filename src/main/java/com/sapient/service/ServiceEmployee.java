package com.sapient.service;

import com.sapient.model.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Service
public class ServiceEmployee {

    Map<Long, Employee> employeemap = new HashMap<>();

    public Employee addEmployeeDetails(Employee emp) {
        employeemap.put(emp.getId(), emp);
        return emp;
    }

    public Employee updateEmployeeDetails(Employee emp) {
        employeemap.put(emp.getId(), emp);
        return emp;
    }

    public Employee getEmployeeDetails(Long id) {
        return employeemap.get(id);
    }

    public List<Employee> getAllEmployeeDetails() {

        List<Employee> empList = new ArrayList<>();
        for(Map.Entry<Long, Employee> map : employeemap.entrySet()) {
            empList.add(map.getValue());
        }
        return empList;
    }

    public void deleteEmployee(Long id) {
        employeemap.remove(id);
    }
}
