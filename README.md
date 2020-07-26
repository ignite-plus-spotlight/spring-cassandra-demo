# spring-cassandra-demo
Cassandra Demo


### Schema Present in : 
```resources/cassandra/employee.cql```

### Request / Response : 

- Primary Key 
    Request : `http://localhost:8080/emp/primaryKey`
    Response : `{"employeeKey":{"empId":"1","empName":"sam"},"empEmail":"sam@sam.com"}`
    
- Partition Key 
    Request : `http://localhost:8080/emp/partitionKey`
    Response : `[{"employeeKey":{"empId":"1","empName":"sam"},"empEmail":"sam@sam.com"}]`
       
