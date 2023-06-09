package com.meganar.smarthrms.InternalMobility.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.meganar.smarthrms.InternalMobility.dao.EmployeeDao;
import com.meganar.smarthrms.InternalMobility.model.Employee;

import java.util.List;
@Service
public class EmployeeServiceImpl implements EmployeeService{

    private EmployeeDao employeeDao;
    @Autowired
    public EmployeeServiceImpl(EmployeeDao theEmployeeDao){
        employeeDao=theEmployeeDao;
    }
    @Override
    @Transactional
    public List<Employee> findAll() {
        return employeeDao.findAll();
    }

    @Override
    @Transactional
    public Employee findById(int theId) {
        return employeeDao.findById(theId);
    }

    @Override
    @Transactional
    public void save(Employee theEmployee) {
        employeeDao.save(theEmployee);

    }

    @Override
    @Transactional
    public void deleteById(int theId) {
        employeeDao.deleteById(theId);

    }
}
