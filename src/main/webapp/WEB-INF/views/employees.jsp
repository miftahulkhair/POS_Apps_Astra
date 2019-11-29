<%--
  Created by IntelliJ IDEA.
  User: MuhammadM
  Date: 23/11/2019
  Time: 15:33
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>

    <h1>Register User</h1>
    <form:form method="POST" action="/employees" modelAttribute="userCommand">
        <table>
            <tr>
                <td>firstname :</td>
<%--                <td><form:input path="fistName"/></td>--%>
                <td><input type="text" name="firstName"></td>
            </tr>
            <tr>
                <td>lastname :</td>
                <td><input type="text" name="lastName" value=""></td>
            </tr>
            <tr>
                <td>email :</td>
                <td><input type="email" name="email"></td>
            </tr>
            <tr>
                <td>title :</td>
                <td><input type="text" name="title"></td>
            </tr>
            <tr>
                <td>username :</td>
                <td><input type="text" name="username"></td>
            </tr>
            <tr>
                <td>password :</td>
                <td><input type="text" name="password"></td>
            </tr>
            <tr>

                <td>
                    <form:select path="role_id" id="role_id">
                        <form:option value="0" label="-select-"/>
                        <form:options items="${roles}"/>
                    </form:select>
                </td>


                <%--                        <td>--%>
                <%--                            <form:select path="role" class="form-control">--%>
                <%--                                <form:option value="0" label="-SELECT ROLE-"/>--%>
                <%--                                <form:options items="${roles}"/>--%>
                <%--                            </form:select>--%>
                <%--                        </td>--%>
            </tr>
            <tr>
                <td><input type="submit" name="submit" value="submit"></td>
            </tr>
        </table>
    </form:form>
</head>
<body>

</body>
</html>