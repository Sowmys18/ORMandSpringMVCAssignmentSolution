<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>CUSTOMER RELATIONSHIP MANAGEMENT</title>
</head>
<body>
<form action = "addCustomerD">
 ENTER ID <input type="number" name = "id"> <br>
 ENTER FIRST NAME <input type="text" name = "FirstName"> <br>
 ENTER LAST NAME <input type="text" name = "LastName"> <br>
 ENTER EMAIL ID <input type="text" name = "Emailid"> <br>
<input type = "submit"><br>
 
 <h2>DISPLAY CUSTOMER INFORMATION</h2>

<form action = "getCustomerD">
 ENTER ID <input type= "number" name = "id"> <br>
<input type = "submit"><br>

</form>
</body>
</html>