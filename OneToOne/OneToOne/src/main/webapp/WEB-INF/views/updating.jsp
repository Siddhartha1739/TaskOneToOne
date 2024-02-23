<%@page language="java" %>
<html>
<%--<head> <a href="style.css"/> </head>--%>
<h1>RegisterEmployee</h1>
<form action="/updated" >

    <%--@declare id="empid"--%><%--@declare id="firstname"--%><%--@declare id="lastname"--%><%--@declare id="role"--%><%--@declare id="salary"--%><%--@declare id="pincode"--%><%--@declare id="addressid"--%><%--@declare id="city"--%><%--@declare id="gender"--%><%--@declare id="phonenumber"--%><label for="empId">Enter Id : </label>
    <label for="empId">Enter Id: </label>
    <input type="number"  name="empId" value="${empId}"><br>
    <label for="firstName">Enter Employee First Name : </label>
    <input type="text"  name="firstName" value="${firstName}"><br>
    <label for="lastName">Enter Employee Last Name : </label>
    <input type="text"  name="lastName" value="${lastName}"><br>
    <label for="role">Enter EmployeeRole: </label>
    <input type="text"  name="role" value="${role}"><br>
    <label for="salary">Enter EmployeeSalary: </label>
    <input type="text"  name="sal" value="${salary}"><br>
        <label for="AddressId">Enter Employee Address Id: </label>
        <input type="text"  name="AddressId" value="${AddressId}"><br>
        <label for="PinCode">Enter Address PinCode: </label>
        <input type="text"  name="PinCode" value="${PinCode}"><br>
        <label for="City">Enter City Name: </label>
        <input type="text"  name="City" value="${City}"><br>
        <label for="Gender">Enter Employee Gender: </label>
        <input type="text"  name="Gender" value="${Gender}"><br>
        <label for="phoneNumber">Enter EmployeephoneNumber: </label>
        <input type="text"  name="phoneNumber" value="${phoneNumber}"><br>
    <input type="submit" value="Submit">
</form>
</html>