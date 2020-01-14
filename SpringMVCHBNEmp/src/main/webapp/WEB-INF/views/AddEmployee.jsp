<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action = "addemp" method = "post">
	Employee code<input type = "text" name = "empno">
	Employee name<input type = "text" name = "ename">
	Employee job<input type = "text" name = "job">
	MGR<input type = "text" name = "mgr">
	Employee HireDate<input type = "text" name = "hiredate">
	Employee Salary<input type = "text" name = "salary">
	Employee Comm<input type = "text" name = "comm">
	
	<input type = "submit">
	
	</form>

</body>
</html>