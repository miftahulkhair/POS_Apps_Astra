<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page session="false" %>
<html>
<head>
</head>
<body>

<div class="container-fluid">
    <form:form method="POST" action="/editSave" modelAttribute="outlet">
        <div class="card-body">

            <div class="form-group">
                <form:input type="hidden" class="form-control" id="id" name="id" path="id"/>
            </div>
            <div class="form-group">
                <label>Outlet Name</label>
                <form:input type="text" class="form-control" id="name" name="name" path="name"/>
            </div>
            <div class="form-group">
                <label>Outlet Address</label>
                <form:input type="text" class="form-control" id="address" name="address" path="address"/>
            </div>
            <div class="form-group">
                <label>Province</label>
                <form:select id="province" name="province" path="province.id" class="form-control select2" style="width: 100%;"  >
                    <form:option value="${province}"/>
                    <form:options items="${province}"/>
                </form:select>
            </div>
            <div class="form-group">
                <label>Region</label>
                <form:select id="region" name="region" path="region.id" class="form-control select2" style="width: 100%;"  >
                    <form:option value="${region}"/>
                    <form:options items="${region}"/>
                </form:select>
            </div>
            <div class="form-group">
                <label>District</label>
                <form:select id="district" name="district" path="district.id" class="form-control select2" style="width: 100%;"  >
                    <form:option value="${district}"/>
                    <form:options items="${district}"/>
                </form:select>
            </div>
            <div class="form-group">
                <label>Outlet Phone</label>
                <form:input type="text" class="form-control" id="phone" name="phone" path="phone"/>
            </div>
            <div class="form-group">
                <label>Outlet Email</label>
                <form:input type="text" class="form-control" id="email" name="email" path="email"/>
            </div>
            <div class="form-group">
                <label>Outlet Postal Code</label>
                <form:input type="text" class="form-control" id="postalCode" name="postalCode" path="postalCode"/>
            </div>
        </div>
        <div class="card-footer justify-content-between">
            <button type="button" class="btn btn-outline-light align-content-sm-start" data-dismiss="modal" value="cancel">Cancel</button>
            <button type="submit" class="btn btn-outline-light align-content-sm-end" value="editSave">Save</button>
        </div>
        <!-- /.card-body -->
    </form:form>
</div>
</body>
</html>



