package com.cas.org.casstest.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.cassandra.core.mapping.PrimaryKeyClass;
import org.springframework.data.cassandra.core.mapping.PrimaryKeyColumn;

import java.io.Serializable;

import static org.springframework.data.cassandra.core.cql.PrimaryKeyType.PARTITIONED;

@PrimaryKeyClass
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeKey implements Serializable {

    @PrimaryKeyColumn(name = "emp_id", type = PARTITIONED)
    private String empId;

    @PrimaryKeyColumn(name = "emp_name")
    private String empName;
}
