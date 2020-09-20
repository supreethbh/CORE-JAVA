package com.dxc.servlet.employee.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "Employee_Management")
@NamedQueries(
	@NamedQuery(name = "getAllEmployees", query = " SELECT employees "
						    + " FROM Employee_Management employees "))
public class EmployeeManagement implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "Employee_Id")
    private int employeeId;
    
    @Column(name = "Employee_Name")
    private String employeeName;
    
    @Column(name = "Emil_Id")
    private String emailId;
    
    @Column(name = "Password")
    private String password;
    
    @Column(name = "Country")
    private String country;
 
    public EmployeeManagement() {
	super();
    }

    public EmployeeManagement(int employeeId, String employeeName, String emailId, String password, String country) {
	super();
	this.employeeId = employeeId;
	this.employeeName = employeeName;
	this.emailId = emailId;
	this.password = password;
	this.country = country;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
	return "EmployeeManagement [Employee_Id = " + employeeId + ", Employee_Name = " + employeeName 
		+ ", Email_Id = " + emailId + ", Password = " + password + ", Country = " + country + "]";
    }
    
}
