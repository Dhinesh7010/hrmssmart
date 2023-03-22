package com.meganar.smarthrms.InternalMobility.service;

import com.meganar.smarthrms.InternalMobility.model.Employee;

import java.util.List;

public interface EmployeeService {
    public List<Employee>findAll();
    public Employee findById(int theId);
    public void save(Employee theEmployee);
    public  void deleteById(int theId);
}
