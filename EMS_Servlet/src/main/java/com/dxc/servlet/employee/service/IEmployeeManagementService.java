package com.dxc.servlet.employee.service;

import java.util.List;

import com.dxc.servlet.employee.entity.EmployeeManagement;

public interface IEmployeeManagementService {

    public int insertEmployeeDetails(EmployeeManagement employee);

    public List<EmployeeManagement> getAllEmployeeDetails();
 
}
