package com.cas.org.casstest.service;

import com.cas.org.casstest.dao.EmployeeDao;
import com.cas.org.casstest.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class EmployeeService {

    @Autowired
    private EmployeeDao employeeDao;

    public Employee getEmployeeByPK(String empId, String empName){
        return employeeDao.findByEmployeeKeyEmpIdAndEmployeeKeyEmpName(empId, empName);
    }

    public List<Employee>getEmployeeByPartitionKey(String empId){
        return employeeDao.findByEmployeeKeyEmpId(empId);
    }

}
