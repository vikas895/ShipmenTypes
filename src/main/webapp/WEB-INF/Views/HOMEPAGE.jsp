<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3>WELCOME TO Vikas PAGE</h3>
USERTYPE YTPE:
<input type ="radio"name="utype" value="vendor">vendor
<input type ="radio"name="utype" value="customer">customer:
USER CODE
<input type="text" name="ucode">
USER FOR:
<input type="text" name="ufor" value="purchase/sale" disable>
USER EMAIl:
<input type="email" name="uemail">
USER CONTACT:
<input type="text" name="ucontact">
USER ID TYPE:
<select name = "uidtype">
<option>--select--</option>
<option>PAN CARD</option>
<option>AADHAR</option>
<option>VOTER ID</option>
<option>OTHERS</option>
</select>
ID Number:
<input type = "NUMBER" name = "uidtype">
<input type = "submit" value = "createWhuser">
</body>
</html>