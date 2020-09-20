package com.dxc.servlet.employee.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class EmployeeServlet extends HttpServlet {
	
        private static final long serialVersionUID = 1L;
        
        private EmployeeCrudOperation employeeCrudOperation;
        
        public EmployeeServlet() {
            super();
            
            employeeCrudOperation = new EmployeeCrudOperation();     
        }
        
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		  
	    int choice = Integer.parseInt(request.getParameter("choice"));
	    
	    switch (choice) {
	    
	    case 1:
		
		employeeCrudOperation.insertEmployeeDetails(request, response);
		
		break;
		
	    case 2:
		
		employeeCrudOperation.getAllEmployeeDetails(request, response);
		
		break;

	    default:
		
		employeeCrudOperation.getAllEmployeeDetails(request, response);
		
		break;
	    }
	    
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {	
		
	    doGet(request, response);
	}

}
