package com.cas.org.casstest.dao;

import com.cas.org.casstest.model.Employee;
import com.cas.org.casstest.model.EmployeeKey;
import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeDao extends CassandraRepository<Employee, EmployeeKey> {
    Employee findByEmployeeKeyEmpIdAndEmployeeKeyEmpName(String empId, String empName);
    List<Employee> findByEmployeeKeyEmpId(String empId);
}
