package com.dxc.servlet.employee.repository;

import java.util.List;

import com.dxc.servlet.employee.entity.EmployeeManagement;

public interface IEmployeeManagementRepository {

    public int insertEmployeeDetails(EmployeeManagement employee);

    public List<EmployeeManagement> getAllEmployeeDetails();
    
    public void beginTransaction();

    public void commitTransaction();
    
}
