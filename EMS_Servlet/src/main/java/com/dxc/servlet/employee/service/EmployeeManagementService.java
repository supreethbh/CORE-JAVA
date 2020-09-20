package com.dxc.servlet.employee.service;

import java.util.List;

import com.dxc.servlet.employee.entity.EmployeeManagement;
import com.dxc.servlet.employee.repository.EmployeeManagementRepository;
import com.dxc.servlet.employee.repository.IEmployeeManagementRepository;

public class EmployeeManagementService implements IEmployeeManagementService {

    IEmployeeManagementRepository repository;
    
    public EmployeeManagementService() {
	super();
	repository = new EmployeeManagementRepository();
    }
    
    @Override
    public int insertEmployeeDetails(EmployeeManagement employee) {
	
	int recordsInserted = 0; 
	repository.beginTransaction();
	recordsInserted = repository.insertEmployeeDetails(employee);
	repository.commitTransaction();
	return recordsInserted;
	
    }

    @Override
    public List<EmployeeManagement> getAllEmployeeDetails() {
	
	List<EmployeeManagement> employee;
	repository.beginTransaction();
	employee =  repository.getAllEmployeeDetails();
	repository.commitTransaction();
	return employee;
    }
   
}
