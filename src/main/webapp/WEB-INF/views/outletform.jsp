<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page session="false" %>
<html>
<head>
</head>
<body>

<div class="container-fluid">
    <form:form method="POST" action="/posApps_war/save" modelAttribute="outlet">
        <div class="card-body">
            <div class="form-group">
                <label>Outlet Name</label>
                <form:input type="text" class="form-control" path="name"/>
            </div>
            <div class="form-group">
                <label>Outlet Address</label>
                <form:input type="text" class="form-control" path="address"/>
            </div>
            <div class="form-group">
                <label>Province</label>
                <form:select path="province.id" class="form-control select2" style="width: 100%;"  >
                    <form:option value="0" label="-SELECT PROVINCE-"/>
                    <form:options items="${province}"/>
                </form:select>
            </div>
            <div class="form-group">
                <label>Region</label>
                <form:select path="region.id" class="form-control select2" style="width: 100%;"  >
                    <form:option value="0" label="-SELECT REGION-"/>
                    <form:options items="${region}"/>
                </form:select>
            </div>
            <div class="form-group">
                <label>District</label>
                <form:select path="district.id" class="form-control select2" style="width: 100%;"  >
                    <form:option value="0" label="-SELECT DISTRICT-"/>
                    <form:options items="${district}"/>
                </form:select>
            </div>
            <div class="form-group">
                <label>Outlet Phone</label>
                <form:input type="text" class="form-control" path="phone"/>
            </div>
            <div class="form-group">
                <label>Outlet Email</label>
                <form:input type="text" class="form-control" path="email"/>
            </div>
            <div class="form-group">
                <label>Outlet Postal Code</label>
                <form:input type="text" class="form-control" path="postalCode"/>
            </div>
        </div>
        <div class="card-footer justify-content-between">
            <button type="button" class="btn btn-outline-light align-content-sm-start" data-dismiss="modal" value="cancel">Cancel</button>
            <button type="submit" class="btn btn-outline-light align-content-sm-end" value="save">Save</button>
        </div>
        <!-- /.card-body -->
    </form:form>
</div>
</body>
</html>



