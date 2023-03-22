package com.meganar.smarthrms.InternalMobility.controller;

import com.meganar.smarthrms.InternalMobility.model.Employee;
import com.meganar.smarthrms.InternalMobility.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/api")
public class EmployeeRestController {
      private EmployeeService employeeService;
    @Autowired
    EmployeeRestController(EmployeeService theEmployeeService){
        employeeService=theEmployeeService;
    }

    @RequestMapping("/login")
    public String loginForm(Model model) {
        Employee theEmployee =new Employee();
        model.addAttribute("employee",theEmployee);
        return "index";

    }
    @GetMapping("/display")
    public String formDisplay(Model model){
        List<Employee>theView=new ArrayList<>();
        theView=employeeService.findAll();
        model.addAttribute("employeesView",theView);
        return "view";
    }

    @GetMapping("/employees")
    public List<Employee> findAll(){
        return employeeService.findAll();
    }

    //add mapping for findBy id
    @GetMapping("/employees/{employeeId}")
    public Employee getEmployee(@PathVariable int employeeId){
        Employee theEmployee=employeeService.findById(employeeId);
        System.out.println("id"+employeeId);
        if(theEmployee ==null){
            throw new RuntimeException("employee id is not found-"+employeeId);
        }
        return theEmployee;
    }

    //add mapping for save new employee

    @PostMapping("/employeesLogin")
    public String addEmployee(@ModelAttribute("employee") Employee theEmployee){
        theEmployee.setId(0);
        System.out.println("save method");
        employeeService.save(theEmployee);
        return "redirect:/api/login";
    }

    //add mapping for update
    @PutMapping("/employees")
    public Employee upateEmployee(@RequestBody Employee theEmployee){
        employeeService.save(theEmployee);
        return theEmployee;

    }
    @DeleteMapping("/employees/{employeeId}")
    public String deleteEmployee(@PathVariable int employeeId){
        Employee temEmployee=employeeService.findById(employeeId);
        if(temEmployee==null){
            throw new RuntimeException("Employee id is not found-"+employeeId);
        }
        employeeService.deleteById(employeeId);
            return "Delete employee id-"+employeeId;
    }

}
