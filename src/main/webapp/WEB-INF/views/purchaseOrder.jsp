<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>AdminLTE 3 | DataTables</title>
    <!-- Tell the browser to be responsive to screen width -->
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/plugins/daterangepicker/daterangepicker.css">
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

    <script type="text/javascript" src="https://cdn.jsdelivr.net/jquery/latest/jquery.min.js"></script>
    <script type="text/javascript" src="https://cdn.jsdelivr.net/momentjs/latest/moment.min.js"></script>
    <script type="text/javascript" src="https://cdn.jsdelivr.net/npm/daterangepicker/daterangepicker.min.js"></script>
    <link rel="stylesheet" type="text/css" href="https://cdn.jsdelivr.net/npm/daterangepicker/daterangepicker.css">

    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
    <script>
        $(document).ready(function(){
            $("#myInput").on("keyup", function() {
                var value = $(this).val().toLowerCase();
                $("#myTable tr").filter(function() {
                    $(this).toggle($(this).text().toLowerCase().indexOf(value) > -1)
                });
            });
        });
    </script>
    <script>
        $(document).on('click', '.edit_data', function(){
            var poId = $(this).attr("id");
            console.log("Hello, " + poId );
            $.ajax({
                url:"/PurchaseOrder/edit_form/"+ poId,
                method:"GET",
                dataType:"json",
                success:function(data){
                    $('#id').val(data.id);
                    $('#poNo').val(data.poNo);
                    $('#status').val(data.status);
                    $('#grandTotal').val(data.grandTotal);
                    $('#outletId').val(data.outlet_id);
                    $('#supplier').val(data.supplier_id);
                    $('#notes').val(data.notes);
                }
            });
            $.ajax({
                url:"/PurchaseOrder/edit_formDetail/"+ poId,
                method:"GET",
                dataType:"json",
                success:function(data){
                    $('#id').val(data.id);
                    $('#poNo').val(data.poNo);
                    $('#status').val(data.status);
                    $('#grandTotal').val(data.grandTotal);
                    $('#outletId').val(data.outlet_id);
                    $('#supplier').val(data.supplier_id);
                    $('#notes').val(data.notes);
                }
            });
        });
    </script>
    <script>
        $(document).on('click', '.save_data', function(){
            $('#id').val("");
            $('#name').val("");
            $('#address').val("");
            $('#province').val("0");
            $('#region').val("0");
            $('#district').val("0");
            $('#phone').val("");
            $('#email').val("");
            $('#postalCode').val("");
        });
    </script>

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
                    <li class="nav-item has-treeview">
                        <a href="#" class="nav-link active">
                            <i class="nav-icon fas fa-table"></i>
                            <p>
                                Master
                                <i class="fas fa-angle-left right"></i>
                            </p>
                        </a>
                        <ul class="nav nav-treeview">
                            <li class="nav-item">
                                <a href="employees" class="nav-link">
                                    <i class="far fa-circle nav-icon"></i>
                                    <p>Employee</p>
                                </a>
                            </li>
                            <li class="nav-item">
                                <a href="/Category/" class="nav-link">
                                    <i class="far fa-circle nav-icon"></i>
                                    <p>Category</p>
                                </a>
                            </li>
                            <li class="nav-item">
                                <a href="/Supplier/" class="nav-link">
                                    <i class="far fa-circle nav-icon"></i>
                                    <p>Supplier</p>
                                </a>
                            </li>
                            <li class="nav-item">
                                <a href="/Outlet/viewoutlets" class="nav-link">
                                    <i class="far fa-circle nav-icon"></i>
                                    <p>Outlet</p>
                                </a>
                            </li>
                            <li class="nav-item">
                                <a href="/Item/viewitems" class="nav-link">
                                    <i class="far fa-circle nav-icon"></i>
                                    <p>Item</p>
                                </a>
                            </li>
                        </ul>
                    </li>
                    <li class="nav-item has-treeview menu-open">
                        <a href="#" class="nav-link ">
                            <i class="nav-icon fas fa-table"></i>
                            <p>
                                Purchase
                                <i class="fas fa-angle-left right"></i>
                            </p>
                        </a>
                        <ul class="nav nav-treeview">
                            <li class="nav-item">
                                <a href="/PurchaseRequest/" class="nav-link">
                                    <i class="far fa-circle nav-icon"></i>
                                    <p>Purchase Request</p>
                                </a>
                            </li>
                            <li class="nav-item">
                                <a href="/PurchaseOrder/" class="nav-link active">
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
                        <h1>Purchase Order</h1>
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
                            <form class="form-inline justify-content-between" style="width: 100%">
                                <%--Status--%>
                                <input name="daterange" class="form-control" style="width: 20%" placeholder="MM/DD/YYYY - MM/DD/YYYY"/>

                                <select class="form-control select2" style="width: 15%">
                                    <option selected="selected">Status</option>
                                    <c:forEach var="po" items="${allPO}">
                                        <option id="optionInput">${po.status}</option>
                                    </c:forEach>
                                </select>

                                <!-- SEARCH FORM -->
                                <div class="input-group">
                                    <input id="myInput" class="form-control form-control-navbar" type="search" placeholder="Search" aria-label="Search">
                                    <div class="input-group-append">
                                        <button class="btn btn-navbar" type="submit">
                                            <i class="fas fa-search"></i>
                                        </button>
                                    </div>
                                </div>
                                <button type="button" class=" btn w-25 btn-primary">Export</button>
                            </form>
                        </div>
                        <!-- /.card-header -->
                        <div class="card-body">
                            <table id="example2" class="table table-bordered table-hover">
                                <thead>
                                <tr>
                                    <th hidden>Id</th>
                                    <th>Create Date</th>
                                    <th>Supplier</th>
                                    <th>PO No.</th>
                                    <th>Total</th>
                                    <th>Status</th>
                                    <th>#</th>
                                </tr>
                                </thead>
                                <tbody id="myTable">
                                <c:forEach var="po" items="${allPO}">
                                    <tr>
                                        <td hidden>${po.id}</td>
                                        <td>
                                            <fmt:formatDate type="date" pattern="dd/MM/yyyy" value="${po.createOn}"/>
                                        </td>
                                        <td>${po.supplierId.name}</td>
                                        <td>${po.poNo}</td>
                                        <td>
                                            <fmt:formatNumber type="currency" currencySymbol="Rp " value = "${po.grandTotal}" />
                                        </td>
                                        <td>${po.status}</td>
                                        <td align="center">
                                            <button type="button" class="edit_data btn btn-block btn-info" id="${po.id}"
                                                    data-toggle="modal" data-target="#modal-edit">Edit
                                            </button>
                                            <button type="button" class="btn btn-block btn-info"
                                                    data-toggle="modal" data-target="#modal-view">View
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
            <div class="modal fade" id="modal-edit">
                <div class="modal-dialog modal-dialog-scrollable">
                    <div style="width: 120%" class="modal-content bg-info">
                        <div class="modal-header">
                            <h4 class="modal-title">Purchase Order</h4>
                            <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                                <span aria-hidden="true">&times;</span></button>
                        </div>
                        <div class="modal-body">
                            <!-- form start -->
                            <div class="container-fluid">
                                <form:form method="POST" action="/PurchaseOrder/update-po" modelAttribute="PO">
                                    <div class="card-body">
                                        <div class="form-group">
                                            <h4 class="modal-title">Edit New PO : "nama outlet login"</h4>
                                        </div>
                                        <div hidden class="form-group">
                                            <form:input class="form-control" id="id" path="id"/>
                                            <form:input class="form-control" id="poNo" path="poNo"/>
                                            <form:input class="form-control" id="status" path="status"/>
                                            <form:input class="form-control" id="grandTotal" path="grandTotal"/>
                                            <form:input class="form-control" id="outletId" path="outlet_id"/>
                                        </div>
                                        <div class="form-group">
                                            <label>Choose Supplier</label>
                                            <form:select id="supplier" path="supplier_id" class="form-control select2 " style="width: 100%;"  >
                                                <form:option value="0" label="Select Supplier"/>
                                                <form:options items="${supplier}"/>
                                            </form:select>
                                        </div>
                                        <div class="form-group">
                                            <label for="notes">Notes</label>
                                            <form:textarea type="text" class="form-control" id="notes" path="notes"/>
                                        </div>

                                        <div class="modal-header">
                                            <h4 class="modal-title">Purchase Order</h4>
                                        </div>
                                        <div class="form-group">
                                            <table id="example" class="table table-bordered table-hover">
                                                <thead>
                                                <tr>
                                                    <th hidden>Id</th>
                                                    <th>Item</th>
                                                    <th>In Stock</th>
                                                    <th>Qty</th>
                                                    <th>Unit Cost</th>
                                                    <th>Sub Total</th>
                                                </tr>
                                                </thead>
                                                <tbody>
                                                <c:forEach var="poDetail" items="${poDetail}">
                                                    <tr>
                                                        <td hidden>${poDetail.inventory.variant.item.id}</td>
                                                        <td hidden>${poDetail.po_id}</td>
                                                        <td>${poDetail.inventory.variant.item.name} - ${poDetail.inventory.variant.name}</td>
                                                        <td disabled="true">${poDetail.inventory.adjustmentQty}</td>
                                                        <td disabled="true">${poDetail.inventory.adjustmentQty}</td>
                                                        <td>
<%--                                                            <form:form method="POST" action="/PurchaseOrder/update-po" modelAttribute="PODetail">--%>
<%--                                                                <form:input id="unitCost" path="unit_cost"/>--%>
                                                                <input style="background: transparent; border: none; color: white;" class="form-control"
                                                                       id="unitCost" value="${poDetail.unit_cost}"/>

<%--                                                                <button type="submit" class="btn btn-success">O</button>--%>
<%--                                                            </form:form>--%>
                                                        </td>
                                                        <td disabled="true">
                                                            <fmt:formatNumber type="currency" currencySymbol="Rp " value = "${poDetail.sub_total}" />
                                                        </td>
                                                    </tr>
                                                </c:forEach>
                                                </tbody>
                                            </table>
                                        </div>
                                        <div class="form-inline justify-content-between" style="width: 100%">
                                            <h4 class="modal-title">TOTAL</h4>
                                            <label>
                                                <c:set var="total" value="${0}"/>
                                                <c:forEach var="poDetail" items="${poDetail}">
                                                    <c:set var="total" value="${total + poDetail.sub_total}"/>
                                                </c:forEach>
                                                <fmt:formatNumber type="currency" currencySymbol="Rp " value = "${total}" />
                                            </label>
                                        </div>
                                    </div>
                                    <div class="modal-footer justify-content-between">
                                        <button type="submit" class="btn btn-success">Submit</button>
                                        <button type="button" class="btn btn-outline-light" data-dismiss="modal">Cancel</button>
                                        <button formaction="/PurchaseOrder/update-po-dtl" type="submit" class="btn btn-outline-light">Save</button>
                                    </div>
                                    <!-- /.card-body -->
                                </form:form>
                            </div>
                        </div>
                    </div>
                    <!-- /.modal-content -->
                </div>
                <!-- /.modal-dialog -->
            </div>

<%--            <div class="modal fade" id="modal-view">--%>
<%--                <div class="modal-dialog modal-dialog-scrollable">--%>
<%--                    <div style="width: 120%" class="modal-content bg-info">--%>
<%--                        <div class="modal-header form-inline justify-content-between">--%>
<%--                            <h4 class="modal-title">Purchase Order Detail</h4>--%>
<%--                            <form:select id="supplier" path="supplier_id" class="form-control select2 " style="width: 100%;"  >--%>
<%--                                <form:option value="0" label="More"/>--%>
<%--                                <form:options items="${supplier}"/>--%>
<%--                            </form:select>--%>
<%--                            <button type="button" class="close" data-dismiss="modal" aria-label="Close">--%>
<%--                                <span aria-hidden="true">&times;</span></button>--%>
<%--                        </div>--%>
<%--                        <div class="modal-body">--%>
<%--                            <!-- form start -->--%>
<%--                            <div class="container-fluid">--%>
<%--                                <form:form method="GET" action="/PurchaseOrder/update-po" modelAttribute="poDetail">--%>
<%--                                    <label></label>--%>



<%--                                    <div class="card-body">--%>
<%--                                        <div class="form-group">--%>
<%--                                            <h4 class="modal-title">Edit New PO : "nama outlet login"</h4>--%>
<%--                                        </div>--%>
<%--                                        <div hidden class="form-group">--%>
<%--                                            <form:input class="form-control" id="id" path="id"/>--%>
<%--                                        </div>--%>
<%--                                        <div class="form-group">--%>
<%--                                            <label>Choose Supplier</label>--%>
<%--                                            <form:select id="supplier" path="supplier_id" class="form-control select2 " style="width: 100%;"  >--%>
<%--                                                <form:option value="0" label="Select Supplier"/>--%>
<%--                                                <form:options items="${supplier}"/>--%>
<%--                                            </form:select>--%>
<%--                                        </div>--%>
<%--                                        <div class="form-group">--%>
<%--                                            <label for="notes">Notes</label>--%>
<%--                                            <form:textarea type="text" class="form-control" id="notes" path="notes"/>--%>
<%--                                        </div>--%>

<%--                                        <div class="modal-header">--%>
<%--                                            <h4 class="modal-title">Purchase Order</h4>--%>
<%--                                        </div>--%>
<%--                                        <div class="form-group">--%>
<%--                                            <table id="example" class="table table-bordered table-hover">--%>
<%--                                                <thead>--%>
<%--                                                <tr>--%>
<%--                                                    <th hidden>Id</th>--%>
<%--                                                    <th>Item</th>--%>
<%--                                                    <th>In Stock</th>--%>
<%--                                                    <th>Qty</th>--%>
<%--                                                    <th>Unit Cost</th>--%>
<%--                                                    <th>Sub Total</th>--%>
<%--                                                </tr>--%>
<%--                                                </thead>--%>
<%--                                                <tbody>--%>
<%--                                                <c:forEach var="poDetail" items="${poDetail}">--%>
<%--                                                    <tr>--%>
<%--                                                        <td hidden>${poDetail.inventory.variant.item.id}</td>--%>
<%--                                                        <td>${poDetail.inventory.variant.item.name} - ${poDetail.inventory.variant.name}</td>--%>
<%--                                                        <td disabled="true">${poDetail.inventory.adjustmentQty}</td>--%>
<%--                                                        <td disabled="true">${poDetail.inventory.adjustmentQty}</td>--%>
<%--                                                        <td>--%>
<%--                                                            <input style="background: transparent; border: none; color: white;" class="form-control"--%>
<%--                                                                   id="unitCost" value="${poDetail.unit_cost}"/>--%>
<%--                                                        </td>--%>
<%--                                                        <td disabled="true">--%>
<%--                                                            <fmt:formatNumber type="currency" currencySymbol="Rp " value = "${poDetail.sub_total}" />--%>
<%--                                                        </td>--%>
<%--                                                    </tr>--%>
<%--                                                </c:forEach>--%>
<%--                                                </tbody>--%>
<%--                                            </table>--%>
<%--                                        </div>--%>
<%--                                        <div class="form-inline justify-content-between" style="width: 100%">--%>
<%--                                            <h4 class="modal-title">TOTAL</h4>--%>
<%--                                            <label>--%>
<%--                                                <c:set var="total" value="${0}"/>--%>
<%--                                                <c:forEach var="poDetail" items="${poDetail}">--%>
<%--                                                    <c:set var="total" value="${total + poDetail.sub_total}"/>--%>
<%--                                                </c:forEach>--%>
<%--                                                <fmt:formatNumber type="currency" currencySymbol="Rp " value = "${total}" />--%>
<%--                                            </label>--%>
<%--                                        </div>--%>
<%--                                    </div>--%>
<%--                                    <div class="modal-footer justify-content-between">--%>
<%--                                        <button type="submit" class="btn btn-success">Submit</button>--%>
<%--                                        <button type="button" class="btn btn-outline-light" data-dismiss="modal">Cancel</button>--%>
<%--                                        <button type="submit" class="btn btn-outline-light">Save</button>--%>
<%--                                    </div>--%>
<%--                                    <!-- /.card-body -->--%>
<%--                                </form:form>--%>
<%--                            </div>--%>
<%--                        </div>--%>
<%--                    </div>--%>
<%--                    <!-- /.modal-content -->--%>
<%--                </div>--%>
<%--                <!-- /.modal-dialog -->--%>
<%--            </div>--%>
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

<script src="${pageContext.request.contextPath}/resources/plugins/daterangepicker/daterangepicker.js"></script>

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

    $(function() {
        $('input[name="daterange"]').daterangepicker({
            opens: 'left'
        }, function(start, end, label) {
            console.log("A new date selection was made: " + start.format('YYYY-MM-DD') + ' to ' + end.format('YYYY-MM-DD'));
        });
    });

</script>
</body>
</html>