package com.ems.dao;

import java.util.List;

import com.ems.bean.Employee;

public interface EmployeeDAO {
    public void addEmployee();
    public Employee viewEmployee(int eid);
    public List<Employee> viewAllEmployees();
    public void updateEmployee(int eid);
    public void deleteEmployee(int eid);
    public void back();
}
