<%--
  Created by IntelliJ IDEA.
  User: MuhammadM
  Date: 23/11/2019
  Time: 15:33
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <table>
        <thead>
        <tr>
            <th>
                Username
            </th>
            <th>
                Employee Name
            </th>
            <th>
                Role
            </th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${users}" var="user">

            <tr>
                <td>
                        ${user.username}
                </td>
                <td>
                        ${user.employee.firstName} ${user.employee.lastName}
                </td>
                <td>
                        ${user.role.name}
                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</head>
<body>

</body>
</html>