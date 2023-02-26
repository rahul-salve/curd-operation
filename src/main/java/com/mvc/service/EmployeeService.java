package com.mvc.service;

import java.util.List;

import com.mvc.model.Employee;

public interface EmployeeService {
  List<Employee> getAllEmployee();
  void saveEmployee(Employee employee);
Employee getEmployeeById(int id);
}
