package com.meganar.smarthrms.InternalMobility.dao;

import com.meganar.smarthrms.InternalMobility.model.Employee;

import java.util.List;

public interface EmployeeDao {
    public List<Employee>findAll();
    public Employee findById(int theId);
    public void save(Employee theEmployee);
    public void deleteById(int theId);

}
