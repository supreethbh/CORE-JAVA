package com.dxc.servlet.employee.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.dxc.servlet.employee.dbconnection.JPAConnection;
import com.dxc.servlet.employee.entity.EmployeeManagement;

public class EmployeeManagementRepository implements IEmployeeManagementRepository {
  
    private EntityManager entityManager;
    
    public EmployeeManagementRepository() {
	super();
	entityManager = JPAConnection.getEntityManager();
    }
    
    @Override
    public int insertEmployeeDetails(EmployeeManagement employee) {
	
	entityManager.persist(employee);
	return 1;
    }
    
    @SuppressWarnings("unchecked")
    @Override
    public List<EmployeeManagement> getAllEmployeeDetails() {
	
	Query query = entityManager.createNamedQuery("getAllEmployees");
	
	return (List<EmployeeManagement>) query.getResultList();
	
    }
    
    @Override
    public void beginTransaction() {
	
	entityManager.getTransaction().begin();
    }

    @Override
    public void commitTransaction() {
	
	entityManager.getTransaction().commit();
    }
    
}
