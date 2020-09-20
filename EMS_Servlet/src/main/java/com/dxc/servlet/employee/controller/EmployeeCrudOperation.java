package com.dxc.servlet.employee.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dxc.servlet.employee.entity.EmployeeManagement;
import com.dxc.servlet.employee.service.EmployeeManagementService;
import com.dxc.servlet.employee.service.IEmployeeManagementService;

public class EmployeeCrudOperation {

        private IEmployeeManagementService service;
    
        public EmployeeCrudOperation() {
        	super();
        	service = new EmployeeManagementService();
        }

        protected void insertEmployeeDetails(HttpServletRequest request, HttpServletResponse response) throws IOException {
        
            	PrintWriter out = response.getWriter();
            
            	int employeeId = Integer.parseInt(request.getParameter("employeeId"));
            	String employeeName = request.getParameter("employeeName");
            	String emailId = request.getParameter("emailId");
            	String password = request.getParameter("password");
            	String country = request.getParameter("country");
            
            	EmployeeManagement employee = new EmployeeManagement(employeeId, employeeName, emailId, password, country);
            
            	int recordInserted = service.insertEmployeeDetails(employee);
            	
            	out.print(recordInserted + " employee record inserted to Employee Management Database...");
            
        }

        protected void getAllEmployeeDetails(HttpServletRequest request, HttpServletResponse response)
    	    throws ServletException, IOException {
    
        	List<EmployeeManagement> employeeList = service.getAllEmployeeDetails();
        
        	HttpSession session = request.getSession();
        
        	session.setAttribute("employeeList", employeeList);
        
        	RequestDispatcher dispatcher = request.getRequestDispatcher("DisplayEmployees.jsp");
        
        	dispatcher.forward(request, response);
        
        }
}
