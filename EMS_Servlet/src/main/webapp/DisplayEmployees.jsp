<%@ page  import="java.util.*, com.dxc.servlet.employee.entity.EmployeeManagement" import="org.apache.jasper.tagplugins.jstl.core.ForEach" language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Display Employees</title>
</head>

<body>
	 <%
	 	List<EmployeeManagement>  employeeList = (List<EmployeeManagement>) session.getAttribute("employeeList");
		
		for(EmployeeManagement employee : employeeList)	{
			
		    out.print(employee);
		    out.print("\n");
		}
	  %>

</body>

</html>