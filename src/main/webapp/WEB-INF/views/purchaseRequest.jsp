<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
                <a href="../../index3.html" class="nav-link">Home</a>
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
            <li class="nav-item dropdown">
                <a class="nav-link" data-toggle="dropdown" href="#">
                    <i class="far fa-comments"></i>
                    <span class="badge badge-danger navbar-badge">3</span>
                </a>
                <div class="dropdown-menu dropdown-menu-lg dropdown-menu-right">
                    <a href="#" class="dropdown-item">
                        <!-- Message Start -->
                        <div class="media">
                            <img src="../../dist/img/user1-128x128.jpg" alt="User Avatar" class="img-size-50 mr-3 img-circle">
                            <div class="media-body">
                                <h3 class="dropdown-item-title">
                                    Brad Diesel
                                    <span class="float-right text-sm text-danger"><i class="fas fa-star"></i></span>
                                </h3>
                                <p class="text-sm">Call me whenever you can...</p>
                                <p class="text-sm text-muted"><i class="far fa-clock mr-1"></i> 4 Hours Ago</p>
                            </div>
                        </div>
                        <!-- Message End -->
                    </a>
                    <div class="dropdown-divider"></div>
                    <a href="#" class="dropdown-item">
                        <!-- Message Start -->
                        <div class="media">
                            <img src="../../dist/img/user8-128x128.jpg" alt="User Avatar" class="img-size-50 img-circle mr-3">
                            <div class="media-body">
                                <h3 class="dropdown-item-title">
                                    John Pierce
                                    <span class="float-right text-sm text-muted"><i class="fas fa-star"></i></span>
                                </h3>
                                <p class="text-sm">I got your message bro</p>
                                <p class="text-sm text-muted"><i class="far fa-clock mr-1"></i> 4 Hours Ago</p>
                            </div>
                        </div>
                        <!-- Message End -->
                    </a>
                    <div class="dropdown-divider"></div>
                    <a href="#" class="dropdown-item">
                        <!-- Message Start -->
                        <div class="media">
                            <img src="../../dist/img/user3-128x128.jpg" alt="User Avatar" class="img-size-50 img-circle mr-3">
                            <div class="media-body">
                                <h3 class="dropdown-item-title">
                                    Nora Silvester
                                    <span class="float-right text-sm text-warning"><i class="fas fa-star"></i></span>
                                </h3>
                                <p class="text-sm">The subject goes here</p>
                                <p class="text-sm text-muted"><i class="far fa-clock mr-1"></i> 4 Hours Ago</p>
                            </div>
                        </div>
                        <!-- Message End -->
                    </a>
                    <div class="dropdown-divider"></div>
                    <a href="#" class="dropdown-item dropdown-footer">See All Messages</a>
                </div>
            </li>
            <!-- Notifications Dropdown Menu -->
            <li class="nav-item dropdown">
                <a class="nav-link" data-toggle="dropdown" href="#">
                    <i class="far fa-bell"></i>
                    <span class="badge badge-warning navbar-badge">15</span>
                </a>
                <div class="dropdown-menu dropdown-menu-lg dropdown-menu-right">
                    <span class="dropdown-item dropdown-header">15 Notifications</span>
                    <div class="dropdown-divider"></div>
                    <a href="#" class="dropdown-item">
                        <i class="fas fa-envelope mr-2"></i> 4 new messages
                        <span class="float-right text-muted text-sm">3 mins</span>
                    </a>
                    <div class="dropdown-divider"></div>
                    <a href="#" class="dropdown-item">
                        <i class="fas fa-users mr-2"></i> 8 friend requests
                        <span class="float-right text-muted text-sm">12 hours</span>
                    </a>
                    <div class="dropdown-divider"></div>
                    <a href="#" class="dropdown-item">
                        <i class="fas fa-file mr-2"></i> 3 new reports
                        <span class="float-right text-muted text-sm">2 days</span>
                    </a>
                    <div class="dropdown-divider"></div>
                    <a href="#" class="dropdown-item dropdown-footer">See All Notifications</a>
                </div>
            </li>
            <li class="nav-item">
                <a class="nav-link" data-widget="control-sidebar" data-slide="true" href="#">
                    <i class="fas fa-th-large"></i>
                </a>
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
                    <a href="#" class="d-block">${principal}</a>
                </div>
            </div>

            <!-- Sidebar Menu -->
            <nav class="mt-2">
                <ul class="nav nav-pills nav-sidebar flex-column" data-widget="treeview" role="menu" data-accordion="false">
                    <!-- Add icons to the links using the .nav-icon class
                         with font-awesome or any other icon font library -->
                    <li class="nav-item">
                        <a href="/Dashboard/" class="nav-link">
                            <i class="nav-icon fas fa-tachometer-alt"></i>
                            <p>
                                Dashboard
                                <%--<i class="right fas fa-angle-left"></i>--%>
                            </p>
                        </a>
                    </li>
                    <li class="nav-item has-treeview menu-open">
                        <a href="#" class="nav-link ">
                            <i class="nav-icon fas fa-table"></i>
                            <p>
                                Master
                                <i class="fas fa-angle-left right"></i>
                            </p>
                        </a>
                        <ul class="nav nav-treeview">
                            <li class="nav-item">
                                <a href="employee.jsp" class="nav-link">
                                    <i class="far fa-circle nav-icon"></i>
                                    <p>Employee</p>
                                </a>
                            </li>
                            <li class="nav-item">
                                <a href="../tables/data.html" class="nav-link">
                                    <i class="far fa-circle nav-icon"></i>
                                    <p>Category</p>
                                </a>
                            </li>
                            <li class="nav-item">
                                <a href="/Supplier/" class="nav-link ">
                                    <i class="far fa-circle nav-icon"></i>
                                    <p>Supplier</p>
                                </a>
                            </li>
                            <li class="nav-item">
                                <a href="../tables/jsgrid.html" class="nav-link">
                                    <i class="far fa-circle nav-icon"></i>
                                    <p>Outlet</p>
                                </a>
                            </li>
                            <li class="nav-item">
                                <a href="/Item/" class="nav-link ">
                                    <i class="far fa-circle nav-icon"></i>
                                    <p>Item</p>
                                </a>
                            </li>
                        </ul>
                    </li>
                    <li class="nav-item has-treeview">
                        <a href="#" class="nav-link active">
                            <i class="nav-icon fas fa-table"></i>
                            <p>
                                Purchase
                                <i class="fas fa-angle-left right"></i>
                            </p>
                        </a>
                        <ul class="nav nav-treeview">
                            <li class="nav-item">
                                <a href="/PurchaseRequest/" class="nav-link active">
                                    <i class="far fa-circle nav-icon"></i>
                                    <p>Purchase Request</p>
                                </a>
                            </li>
                            <li class="nav-item">
                                <a href="../tables/data.html" class="nav-link">
                                    <i class="far fa-circle nav-icon"></i>
                                    <p>Purchase Order</p>
                                </a>
                            </li>
                        </ul>
                    </li>
                    <li class="nav-item has-treeview ">
                        <a href="#" class="nav-link ">
                            <i class="nav-icon fas fa-table"></i>
                            <p>
                                Adjustment
                                <i class="fas fa-angle-left right"></i>
                            </p>
                        </a>
                    </li>
                    <li class="nav-item has-treeview">
                        <a href="#" class="nav-link ">
                            <i class="nav-icon fas fa-table"></i>
                            <p>
                                Transfer Stock
                                <i class="fas fa-angle-left right"></i>
                            </p>
                        </a>
                    </li>
                    <li class="nav-item has-treeview">
                        <a href="#" class="nav-link ">
                            <i class="nav-icon fas fa-table"></i>
                            <p>
                                Sales Order
                                <i class="fas fa-angle-left right"></i>
                            </p>
                        </a>
                    </li>
                    <li class="nav-item has-treeview">
                        <a href="#" class="nav-link ">
                            <i class="nav-icon fas fa-table"></i>
                            <p>
                                Summary
                                <i class="fas fa-angle-left right"></i>
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
                        <a href="/employees" class="nav-link">
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
                        <h1>Purchase Request</h1>
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
            <div class="row">
                <div class="col-12">
                    <div class="card">
                        <div class="card-header">
                            <div class="col-2 d-none d-sm-inline-block">
                                <input type="text" class="form-control" id="cek" value="${supplier.name}">
                            </div>
                            <div class="col-2 d-none d-sm-inline-block">
                                <select class="form-control select2" style="width: 100%;">
                                    <option selected="selected">Status</option>
                                    <c:forEach var="province" items="${allProvince}">
                                        <option>${province.name}</option>
                                    </c:forEach>
                                </select>
                            </div>
                            <!-- SEARCH FORM -->
                            <div class="col-2 d-none d-sm-inline-block">
                                <div class="input-group">
                                    <input class="form-control form-control-navbar" type="search" placeholder="Search" aria-label="Search">
                                    <div class="input-group-append">
                                        <button class="btn btn-navbar" type="submit">
                                            <i class="fas fa-search"></i>
                                        </button>
                                    </div>
                                </div>
                            </div>
                            <div align="right" class="col-5 d-none d-sm-inline-block">
                                <button type="button" class="btn btn-primary">Export</button>
                                <button type="button" class="btn btn-primary" data-toggle="modal" data-target="#modal-create">Create</button>
                            </div>
                        </div>
                        <!-- /.card-header -->
                        <div class="card-body">
                            <table id="example2" class="table table-bordered table-hover">
                                <thead>
                                <tr>
                                    <th hidden>Id</th>
                                    <th>Create Date</th>
                                    <th>PR No.</th>
                                    <th>Note</th>
                                    <th>Status</th>
                                    <th>#</th>
                                </tr>
                                </thead>
                                <tbody>
                                <c:forEach var="supplier" items="${allSupplier}">
                                    <tr>
                                        <td hidden>${supplier.id}</td>
                                        <td>${supplier.name}</td>
                                        <td>${supplier.address}</td>
                                        <td>${supplier.phone}</td>
                                        <td>${supplier.email}</td>
                                        <td align="center">
                                            <button type="button" class="btn btn-block btn-info"
                                                    onclick="href = '/Supplier/edit_form?id=${supplier.id}';"
                                                    data-toggle="modal" data-target="#modal-edit"
                                            >Edit
                                            </button>
                                            <button type="button" class="btn btn-block btn-info"
                                                    onclick="href = '/Supplier/edit_form?id=${supplier.id}';"
                                                    data-toggle="modal" data-target="#modal-edit"
                                            >View
                                            </button>
                                        </td>
                                    </tr>
                                </c:forEach>
                                </tbody>
                            </table>
                        </div>
                        <!-- /.card-body -->
                    </div>
                    <!-- /.card -->

                    <!-- /.card -->
                </div>
                <!-- /.col -->
            </div>
            <!-- /.row -->
        </section>

        <section class="content">
            <!-- /.modal -->
            <div class="modal fade" id="modal-edit">
                <div class="modal-dialog">
                    <div class="modal-content bg-info">
                        <div class="modal-header">
                            <h4 class="modal-title">Edit Supplier</h4>
                            <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                                <span aria-hidden="true">&times;</span></button>
                        </div>
                        <div class="modal-body">
                            <c:choose>
                                <c:when test="${mode=='MODE_UPDATE' }">
                                    <form role="form" method="POST" action="save_edit">
                                        <div class="card-body">
                                            <input type="hidden" name="id" value=${supplier.id} />
                                            <div class="form-group">
                                                <label for="name">Name</label>
                                                <input type="text" class="form-control" id="name" value="${supplier.name}">
                                            </div>
                                            <div class="form-group">
                                                <label for="address">Address</label>
                                                <input type="text" class="form-control" id="address" value="${supplier.address}">
                                            </div>
                                            <div class="form-group">
                                                <label for="phone">Phone</label>
                                                <input type="text" class="form-control" id="phone" value="${supplier.phone}">
                                            </div>
                                            <div class="form-group">
                                                <label for="email">Email</label>
                                                <input type="email" class="form-control" id="email" value="${supplier.email}">
                                            </div>
                                        </div>
                                        <!-- /.card-body -->
                                        <div class="modal-footer justify-content-between">
                                            <button type="button" class="btn btn-outline-light" data-dismiss="modal">Cancel</button>
                                            <button type="submit" class="btn btn-outline-light">Save changes</button>
                                        </div>
                                    </form>
                                </c:when>
                            </c:choose>
                        </div>

                    </div>
                    <!-- /.modal-content -->
                </div>
                <!-- /.modal-dialog -->
            </div>

            <div class="modal fade" id="modal-create">
                <div class="modal-dialog">
                    <div class="modal-content bg-info">
                        <div class="modal-header">
                            <h4 class="modal-title">Purchase Request</h4>
                            <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                                <span aria-hidden="true">&times;</span></button>
                        </div>
                        <div class="modal-body">
                            <!-- form start -->
                            <form role="form" method="POST" action="save_edit">
                                <div class="card-body">
                                    <h4 class="modal-title">Create New PR : "nama outlet login"</h4>
                                    <div class="form-group">
                                        <label for="datepicker">Target Waktu Item Ready</label>
                                        <!-- Date -->
                                        <div class="form-group">
                                            <div class="input-group date">
                                                <div class="input-group-addon">
                                                    <i class="fa fa-calendar"></i>
                                                </div>
                                                <input type="text" class="form-control pull-right" id="datepicker">
                                            </div>
                                            <!-- /.input group -->
                                        </div>
                                    </div>
                                    <div class="modal-header">
                                        <h4 class="modal-title">Purchase Request</h4>
                                    </div>
                                    <div class="card-body">
                                        <c:choose>
                                            <c:when test="${!empty supplier.name}" >
<%--                                                test="${table =='NOT_NULL'}"--%>
                                                <table id="example" class="table table-bordered table-hover">
                                                    <thead>
                                                    <tr>
                                                        <th hidden>Id</th>
                                                        <th>Variant Name</th>
                                                        <th>Unit Price</th>
                                                        <th>SKU</th>
                                                        <th>Beginning Stock</th>
                                                        <th>#</th>
                                                    </tr>
                                                    </thead>
                                                    <tbody>
                                                    <c:forEach var="supplier" items="${allSupplier}">
                                                        <tr>
                                                            <td hidden>${supplier.id}</td>
                                                            <td>${supplier.name}</td>
                                                            <td>${supplier.address}</td>
                                                            <td>${supplier.phone}</td>
                                                            <td>${supplier.email}</td>
                                                            <td align="center">
                                                                <a href="/edit_form?id=${supplier.id}" class="btn btn-app btn-info"
                                                                    <%--                                               data-toggle="modal" data-target="#modal-edit--%>
                                                                ">
                                                                <i class="fas fa-edit"></i> Edit
                                                                </a>
                                                                <a href="/edit_form?id=${supplier.id}" class="btn btn-app btn-info"
                                                                    <%--                                               data-toggle="modal" data-target="#modal-edit--%>
                                                                ">
                                                                <i class="fas fa-edit"></i> Delete
                                                                </a>
                                                            </td>
                                                        </tr>
                                                    </c:forEach>
                                                    </tbody>
                                                </table>
                                                <div align="center">
                                                    <button type="button" class="btn w-100 btn-primary" data-toggle="modal" data-target="#modal-addItem">Add Item</button>
                                                </div>
                                            </c:when>
                                            <c:when test="${empty supplier.name}">
<%--                                                test="${table =='NULL'}"--%>
                                                <div align="center">
                                                    <button type="button" class="btn w-100 btn-primary" data-toggle="modal" data-target="#modal-addItem">Add Item</button>
                                                </div>
                                            </c:when>
                                        </c:choose>
                                    </div>
                                    <!-- /.form-group -->
                                </div>
                                <!-- /.card-body -->
                                <div class="modal-footer justify-content-between">
                                    <button type="button" class="btn btn-outline-light" data-dismiss="modal">Cancel</button>
                                    <button type="submit" class="btn btn-outline-light">Save</button>
                                </div>
                            </form>
                        </div>

                    </div>
                    <!-- /.modal-content -->
                </div>
                <!-- /.modal-dialog -->
            </div>

            <div class="modal fade" id="modal-addItem">
                <div class="modal-dialog">
                    <div class="modal-content">
                        <!-- form start -->
                        <form role="form" method="POST" action="save_edit">
                            <div class="modal-header">
                                <h4 class="modal-title">Add Item</h4>
                                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                                    <span aria-hidden="true">&times;</span>
                                </button>
                            </div>
                            <div class="modal-body">
                                <div class="form-group">
                                    <!-- SEARCH FORM -->
                                    <form class="form-inline ml-3">
                                        <div class="input-group input-group-sm">
                                            <input class="form-control form-control-navbar" type="search" placeholder="Item Name - Variant Name" aria-label="Search">
                                            <div class="input-group-append">
                                                <button class="btn btn-navbar" type="submit">
                                                    <i class="fas fa-search"></i>
                                                </button>
                                            </div>
                                        </div>
                                    </form>
                                </div>
                                <div class="form-group">
                                    <table id="item" class="table table-bordered table-hover">
                                        <thead>
                                        <tr>
                                            <th hidden>Id</th>
                                            <th>Item</th>
                                            <th>In Stock</th>
                                            <th>Request Qty</th>
                                        </tr>
                                        </thead>
                                        <tbody>
                                        <c:forEach var="supplier" items="${allSupplier}">
                                            <tr>
                                                <td hidden>${supplier.id}</td>
                                                <td>${supplier.name}</td>
                                                <td class="disabled">${supplier.address}</td>
                                                <td>${supplier.phone}</td>
                                            </tr>
                                        </c:forEach>
                                        </tbody>
                                    </table>
                                </div>
                                <div class="modal-footer justify-content-between">
                                    <button type="button" class="btn btn-default" data-dismiss="modal">Cancel</button>
                                    <button type="submit" class="btn btn-primary">Add</button>
                                </div>
                            </div>
                        </form>
                    </div>
                    <!-- /.modal-content -->
                </div>
                <!-- /.modal-dialog -->
            </div>

            <div class="modal fade" id="modal-editVariant">
                <div class="modal-dialog">
                    <form class="modal-content">
                        <div class="modal-header">
                            <h4 class="modal-title">Edit Variant</h4>
                            <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                                <span aria-hidden="true">&times;</span>
                            </button>
                        </div>
                        <div class="modal-body">
                            <!-- form start -->
                            <form role="form" method="POST" action="save_edit">
                                <div class="form-group">
                                    <label for="editVariantName">Variant Name</label>
                                    <input type="text" class="form-control" id="editVariantName" value="${supplier.name}">
                                </div>
                                <div class="form-group">
                                    <label for="editUnitPrice">Unit Price</label>
                                    <input type="text" class="form-control" id="editUnitPrice" value="${supplier.name}">
                                </div>
                                <div class="form-group">
                                    <label for="editSku">SKU</label>
                                    <input type="text" class="form-control" id="editSku" value="${supplier.name}">
                                </div>
                                <div class="modal-header">
                                    <h4 class="modal-title">Set Beginning Stock</h4>
                                </div>
                                <div class="form-group">
                                    <label for="editBeginningStock">Beginning Stock</label>
                                    <input type="text" class="form-control" id="editBeginningStock" value="${supplier.name}">
                                </div>
                                <div class="form-group">
                                    <label for="editAlertAt">Alert At</label>
                                    <input type="text" class="form-control" id="editAlertAt" value="${supplier.name}">
                                </div>
                                <div class="modal-footer justify-content-between">
                                    <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
                                    <button type="submit" class="btn btn-primary">Add</button>
                                </div>
                            </form>
                        </div>
                    </form>
                    <!-- /.modal-content -->
                </div>
                <!-- /.modal-dialog -->
            </div>
            <!-- /.modal -->
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

<script src="${pageContext.request.contextPath}/resources/plugins/input-mask/jquery.inputmask.date.extensions.js"></script>
<script src="${pageContext.request.contextPath}/resources/bower_components/bootstrap-datepicker/dist/js/bootstrap-datepicker.min.js"></script>
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

    //Date picker
    $('#datepicker').datepicker({
        autoclose: true
    })
</script>
</body>
</html>