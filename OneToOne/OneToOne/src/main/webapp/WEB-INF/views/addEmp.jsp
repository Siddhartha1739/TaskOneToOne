<%@page language="java" %>
<html>
<%--<head> <a href="style.css"/> </head>--%>
<h1>RegisterEmployee</h1>
<form action="/addedEmployee"  >

    <%--@declare id="empid"--%><%--@declare id="firstname"--%><%--@declare id="lastname"--%><%--@declare id="role"--%><%--@declare id="salary"--%><%--@declare id="addressid"--%><%--@declare id="pincode"--%><%--@declare id="city"--%><%--@declare id="id"--%><%--@declare id="gender"--%><%--@declare id="phonenumber"--%><label for="empId">Enter Id : </label>
    <label for="empId">Enter Id: </label>
    <input type="number"  name="empId"><br>
    <label for="firstName">Enter Employee First Name : </label>
    <input type="text"  name="firstName"><br>
    <label for="lastName">Enter Employee Last Name : </label>
    <input type="text"  name="lastName"><br>
    <label for="role">Enter EmployeeRole: </label>
    <input type="text"  name="role"><br>
    <label for="salary">Enter Employee Salary : </label>
    <input type="number"  name="salary"><br>
        <label for="AddressId">Enter Address Id : </label>
        <input type="number"  name="AddressId"><br>
        <label for="PinCode">Enter Pincode: </label>
        <input type="number"  name="PinCode"><br>
        <label for="City">Enter City Name : </label>
        <input type="text"  name="City"><br>
        <label for="id">Enter employee Profile Id: </label>
        <input type="number"  name="id"><br>
        <label for="Gender">Enter Employee Gender : </label>
        <input type="text"  name="Gender"><br>
        <label for="phoneNumber">Enter Phone Number: </label>
        <input type="number"  name="phoneNumber"><br>
    <input type="submit" value="Submit">

</form>

</html>