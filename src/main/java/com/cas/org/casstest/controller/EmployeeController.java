package com.cas.org.casstest.controller;

import com.cas.org.casstest.model.Employee;
import com.cas.org.casstest.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/emp")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/partitionKey")
    public List<Employee>  getDefaultEmployee(){
        return employeeService.getEmployeeByPartitionKey("1");
    }

    @GetMapping("/primaryKey")
    public Employee getDefaultEmployees(){
        return employeeService.getEmployeeByPK("1","sam");
    }

}