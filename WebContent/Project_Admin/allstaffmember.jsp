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
        <title>Ultra Admin : Staffs</title>
        <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no" />
        <meta content="" name="description" />
        <meta content="" name="author" />

        <link rel="shortcut icon" href="img/favicon.png" type="image/x-icon" />    <!-- Favicon -->
        <link rel="apple-touch-icon-precomposed" href="img/apple-touch-icon-57-precomposed.png">	<!-- For iPhone -->
        <link rel="apple-touch-icon-precomposed" sizes="114x114" href="img/apple-touch-icon-114-precomposed.png">    <!-- For iPhone 4 Retina display -->
        <link rel="apple-touch-icon-precomposed" sizes="72x72" href="img/apple-touch-icon-72-precomposed.png">    <!-- For iPad -->
        <link rel="apple-touch-icon-precomposed" sizes="144x144" href="img/apple-touch-icon-144-precomposed.png">    <!-- For iPad Retina display -->




        <!-- CORE CSS FRAMEWORK - START -->
        <link href="css/pace-theme-flash.css" rel="stylesheet" type="text/css" media="screen"/>
        <link href="css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <link href="css/bootstrap-theme.min.css" rel="stylesheet" type="text/css"/>
        <link href="css/font-awesome.css" rel="stylesheet" type="text/css"/>
        <link href="css/animate.min.css" rel="stylesheet" type="text/css"/>
        <link href="css/perfect-scrollbar.css" rel="stylesheet" type="text/css"/>
        <!-- CORE CSS FRAMEWORK - END -->

        <!-- OTHER SCRIPTS INCLUDED ON THIS PAGE - START --> 
        <!-- OTHER SCRIPTS INCLUDED ON THIS PAGE - END --> 


        <!-- CORE CSS TEMPLATE - START -->
        <link href="css/style.css" rel="stylesheet" type="text/css"/>
        <link href="css/responsive.css" rel="stylesheet" type="text/css"/>
        <!-- CORE CSS TEMPLATE - END -->

    </head>
    <!-- END HEAD -->

    <!-- BEGIN BODY -->
    <body class=" ">
    <!-- START TOPBAR -->
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
                                <h1 class="title">Staffs</h1>                            </div>

                            <div class="pull-right hidden-xs">
                                <ol class="breadcrumb">
                                    <li>
                                        <a href="index.jsp"><i class="fa fa-home"></i>Home</a>
                                    </li>
                                    <li>
                                        <a href="uni-staffs.html">Staff</a>
                                    </li>
                                    <li class="active">
                                        <strong>All Staff Members</strong>
                                    </li>
                                </ol>
                            </div>

                        </div>
                    </div>
                    <div class="clearfix"></div>

                    <div class="col-lg-12">
                        <section class="box ">
                            <header class="panel_header">
                                <h2 class="title pull-left">All Staffs</h2>
                                <div class="actions panel_actions pull-right">
                                    <i class="box_toggle fa fa-chevron-down"></i>
                                    <i class="box_setting fa fa-cog" data-toggle="modal" href="#section-settings"></i>
                                    <i class="box_close fa fa-times"></i>
                                </div>
                            </header>
                            <div class="content-body">    <div class="row">
                                    <div class="col-md-12 col-sm-12 col-xs-12">

                                        <div class="row">


                                            <div class="col-lg-6 col-sm-12 col-md-6 col-md-12 music_genre">
                                                <div class="team-member col">
                                                    <div class="team-img col-lg-4 col-md-4 col-sm-4 col-xs-4">
                                                        <img class="img-responsive" src="img/staff-1.jpg" alt="">
                                                    </div>                         <div class="team-info col-lg-8 col-md-8 col-sm-8 col-xs-8">
                                                        <h4>


                                                            <a href="uni-staff-profile.html">
                                                                Mrs. Brodeur</a>


                                                        </h4>

                                                        <span class='team-member-edit'><a href="uni-staff-edit.html"><i class='fa fa-pencil icon-xs'></i></a></span>

                                                        <span>Assistant, Library<br>
                                                            <small>Age:</small> 45 yrs<br>
                                                            <small>Phone:</small> +1 233 454 4343<br>
                                                            <small>Email:</small> email@example.com</span>
                                                    </div>

                                                    <p>
                                                </div>
                                            </div>


                                            <div class="col-lg-6 col-sm-12 col-md-6 col-md-12 music_genre">
                                                <div class="team-member col">
                                                    <div class="team-img col-lg-4 col-md-4 col-sm-4 col-xs-4">
                                                        <img class="img-responsive" src="img/staff-2.jpg" alt="">
                                                    </div>                         <div class="team-info col-lg-8 col-md-8 col-sm-8 col-xs-8">
                                                        <h4>


                                                            <a href="uni-staff-profile.html">
                                                                Ms. Latshaw</a>


                                                        </h4>

                                                        <span class='team-member-edit'><a href="uni-staff-edit.html"><i class='fa fa-pencil icon-xs'></i></a></span>

                                                        <span>Dept. Head, Administration<br>
                                                            <small>Age:</small> 39 yrs<br>
                                                            <small>Phone:</small> +1 233 454 4343<br>
                                                            <small>Email:</small> email@example.com</span>
                                                    </div>

                                                    <p>
                                                </div>
                                            </div>


                                            <div class="col-lg-6 col-sm-12 col-md-6 col-md-12 music_genre">
                                                <div class="team-member col">
                                                    <div class="team-img col-lg-4 col-md-4 col-sm-4 col-xs-4">
                                                        <img class="img-responsive" src="img/staff-3.jpg" alt="">
                                                    </div>                         <div class="team-info col-lg-8 col-md-8 col-sm-8 col-xs-8">
                                                        <h4>


                                                            <a href="uni-staff-profile.html">
                                                                Mrs. Clementina</a>


                                                        </h4>

                                                        <span class='team-member-edit'><a href="uni-staff-edit.html"><i class='fa fa-pencil icon-xs'></i></a></span>

                                                        <span>Manager, Housekeeping<br>
                                                            <small>Age:</small> 34 yrs<br>
                                                            <small>Phone:</small> +1 233 454 4343<br>
                                                            <small>Email:</small> email@example.com</span>
                                                    </div>

                                                    <p>
                                                </div>
                                            </div>


                                            <div class="col-lg-6 col-sm-12 col-md-6 col-md-12 music_genre">
                                                <div class="team-member col">
                                                    <div class="team-img col-lg-4 col-md-4 col-sm-4 col-xs-4">
                                                        <img class="img-responsive" src="img/staff-4.jpg" alt="">
                                                    </div>                         <div class="team-info col-lg-8 col-md-8 col-sm-8 col-xs-8">
                                                        <h4>


                                                            <a href="uni-staff-profile.html">
                                                                Mr. Carri Busey</a>


                                                        </h4>

                                                        <span class='team-member-edit'><a href="uni-staff-edit.html"><i class='fa fa-pencil icon-xs'></i></a></span>

                                                        <span>Manager, Library<br>
                                                            <small>Age:</small> 29 yrs<br>
                                                            <small>Phone:</small> +1 233 454 4343<br>
                                                            <small>Email:</small> email@example.com</span>
                                                    </div>

                                                    <p>
                                                </div>
                                            </div>


                                            <div class="col-lg-6 col-sm-12 col-md-6 col-md-12 music_genre">
                                                <div class="team-member col">
                                                    <div class="team-img col-lg-4 col-md-4 col-sm-4 col-xs-4">
                                                        <img class="img-responsive" src="img/staff-5.jpg" alt="">
                                                    </div>                         <div class="team-info col-lg-8 col-md-8 col-sm-8 col-xs-8">
                                                        <h4>


                                                            <a href="uni-staff-profile.html">
                                                                Ms. Clay Dock</a>


                                                        </h4>

                                                        <span class='team-member-edit'><a href="uni-staff-edit.html"><i class='fa fa-pencil icon-xs'></i></a></span>

                                                        <span>Clerk, Library<br>
                                                            <small>Age:</small> 65 yrs<br>
                                                            <small>Phone:</small> +1 233 454 4343<br>
                                                            <small>Email:</small> email@example.com</span>
                                                    </div>

                                                    <p>
                                                </div>
                                            </div>


                                            <div class="col-lg-6 col-sm-12 col-md-6 col-md-12 music_genre">
                                                <div class="team-member col">
                                                    <div class="team-img col-lg-4 col-md-4 col-sm-4 col-xs-4">
                                                        <img class="img-responsive" src="img/staff-6.jpg" alt="">
                                                    </div>                         <div class="team-info col-lg-8 col-md-8 col-sm-8 col-xs-8">
                                                        <h4>


                                                            <a href="uni-staff-profile.html">
                                                                Mr. Mark Peskin</a>


                                                        </h4>

                                                        <span class='team-member-edit'><a href="uni-staff-edit.html"><i class='fa fa-pencil icon-xs'></i></a></span>

                                                        <span>Assistant, Mechanical Lab<br>
                                                            <small>Age:</small> 57 yrs<br>
                                                            <small>Phone:</small> +1 233 454 4343<br>
                                                            <small>Email:</small> email@example.com</span>
                                                    </div>

                                                    <p>
                                                </div>
                                            </div>


                                            <div class="col-lg-6 col-sm-12 col-md-6 col-md-12 music_genre">
                                                <div class="team-member col">
                                                    <div class="team-img col-lg-4 col-md-4 col-sm-4 col-xs-4">
                                                        <img class="img-responsive" src="img/staff-7.jpg" alt="">
                                                    </div>                         <div class="team-info col-lg-8 col-md-8 col-sm-8 col-xs-8">
                                                        <h4>


                                                            <a href="uni-staff-profile.html">
                                                                Mr. Arthur John.</a>


                                                        </h4>

                                                        <span class='team-member-edit'><a href="uni-staff-edit.html"><i class='fa fa-pencil icon-xs'></i></a></span>

                                                        <span>Assistant, Electronics Lab<br>
                                                            <small>Age:</small> 65 yrs<br>
                                                            <small>Phone:</small> +1 233 454 4343<br>
                                                            <small>Email:</small> email@example.com</span>
                                                    </div>

                                                    <p>
                                                </div>
                                            </div>


                                            <div class="col-lg-6 col-sm-12 col-md-6 col-md-12 music_genre">
                                                <div class="team-member col">
                                                    <div class="team-img col-lg-4 col-md-4 col-sm-4 col-xs-4">
                                                        <img class="img-responsive" src="img/staff-8.jpg" alt="">
                                                    </div>                         <div class="team-info col-lg-8 col-md-8 col-sm-8 col-xs-8">
                                                        <h4>


                                                            <a href="uni-staff-profile.html">
                                                                Mr. Carri Busey</a>


                                                        </h4>

                                                        <span class='team-member-edit'><a href="uni-staff-edit.html"><i class='fa fa-pencil icon-xs'></i></a></span>

                                                        <span>Assistant, Computer Lab<br>
                                                            <small>Age:</small> 29 yrs<br>
                                                            <small>Phone:</small> +1 233 454 4343<br>
                                                            <small>Email:</small> email@example.com</span>
                                                    </div>

                                                    <p>
                                                </div>
                                            </div>


                                            <div class="col-lg-6 col-sm-12 col-md-6 col-md-12 music_genre">
                                                <div class="team-member col">
                                                    <div class="team-img col-lg-4 col-md-4 col-sm-4 col-xs-4">
                                                        <img class="img-responsive" src="img/staff-9.jpg" alt="">
                                                    </div>                         <div class="team-info col-lg-8 col-md-8 col-sm-8 col-xs-8">
                                                        <h4>


                                                            <a href="uni-staff-profile.html">
                                                                Ms. Clay Dock</a>


                                                        </h4>

                                                        <span class='team-member-edit'><a href="uni-staff-edit.html"><i class='fa fa-pencil icon-xs'></i></a></span>

                                                        <span>Front Desk, Administration<br>
                                                            <small>Age:</small> 65 yrs<br>
                                                            <small>Phone:</small> +1 233 454 4343<br>
                                                            <small>Email:</small> email@example.com</span>
                                                    </div>

                                                    <p>
                                                </div>
                                            </div>


                                            <div class="col-lg-6 col-sm-12 col-md-6 col-md-12 music_genre">
                                                <div class="team-member col">
                                                    <div class="team-img col-lg-4 col-md-4 col-sm-4 col-xs-4">
                                                        <img class="img-responsive" src="img/staff-10.jpg" alt="">
                                                    </div>                         <div class="team-info col-lg-8 col-md-8 col-sm-8 col-xs-8">
                                                        <h4>


                                                            <a href="uni-staff-profile.html">
                                                                Mr. Mark Peskin</a>


                                                        </h4>

                                                        <span class='team-member-edit'><a href="uni-staff-edit.html"><i class='fa fa-pencil icon-xs'></i></a></span>

                                                        <span>Assistant, Sports<br>
                                                            <small>Age:</small> 57 yrs<br>
                                                            <small>Phone:</small> +1 233 454 4343<br>
                                                            <small>Email:</small> email@example.com</span>
                                                    </div>

                                                    <p>
                                                </div>
                                            </div>


                                            <div class="col-lg-6 col-sm-12 col-md-6 col-md-12 music_genre">
                                                <div class="team-member col">
                                                    <div class="team-img col-lg-4 col-md-4 col-sm-4 col-xs-4">
                                                        <img class="img-responsive" src="img/staff-11.jpg" alt="">
                                                    </div>                         <div class="team-info col-lg-8 col-md-8 col-sm-8 col-xs-8">
                                                        <h4>


                                                            <a href="uni-staff-profile.html">
                                                                Mr. Arthur John.</a>


                                                        </h4>

                                                        <span class='team-member-edit'><a href="uni-staff-edit.html"><i class='fa fa-pencil icon-xs'></i></a></span>

                                                        <span>Clerk, Administration<br>
                                                            <small>Age:</small> 65 yrs<br>
                                                            <small>Phone:</small> +1 233 454 4343<br>
                                                            <small>Email:</small> email@example.com</span>
                                                    </div>

                                                    <p>
                                                </div>
                                            </div>


                                            <div class="col-lg-6 col-sm-12 col-md-6 col-md-12 music_genre">
                                                <div class="team-member col">
                                                    <div class="team-img col-lg-4 col-md-4 col-sm-4 col-xs-4">
                                                        <img class="img-responsive" src="img/staff-12.jpg" alt="">
                                                    </div>                         <div class="team-info col-lg-8 col-md-8 col-sm-8 col-xs-8">
                                                        <h4>


                                                            <a href="uni-staff-profile.html">
                                                                Mrs. Jonh A.</a>


                                                        </h4>

                                                        <span class='team-member-edit'><a href="uni-staff-edit.html"><i class='fa fa-pencil icon-xs'></i></a></span>

                                                        <span>Assistant, Front Desk<br>
                                                            <small>Age:</small> 29 yrs<br>
                                                            <small>Phone:</small> +1 233 454 4343<br>
                                                            <small>Email:</small> email@example.com</span>
                                                    </div>

                                                    <p>
                                                </div>
                                            </div>
                                        </div>

                                    </div>
                                </div>
                            </div>
                        </section></div>


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
        <!-- OTHER SCRIPTS INCLUDED ON THIS PAGE - END --> 


        <!-- CORE TEMPLATE JS - START --> 
        <script src="js/scripts.js" type="text/javascript"></script> 
        <!-- END CORE TEMPLATE JS - END --> 

        <!-- Sidebar Graph - START --> 
        <script src="js/jquery.sparkline.min.js" type="text/javascript"></script>
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




