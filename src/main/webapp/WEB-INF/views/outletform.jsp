<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page session="false" %>
<html>
<head>
</head>
<body>

<div class="container-fluid">
    <form:form method="POST" action="/posApps_war/editSave" modelAttribute="outlet">
        <div class="card-body">
            <div class="form-group">
                <form:input type="hidden" class="form-control" id="id" path="id"/>
            </div>
            <div class="form-group">
                <label>Outlet Name</label>
                <form:input type="text" class="form-control" id="name" path="name"/>
            </div>
            <div class="form-group">
                <label>Outlet Address</label>
                <form:input type="text" class="form-control" id="address" path="address"/>
            </div>
            <div class="form-group">
                <label>Province</label>
                <form:select path="province.id" class="form-control select2" id="province" style="width: 100%;"  >
                    <form:option value="0" label="-SELECT PROVINCE-"/>
                    <form:options items="${province}"/>
                </form:select>
            </div>
            <div class="form-group">
                <label>Region</label>
                <form:select path="region.id" class="form-control select2" id="region" style="width: 100%;"  >
                    <form:option value="0" label="-SELECT REGION-"/>
                    <form:options items="${region}"/>
                </form:select>
            </div>
            <div class="form-group">
                <label>District</label>
                <form:select path="district.id" class="form-control select2" id="district" style="width: 100%;"  >
                    <form:option value="0" label="-SELECT DISTRICT-"/>
                    <form:options items="${district}"/>
                </form:select>
            </div>
            <div class="form-group">
                <label>Outlet Phone</label>
                <form:input type="text" class="form-control" id="phone" path="phone"/>
            </div>
            <div class="form-group">
                <label>Outlet Email</label>
                <form:input type="text" class="form-control" id="email" path="email"/>
            </div>
            <div class="form-group">
                <label>Outlet Postal Code</label>
                <form:input type="text" class="form-control" id="postalCode" path="postalCode"/>
            </div>
        </div>
        <div class="card-footer justify-content-between">
            <button type="reset" class="btn btn-outline-light align-content-sm-start" value="cancel">Cancel</button>
            <button type="submit" class="btn btn-outline-light align-content-sm-end" value="save">Save</button>
        </div>
        <!-- /.card-body -->
    </form:form>
</div>
</body>
</html>


