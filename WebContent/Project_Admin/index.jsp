
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">


<html class=" ">
    <head>
    
        <!-- 
         * @Package: Ultra Admin - Responsive Theme
         * @Subpackage: Bootstrap
         * @Version: 4.0
         * This file is part of Ultra Admin Theme.
        -->
        <meta http-equiv="content-type" content="text/html;charset=UTF-8" />
        <meta charset="utf-8" />
        <title>Index</title>
        <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no" />
        <meta content="" name="description" />
        <meta content="" name="author" />

        <link rel="shortcut icon" href="assets/images/favicon.png" type="image/x-icon" />    <!-- Favicon -->
        <link rel="apple-touch-icon-precomposed" href="assets/images/apple-touch-icon-57-precomposed.png">	<!-- For iPhone -->
        <link rel="apple-touch-icon-precomposed" sizes="114x114" href="assets/images/apple-touch-icon-114-precomposed.png">    <!-- For iPhone 4 Retina display -->
        <link rel="apple-touch-icon-precomposed" sizes="72x72" href="assets/images/apple-touch-icon-72-precomposed.png">    <!-- For iPad -->
        <link rel="apple-touch-icon-precomposed" sizes="144x144" href="assets/images/apple-touch-icon-144-precomposed.png">    <!-- For iPad Retina display -->




        <!-- CORE CSS FRAMEWORK - START -->
        <link href="css/pace-theme-flash.css" rel="stylesheet" type="text/css" media="screen"/>
        <link href="css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <link href="css/bootstrap-theme.min.css" rel="stylesheet" type="text/css"/>
        <link href="css/font-awesome.css" rel="stylesheet" type="text/css"/>
        <link href="css/animate.min.css" rel="stylesheet" type="text/css"/>
        <link href="css/perfect-scrollbar.css" rel="stylesheet" type="text/css"/>
        <!-- CORE CSS FRAMEWORK - END -->

        <!-- OTHER SCRIPTS INCLUDED ON THIS PAGE - START --> 
        <link href="css/morris.css" rel="stylesheet" type="text/css" media="screen"/><link href="css/jquery-ui.min.css" rel="stylesheet" type="text/css" media="screen"/><link href="css/graph.css" rel="stylesheet" type="text/css" media="screen"/><link href="css/detail.css" rel="stylesheet" type="text/css" media="screen"/><link href="css/legend.css" rel="stylesheet" type="text/css" media="screen"/><link href="css/extensions.css" rel="stylesheet" type="text/css" media="screen"/><link href="css/rickshaw.min.css" rel="stylesheet" type="text/css" media="screen"/><link href="css/lines.css" rel="stylesheet" type="text/css" media="screen"/><link href="css/jquery-jvectormap-2.0.1.css" rel="stylesheet" type="text/css" media="screen"/><link href="css/white.css" rel="stylesheet" type="text/css" media="screen"/>        <!-- OTHER SCRIPTS INCLUDED ON THIS PAGE - END --> 


        <!-- CORE CSS TEMPLATE - START -->
        <link href="css/style.css" rel="stylesheet" type="text/css"/>
        <link href="css/responsive.css" rel="stylesheet" type="text/css"/>
        <!-- CORE CSS TEMPLATE - END -->

    </head>
    <!-- END HEAD -->

    <!-- BEGIN BODY -->
    <body class=" "><!-- START TOPBAR -->
        <jsp:include page="header.jsp"></jsp:include>
                <!-- END TOPBAR -->
        <!-- START CONTAINER -->
        <div class="page-container row-fluid">

            <!-- SIDEBAR - START -->
            
            <jsp:include page="menu.jsp"></jsp:include>
                        <!--  SIDEBAR - END -->
            <!-- START CONTENT -->
            <section id="main-content" class=" ">
                <section class="wrapper main-wrapper" style=''>

                    <div class='col-lg-12 col-md-12 col-sm-12 col-xs-12'>
                        <div class="page-title">

                            <div class="pull-left">
                                <h1 class="title">L . J Institute of Engineering</h1>                            </div>

                            <div class="pull-right hidden-xs">
                                <ol class="breadcrumb">
                                    <li>
                                        <a href="index.jsp"><i class="fa fa-home"></i>Home</a>
                                    </li>
                                    
                                </ol>
                            </div>

                        </div>
                    </div>
                    <div class="clearfix"></div>


                    <div class="col-md-8 col-sm-12 col-xs-12">
                        <section class="box nobox">
                            <div class="content-body">

                                <div class="row">

                                    <div class="col-md-12 col-sm-12 col-xs-12">
                                        <div class="r1_maingraph db_box">
                                            <span class='pull-left'>
                                                <!-- <i class='icon-purple fa fa-square icon-xs'></i>&nbsp;<small>Engineering Students</small> -->
                                                &nbsp; &nbsp;<!-- <i class='fa fa-square icon-xs icon-primary'></i>&nbsp;
                                                <small>Medical Students</small> -->
                                            </span>
                                            <jsp:include page="chart.jsp"></jsp:include>
                               
                                               <div style="display:none" id="db_morris_bar_graph" style="height:auto;width:100%;">
                                            
                                            
                                            </div> 
                                        </div>
                                    </div>




                                </div> <!-- End .row -->

                            </div>
                        </section></div>

                    <div class="col-md-4 col-sm-12 col-xs-12">
                        <div class="row">
                            <div class="col-md-12 col-sm-12 col-xs-12">
                                <section class="box ">
                                    <header class="panel_header">
                                        <h2 class="title pull-left">Class Info.</h2>
                                        <div class="actions panel_actions pull-right">
                                            <i class="box_toggle fa fa-chevron-down"></i>
                                            <i class="box_setting fa fa-cog" data-toggle="modal" href="#section-settings"></i>
                                            <i class="box_close fa fa-times"></i>
                                        </div>
                                    </header>
                                    <div class="content-body">
                                        <table class="table table-hover">
                                            <thead>
                                                <tr>
                                                    <th style="width:60%">Class No</th>
                                                    <th style="width:30%">Capacity</th>
                                                </tr>
                                            </thead>
                                            <tbody>
                                                
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
											<c:forEach items="${sessionScope.classtbl }" var="i">
                                                <tr>
                                                    <td>${i.classNumber }</td>
                                                    <td>${i.classCapacity }</span></td>
                                          </tr>
                                           </c:forEach>  
                                                
                                                                                           </tbody>
                                        </table>


                                    </div>
                                </section>

                            </div>
                        </div>
                    </div>

                    <div class="col-md-8 col-sm-12 col-xs-12" style="display:none"> 
>
                        <section class="box nobox">
                            <div class="content-body">
                                <div class="row">

                                    <div class="col-md-12 col-sm-12 col-xs-12">
                                        <div class="r1_maingraph db_box">2i
                                            <span class='pull-left'>
                                                <i class='icon-purple fa fa-square icon-xs'></i>&nbsp;<small>Engineering Students</small>
                                                &nbsp; &nbsp;<i class='fa fa-square icon-xs icon-primary'></i>&nbsp;
                                                <small>Medical Students</small>
                                            </span>
                                            <div id="db_morris_line_graph" style="height:auto;width:100%;"></div>
                                        </div>
                                    </div>

                                </div> <!-- End .row -->


                            </div>
                        </section></div>

                    <div class="col-md-4 col-sm-12 col-xs-12" style="display:none">
                        <div class="row">
                            <div class="col-md-12 col-sm-12 col-xs-12">
                                <section class="box ">
                                    <header class="panel_header">
                                        <h2 class="title pull-left">Medicine</h2>
                                        <div class="actions panel_actions pull-right">
                                            <i class="box_toggle fa fa-chevron-down"></i>
                                            <i class="box_setting fa fa-cog" data-toggle="modal" href="#section-settings"></i>
                                            <i class="box_close fa fa-times"></i>
                                        </div>
                                    </header>
                                    <div class="content-body">
                                        <table class="table table-hover">
                                            <thead>
                                                <tr>
                                                    <th style="width:60%">Student</th>
                                                    <th style="width:30%">Report</th>
                                                </tr>
                                            </thead>
                                            <tbody>
                                                <tr>

                                                    <td>John Doug</td>
                                                    <td><span class="playlist_song1">...</span></td>
                                                </tr>
                                                <tr>

                                                    <td>Harry P.</td>
                                                    <td><span class="playlist_song2">...</span></td>
                                                </tr>

                                                <tr>

                                                    <td>Clarke M.</td>
                                                    <td><span class="playlist_song5">...</span></td>
                                                </tr>
                                                <tr>

                                                    <td>Nik P.</td>
                                                    <td><span class="playlist_song6">...</span></td>
                                                </tr>
                                                <tr>

                                                    <td>Kate Wilson</td>
                                                    <td><span class="playlist_song7">...</span></td>
                                                </tr>
                                            </tbody>
                                        </table>


                                    </div>
                                </section>

                            </div>
                        </div>
                    </div>

                    <div class="col-md-8 col-sm-12 col-xs-12" style="display:none">
                        <section class="box nobox">
                            <div class="content-body">

                                <div class="row">

                                    <div class="col-md-12 col-sm-12 col-xs-12">
                                        <div class="r1_maingraph db_box">
                                            <span class='pull-left'>
                                                <i class='icon-purple fa fa-square icon-xs'></i>&nbsp;<small>Engineering Students</small>
                                                &nbsp; &nbsp;<i class='fa fa-square icon-xs icon-primary'></i>&nbsp;
                                                <small>Medical Students</small>
                                            </span>
                                            <div id="db_morris_area_graph" style="height:auto;width:100%;"></div>
                                        </div>
                                    </div>


                                </div> <!-- End .row -->


                            </div>
                        </section></div>
                    <div class="col-md-4 col-sm-12 col-xs-12" style="display:none">
                        <div class="row">
                            <div class="col-md-12 col-sm-12 col-xs-12">
                                <section class="box ">
                                    <header class="panel_header">
                                        <h2 class="title pull-left">Architecture</h2>
                                        <div class="actions panel_actions pull-right">
                                            <i class="box_toggle fa fa-chevron-down"></i>
                                            <i class="box_setting fa fa-cog" data-toggle="modal" href="#section-settings"></i>
                                            <i class="box_close fa fa-times"></i>
                                        </div>
                                    </header>
                                    <div class="content-body">
                                        <table class="table table-hover">
                                            <thead>
                                                <tr>
                                                    <th style="width:60%">Student</th>
                                                    <th style="width:30%">Report</th>
                                                </tr>
                                            </thead>
                                            <tbody>

                                                <tr>

                                                    <td>Harry P.</td>
                                                    <td><span class="playlist_song2">...</span></td>
                                                </tr>
                                                <tr>

                                                    <td>Will Mark</td>
                                                    <td><span class="playlist_song3">...</span></td>
                                                </tr>
                                                <tr>

                                                    <td>Jason D.</td>
                                                    <td><span class="playlist_song4">...</span></td>
                                                </tr>
                                                <tr>

                                                    <td>Clarke M.</td>
                                                    <td><span class="playlist_song5">...</span></td>
                                                </tr>
                                                <tr>

                                                    <td>Nik P.</td>
                                                    <td><span class="playlist_song6">...</span></td>
                                                </tr>

                                            </tbody>
                                        </table>


                                    </div>
                                </section>

                            </div>
                        </div>
                    </div>


                </section>
            </section>
            <!-- END CONTENT -->
            <div class="page-chatapi hideit">

                <div class="search-bar">
                    <input type="text" placeholder="Search" class="form-control">
                </div>

                <div class="chat-wrapper">
                    <h4 class="group-head">Groups</h4>
                    <ul class="group-list list-unstyled">
                        <li class="group-row">
                            <div class="group-status available">
                                <i class="fa fa-circle"></i>
                            </div>
                            <div class="group-info">
                                <h4><a href="#">Work</a></h4>
                            </div>
                        </li>
                        <li class="group-row">
                            <div class="group-status away">
                                <i class="fa fa-circle"></i>
                            </div>
                            <div class="group-info">
                                <h4><a href="#">Friends</a></h4>
                            </div>
                        </li>

                    </ul>


                    <h4 class="group-head">Favourites</h4>
                    <ul class="contact-list">

                        <li class="user-row" id='chat_user_1' data-user-id='1'>
                            <div class="user-img">
                                <a href="#"><img src="img/avatar-1.png" alt=""></a>
                            </div>
                            <div class="user-info">
                                <h4><a href="#">Clarine Vassar</a></h4>
                                <span class="status available" data-status="available"> Available</span>
                            </div>
                            <div class="user-status available">
                                <i class="fa fa-circle"></i>
                            </div>
                        </li>
                        <li class="user-row" id='chat_user_2' data-user-id='2'>
                            <div class="user-img">
                                <a href="#"><img src="img/avatar-2.png" alt=""></a>
                            </div>
                            <div class="user-info">
                                <h4><a href="#">Brooks Latshaw</a></h4>
                                <span class="status away" data-status="away"> Away</span>
                            </div>
                            <div class="user-status away">
                                <i class="fa fa-circle"></i>
                            </div>
                        </li>
                        <li class="user-row" id='chat_user_3' data-user-id='3'>
                            <div class="user-img">
                                <a href="#"><img src="img/avatar-3.png" alt=""></a>
                            </div>
                            <div class="user-info">
                                <h4><a href="#">Clementina Brodeur</a></h4>
                                <span class="status busy" data-status="busy"> Busy</span>
                            </div>
                            <div class="user-status busy">
                                <i class="fa fa-circle"></i>
                            </div>
                        </li>

                    </ul>


                    <h4 class="group-head">More Contacts</h4>
                    <ul class="contact-list">

                        <li class="user-row" id='chat_user_4' data-user-id='4'>
                            <div class="user-img">
                                <a href="#"><img src="img/avatar-4.png" alt=""></a>
                            </div>
                            <div class="user-info">
                                <h4><a href="#">Carri Busey</a></h4>
                                <span class="status offline" data-status="offline"> Offline</span>
                            </div>
                            <div class="user-status offline">
                                <i class="fa fa-circle"></i>
                            </div>
                        </li>
                        <li class="user-row" id='chat_user_5' data-user-id='5'>
                            <div class="user-img">
                                <a href="#"><img src="img/avatar-5.png" alt=""></a>
                            </div>
                            <div class="user-info">
                                <h4><a href="#">Melissa Dock</a></h4>
                                <span class="status offline" data-status="offline"> Offline</span>
                            </div>
                            <div class="user-status offline">
                                <i class="fa fa-circle"></i>
                            </div>
                        </li>
                        <li class="user-row" id='chat_user_6' data-user-id='6'>
                            <div class="user-img">
                                <a href="#"><img src="img/avatar-1.png" alt=""></a>
                            </div>
                            <div class="user-info">
                                <h4><a href="#">Verdell Rea</a></h4>
                                <span class="status available" data-status="available"> Available</span>
                            </div>
                            <div class="user-status available">
                                <i class="fa fa-circle"></i>
                            </div>
                        </li>
                        <li class="user-row" id='chat_user_7' data-user-id='7'>
                            <div class="user-img">
                                <a href="#"><img src="img/avatar-2.png" alt=""></a>
                            </div>
                            <div class="user-info">
                                <h4><a href="#">Linette Lheureux</a></h4>
                                <span class="status busy" data-status="busy"> Busy</span>
                            </div>
                            <div class="user-status busy">
                                <i class="fa fa-circle"></i>
                            </div>
                        </li>
                        <li class="user-row" id='chat_user_8' data-user-id='8'>
                            <div class="user-img">
                                <a href="#"><img src="img/avatar-3.png" alt=""></a>
                            </div>
                            <div class="user-info">
                                <h4><a href="#">Araceli Boatright</a></h4>
                                <span class="status away" data-status="away"> Away</span>
                            </div>
                            <div class="user-status away">
                                <i class="fa fa-circle"></i>
                            </div>
                        </li>
                        <li class="user-row" id='chat_user_9' data-user-id='9'>
                            <div class="user-img">
                                <a href="#"><img src="img/avatar-4.png" alt=""></a>
                            </div>
                            <div class="user-info">
                                <h4><a href="#">Clay Peskin</a></h4>
                                <span class="status busy" data-status="busy"> Busy</span>
                            </div>
                            <div class="user-status busy">
                                <i class="fa fa-circle"></i>
                            </div>
                        </li>
                        <li class="user-row" id='chat_user_10' data-user-id='10'>
                            <div class="user-img">
                                <a href="#"><img src="img/avatar-5.png" alt=""></a>
                            </div>
                            <div class="user-info">
                                <h4><a href="#">Loni Tindall</a></h4>
                                <span class="status away" data-status="away"> Away</span>
                            </div>
                            <div class="user-status away">
                                <i class="fa fa-circle"></i>
                            </div>
                        </li>
                        <li class="user-row" id='chat_user_11' data-user-id='11'>
                            <div class="user-img">
                                <a href="#"><img src="img/avatar-1.png" alt=""></a>
                            </div>
                            <div class="user-info">
                                <h4><a href="#">Tanisha Kimbro</a></h4>
                                <span class="status idle" data-status="idle"> Idle</span>
                            </div>
                            <div class="user-status idle">
                                <i class="fa fa-circle"></i>
                            </div>
                        </li>
                        <li class="user-row" id='chat_user_12' data-user-id='12'>
                            <div class="user-img">
                                <a href="#"><img src="img/avatar-2.png" alt=""></a>
                            </div>
                            <div class="user-info">
                                <h4><a href="#">Jovita Tisdale</a></h4>
                                <span class="status idle" data-status="idle"> Idle</span>
                            </div>
                            <div class="user-status idle">
                                <i class="fa fa-circle"></i>
                            </div>
                        </li>

                    </ul>
                </div>

            </div>


            <div class="chatapi-windows ">


            </div>    </div>
        <!-- END CONTAINER -->
        <!-- LOAD FILES AT PAGE END FOR FASTER LOADING -->


        <!-- CORE JS FRAMEWORK - START --> 
        <script src="js/jquery-1.11.2.min.js" type="text/javascript"></script> 
        <script src="js/jquery.easing.min.js" type="text/javascript"></script> 
        <script src="js/bootstrap.min.js" type="text/javascript"></script> 
        <script src="js/pace.min.js" type="text/javascript"></script>  
        <script src="js/perfect-scrollbar.min.js" type="text/javascript"></script> 
        <script src="js/viewportchecker.js" type="text/javascript"></script>  
        <!-- CORE JS FRAMEWORK - END --> 


        <!-- OTHER SCRIPTS INCLUDED ON THIS PAGE - START --> 
        <script src="js/d3.v3.js" type="text/javascript"></script> <script src="js/jquery-ui.min.js" type="text/javascript"></script> <script src="js/Rickshaw.All.js"></script><script src="js/jquery.sparkline.min.js" type="text/javascript"></script><script src="js/jquery.easypiechart.min.js" type="text/javascript"></script><script src="js/raphael-min.js" type="text/javascript"></script><script src="js/morris.min.js" type="text/javascript"></script><script src="js/jquery-jvectormap-2.0.1.min.js" type="text/javascript"></script><script src="js/jquery-jvectormap-world-mill-en.js" type="text/javascript"></script><script src="js/gauge.min.js" type="text/javascript"></script><script src="js/icheck.min.js" type="text/javascript"></script><script src="js/uni-dashboard.js" type="text/javascript"></script><!-- OTHER SCRIPTS INCLUDED ON THIS PAGE - END --> 


        <!-- CORE TEMPLATE JS - START --> 
        <script src="js/scripts.js" type="text/javascript"></script> 
        <!-- END CORE TEMPLATE JS - END --> 

        <!-- Sidebar Graph - START --> 
        <script src="js/jquery.sparkline.min" type="text/javascript"></script>
        <script src="js/chart-sparkline.js" type="text/javascript"></script>
        <!-- Sidebar Graph - END --> 













        <!-- General section box modal start -->
        <div class="modal" id="section-settings" tabindex="-1" role="dialog" aria-labelledby="ultraModal-Label" aria-hidden="true">
            <div class="modal-dialog animated bounceInDown">
                <div class="modal-content">
                    <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                        <h4 class="modal-title">Section Settings</h4>
                    </div>
                    <div class="modal-body">

                        Body goes here...

                    </div>
                    <div class="modal-footer">
                        <button data-dismiss="modal" class="btn btn-default" type="button">Close</button>
                        <button class="btn btn-success" type="button">Save changes</button>
                    </div>
                </div>
            </div>
        </div>
        <!-- modal end -->
    </body>
</html>





