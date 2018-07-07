<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%--
  Created by IntelliJ IDEA.
  User: Avenash_2
  Date: 6/25/2018
  Time: 10:17 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>


<html>
<head>
    <title>Display</title>
</head>
<body>

<form action="/LogoutController" method="get">
    <h1 style="background-color: greenyellow; display: inline;">Hello: ${userObj.name}</h1>

    <p>Starbuck's MEDIUM Roast Coffees:</p>

    <table>
        <c:forEach var="item" items="${list}" varStatus="loop">
            <c:if test="${loop.index%2==0}">
                <tr style="background-color:cyan">
                    <td> ${item} </td></tr>
            </c:if>
            <c:if test="${loop.index%2==1}">
                <tr style="background-color:yellow">
                    <td> ${item} </td></tr>
            </c:if>
        </c:forEach>
    </table>
    <input type="submit" value="Logout">
</form>
</body>
</html>
