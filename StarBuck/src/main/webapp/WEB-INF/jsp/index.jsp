<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<%--
  Created by IntelliJ IDEA.
  User: Avenash_2
  Date: 6/25/2018
  Time: 9:46 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Login</title>
  </head>
  <body>
  Login:
  <form:form modelAttribute="user" action = "authenticationController" method = "post" >
    Name: <form:input type = "text" path= "name" size = "9" /><br/>
    Password: <form:input type = "password" path = "password" size = "9" /><br/>
    <br/>
    <input type="submit" value = "Log In"/>
  </form:form>
  </body>
</html>
