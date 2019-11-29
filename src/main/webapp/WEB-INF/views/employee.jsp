<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>AdminLTE 3 | DataTables</title>
    <!-- Tell the browser to be responsive to screen width -->
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- Font Awesome -->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/plugins/fontawesome-free/css/all.min.css">
    <!-- Ionicons -->
    <link rel="stylesheet" href="https://code.ionicframework.com/ionicons/2.0.1/css/ionicons.min.css">
    <!-- DataTables -->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/plugins/datatables-bs4/css/dataTables.bootstrap4.css">
    <!-- Theme style -->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/dist/css/adminlte.min.css">
    <!-- Google Font: Source Sans Pro -->
    <link href="https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,400i,700" rel="stylesheet">
</head>
<body class="hold-transition sidebar-mini">
<div class="wrapper">

    <!-- Navbar -->
    <nav class="main-header navbar navbar-expand navbar-white navbar-light">
        <!-- Left navbar links -->
        <ul class="navbar-nav">
            <li class="nav-item">
                <a class="nav-link" data-widget="pushmenu" href="#"><i class="fas fa-bars"></i></a>
            </li>
            <li class="nav-item d-none d-sm-inline-block">
                <a href="index3.html" class="nav-link">Home</a>
            </li>
            <li class="nav-item d-none d-sm-inline-block">
                <a href="#" class="nav-link">Contact</a>
            </li>
        </ul>

        <!-- SEARCH FORM -->
        <form class="form-inline ml-3">
            <div class="input-group input-group-sm">
                <input class="form-control form-control-navbar" type="search" placeholder="Search" aria-label="Search">
                <div class="input-group-append">
                    <button class="btn btn-navbar" type="submit">
                        <i class="fas fa-search"></i>
                    </button>
                </div>
            </div>
        </form>

        <!-- Right navbar links -->
        <ul class="navbar-nav ml-auto">
            <!-- Messages Dropdown Menu -->
            <!-- Notifications Dropdown Menu -->
            <li class="nav-item d-none d-sm-inline-block">
                <a href="index3.html" class="nav-link">Logout</a>
            </li>
        </ul>
    </nav>
    <!-- /.navbar -->

    <!-- Main Sidebar Container -->
    <aside class="main-sidebar sidebar-dark-primary elevation-4">
        <!-- Brand Logo -->
        <a href="index3.html" class="brand-link">
            <img src="${pageContext.request.contextPath}/resources/dist/img/AdminLTELogo.png" alt="AdminLTE Logo" class="brand-image img-circle elevation-3"
                 style="opacity: .8">
            <span class="brand-text font-weight-light">Admin SYBOX</span>
        </a>

        <!-- Sidebar -->
        <div class="sidebar">
            <!-- Sidebar user panel (optional) -->
            <div class="user-panel mt-3 pb-3 mb-3 d-flex">
                <div class="image">
                </div>
                <div class="info">
                    <a href="#" class="d-block">Nama Admin SYBOX</a>
                </div>
            </div>

            <!-- Sidebar Menu -->
            <!-- Sidebar Menu -->
            <!-- Sidebar Menu -->
            <nav class="mt-2">
                <ul class="nav nav-pills nav-sidebar flex-column" data-widget="treeview" role="menu" data-accordion="false">
                    <!-- Add icons to the links using the .nav-icon class
                         with font-awesome or any other icon font library -->
                    <li class="nav-item">
                        <a href="/" class="nav-link">
                            <i class="nav-icon fas fa-tachometer-alt"></i>
                            <p>
                                Dashboard
                                <i class="right fas fa-angle-left"></i>
                            </p>
                        </a>
                    </li>

                    <li class="nav-item">
                        <a href="/users" class="nav-link">
                            <i class="nav-icon fas fa-user"></i>
                            <p>
                                User
                                <i class="right fas fa-angle-left"></i>
                            </p>
                        </a>
                    </li>
                    <li class="nav-item">
                        <a href="/employees" class="nav-link active">
                            <i class="nav-icon fas fa-suitcase"></i>
                            <p>
                                Employee
                                <i class="right fas fa-angle-left"></i>
                            </p>
                        </a>
                    </li>
                    <li class="nav-item">
                        <a href="/lockers" class="nav-link">
                            <i class="nav-icon fas fa-lock-open"></i>
                            <p>
                                Locker
                                <i class="right fas fa-angle-left"></i>
                            </p>
                        </a>
                    </li>
                </ul>
            </nav>

            <!-- /.sidebar-menu -->
        </div>
        <!-- /.sidebar -->
    </aside>

    <!-- Content Wrapper. Contains page content -->
    <div class="content-wrapper">
        <!-- Content Header (Page header) -->
        <section class="content-header">
            <div class="container-fluid">
                <div class="row mb-2">
                    <div class="col-sm-6">
                        <h1>DataTables</h1>
                    </div>
                    <div class="col-sm-6">
                        <ol class="breadcrumb float-sm-right">
                            <li class="breadcrumb-item"><a href="#">Home</a></li>
                            <li class="breadcrumb-item active">DataTables</li>
                        </ol>
                    </div>
                </div>
            </div><!-- /.container-fluid -->
        </section>



        <!-- Main content -->
        <section class="content">

            <div class="card card-default">
                <div class="card-header">
                    <h3 class="card-title">Add Employee</h3>

                    <div class="card-tools">
                        <button type="button" class="btn btn-tool" data-card-widget="collapse"><i class="fas fa-minus"></i></button>
                        <button type="button" class="btn btn-tool" data-card-widget="remove"><i class="fas fa-remove"></i></button>
                    </div>
                </div>
                <!-- /.card-header -->
                <div class="card-body">

                <form:form method="POST" action="/employees" modelAttribute="userOutlets">
                    <div class="row">

                        <div class="col-md-3">
                            <div class="form-group">
<%--                                <form:input path="employee.firstName" cssClass="form-control" type="text" placeholder="First Name"/>--%>
                                <input class="form-control" style="width: 100%;" placeholder="First Name" id="firstName" name="firstName"/>
                                </input>
                            </div>
                            <!-- /.form-group -->
                        </div>
                        <!-- /.col -->
                        <div class="col-md-3">
                            <div class="form-group">
                                <input class="form-control" style="width: 100%;" placeholder="Last Name" id="lastName" name="lastName"/>
                                </input>
                            </div>
                        </div>
                        <!-- /.col -->
                        <div class="col-md-3">
                            <div class="form-group">
                                <input class="form-control" style="width: 100%;" placeholder="Email" id="email" name="email" type="email"/>
                                </input>
                            </div>
                        </div>
                        <!-- /.col -->

                        <div class="col-md-3">
                            <div class="form-group">
                                <select class="custom-select" id="title" name="title">
                                    <option value="Mr.">Mr.</option>
                                    <option value="Mrs.">Mrs.</option>
                                    <option value="Miss">Miss</option>
                                </select>
                            </div>
                        </div>
                        <!-- /.col -->


                    </div>
                    <!-- /.row -->

                    <div class="row">

                        <div class="col-md-3 mb-3">
<%--                            <select name="outlet" id="outlet" class="custom-select">--%>
<%--                                <c:forEach items="${outlets}" var="outlet">--%>
<%--                                    <option value="${outlet.id}">${outlet.name}</option>--%>
<%--                                </c:forEach>--%>
<%--                            </select>--%>

                            <form:select path="assEmployeeOutlet.outlet_id" id="outlet_id" cssClass="custom-select">
                                <form:option value="0" label="Choose Outlet..."/>
                                <form:options items="${outlets}"/>
                            </form:select>

                        </div>

                        <!-- /.col -->
<%--                        <div class="col-12 col-sm-3">--%>
<%--                            <div class="form-group">--%>
<%--                                <button type="button" class="btn btn-block btn-info" onclick="window.location.href = '/createUser';">Assign Outlet</button>--%>
<%--                            </div>--%>
<%--                        </div>--%>

                        <!-- checkbox -->
                        <div class="col-12 col-sm-3">
                            <div class="form-group">
                                <div class="custom-control custom-checkbox">
                                    <input name="checkbox" id="showSecondary" class="custom-control-input" type="checkbox" onclick="showSubMenu()">
                                    <label for="showSecondary" class="custom-control-label">Create Account?</label>
                                </div>
                            </div>
                        </div>
                        <!-- /.col -->
                    </div>

                    <hr>

                    <fieldset id="secondary" style="display:none;">
                        <div class="form-row">
                            <div class="col-md-3 mb-3">
<%--                                <select class="custom-select" id="role">--%>
                                    <form:select path="mstUser.role_id" id="role_id" cssClass="custom-select">
                                        <form:option value="0" label="Choose Roles..."/>
                                        <form:options items="${roles}"/>
                                    </form:select>
<%--                                </select>--%>
                            </div>
                            <div class="col-md-3 mb-3">
                                <input name="username" type="text" class="form-control" id="validationUsername" placeholder="Username" aria-describedby="inputGroupPrepend">
                            </div>
                            <div class="col-md-3 mb-3">
                                <input name="password" type="password" class="form-control" id="validationPassword" placeholder="Password" aria-describedby="inputGroupPrepend">
                                <div class="valid-feedback">
                                </div>
                            </div>
                        </div>
                    </fieldset>

                    <div class="row">
                        <div class="col-12 col-sm-3">
                            <div class="form-group">
                                <button type="button" class="btn btn-block btn-info" onclick="window.location.href = '/createUser';">Cancel</button>
                            </div>
                        </div>
                        <div class="col-12 col-sm-3">
                            <div class="form-group">
                                <input type="submit" name="submit" value="Save" class="btn btn-block btn-info">
<%--                                <button type="button" class="btn btn-block btn-info" onclick="window.location.href = '/employees';">Save</button>--%>
                            </div>
                        </div>
                    </div>
                    <!-- /.row -->

                </form:form>

                </div>
                <!-- /.card-body -->
            </div>
            <!-- /.card -->

            <div class="row">
                <div class="col-12">
                    <!-- /.card -->
                    <div class="card">
                        <div class="card-header">
                            <h3 class="card-title">DataTable Employee</h3>
                        </div>
                        <!-- /.card-header -->
                        <div class="card-body">
                            <table id="example1" class="table table-bordered table-striped">
                                <thead>
                                <tr>
                                    <th>Name</th>
                                    <th>Email</th>
                                    <th>Have Account?</th>
                                    <th>Outlet Access</th>
                                    <th>Role</th>
                                    <th>Edit</th>
                                    <th>Delete</th>
                                </tr>
                                </thead>
                                <tbody>
                                <c:forEach items="${users}" var="user">
                                <tr>
                                    <td>${user.employee.firstName} ${user.employee.lastName}</td>
                                    <td>${user.employee.email}</td>
                                    <td>${user.employee.haveAccount}</td>
                                    <td>${user.employee.employeeOutlet.outlet.name}</td>
                                    <td>${user.role.name}</td>
                                    <td><button type="button" class="btn btn-block btn-info" onclick="window.location.href = '/createUser';">Edit</button></td>
                                    <td><button type="button" class="btn btn-block btn-danger" onclick="window.location.href = '/createUser';">Delete</button></td>
                                </tr>
                                </c:forEach>

                                </tfoot>
                            </table>
                        </div>
                    </div>
                    <!-- /.card -->
                </div>
                <%--
        --%>
            </div>



<%--            <h1>Register User</h1>--%>
<%--            <form:form method="POST" action="/employees" modelAttribute="userCommand">--%>
<%--&lt;%&ndash;            <form action="/employees" method="POST">&ndash;%&gt;--%>
<%--                <table>--%>
<%--                    <tr>--%>
<%--                        <td>firstname :</td>--%>
<%--                        <td><input type="text" name="firstName"></td>--%>
<%--                    </tr>--%>
<%--                    <tr>--%>
<%--                        <td>lastname :</td>--%>
<%--                        <td><input type="text" name="lastName" value=""></td>--%>
<%--                    </tr>--%>
<%--                    <tr>--%>
<%--                        <td>email :</td>--%>
<%--                        <td><input type="email" name="email"></td>--%>
<%--                    </tr>--%>
<%--                    <tr>--%>
<%--                        <td>title :</td>--%>
<%--                        <td><input type="text" name="title"></td>--%>
<%--                    </tr>--%>
<%--                    <tr>--%>
<%--                        <td>username :</td>--%>
<%--                        <td><input type="text" name="username"></td>--%>
<%--                    </tr>--%>
<%--                    <tr>--%>
<%--                        <td>password :</td>--%>
<%--                        <td><input type="text" name="password"></td>--%>
<%--                    </tr>--%>
<%--                    <tr>--%>

<%--&lt;%&ndash;                        <td><select name="role" id="roles">&ndash;%&gt;--%>
<%--&lt;%&ndash;                            <c:forEach items="${roles}" var="role">&ndash;%&gt;--%>
<%--&lt;%&ndash;                                <option value="${role.id}">${role.name}</option>&ndash;%&gt;--%>
<%--&lt;%&ndash;                            </c:forEach>&ndash;%&gt;--%>
<%--&lt;%&ndash;                        </select>&ndash;%&gt;--%>
<%--&lt;%&ndash;                        </td>&ndash;%&gt;--%>


<%--                        <td>--%>
<%--                        <form:select path="role_id" id="role_id">--%>
<%--                            <form:option value="0" label="-select-"/>--%>
<%--                            <form:options items="${roles}"/>--%>
<%--                        </form:select>--%>
<%--                        </td>--%>
<%--                    </tr>--%>
<%--                    <tr>--%>
<%--                        <td><input type="submit" name="submit" value="submit"></td>--%>
<%--                    </tr>--%>
<%--                </table>--%>
<%--&lt;%&ndash;            </form>&ndash;%&gt;--%>
<%--            </form:form>--%>



            <!-- /.row -->
        </section>
        <!-- /.content -->
    </div>
    <!-- /.content-wrapper -->
    <footer class="main-footer">
        <div class="float-right d-none d-sm-block">
            <b>Version</b> 3.0.0-rc.5
        </div>
        <strong>Copyright &copy; 2014-2019 <a href="http://adminlte.io">AdminLTE.io</a>.</strong> All rights
        reserved.
    </footer>

    <!-- Control Sidebar -->
    <aside class="control-sidebar control-sidebar-dark">
        <!-- Control sidebar content goes here -->
    </aside>
    <!-- /.control-sidebar -->
</div>
<!-- ./wrapper -->

<!-- jQuery -->
<script src="${pageContext.request.contextPath}/resources/plugins/jquery/jquery.min.js"></script>
<!-- Bootstrap 4 -->
<script src="${pageContext.request.contextPath}/resources/plugins/bootstrap/js/bootstrap.bundle.min.js"></script>
<!-- DataTables -->
<script src="${pageContext.request.contextPath}/resources/plugins/datatables/jquery.dataTables.js"></script>
<script src="${pageContext.request.contextPath}/resources/plugins/datatables-bs4/js/dataTables.bootstrap4.js"></script>
<!-- AdminLTE App -->
<script src="${pageContext.request.contextPath}/resources/dist/js/adminlte.min.js"></script>
<!-- AdminLTE for demo purposes -->
<script src="${pageContext.request.contextPath}/resources/dist/js/demo.js"></script>
<!-- page script -->`
<script>
    $(function () {
        $("#example1").DataTable();
        $('#example2').DataTable({
            "paging": true,
            "lengthChange": false,
            "searching": false,
            "ordering": true,
            "info": true,
            "autoWidth": false,
        });
    });
</script>

<script>
    function showSubMenu(){
        if(document.getElementById('showSecondary').checked){
            document.getElementById('secondary').style.display='block';
        } else {
            document.getElementById('secondary').style.display='none';
        }
    }
</script>

</body>
</html>
