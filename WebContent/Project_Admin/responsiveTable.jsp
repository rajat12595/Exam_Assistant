<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html class=" ">
    <head>
        <!-- 
         * @Package: Ultra Admin - Responsive Theme
         * @Subpackage: Bootstrap
         * @Version: 4.1
         * This file is part of Ultra Admin Theme.
        -->
        <meta http-equiv="content-type" content="text/html;charset=UTF-8" />
        <meta charset="utf-8" />
        <title>Ultra Admin : Responsive Tables</title>
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
        <link href="css/rwd-table.min.css" rel="stylesheet" type="text/css" media="screen"/>        <!-- OTHER SCRIPTS INCLUDED ON THIS PAGE - END --> 


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
                                <h1 class="title">Responsive Tables</h1>                            </div>

                            <div class="pull-right hidden-xs">
                                <ol class="breadcrumb">
                                    <li>
                                        <a href="index.jsp"><i class="fa fa-home"></i>Home</a>
                                    </li>
                                    <li>
                                        <a href="tables-basic.html">Tables</a>
                                    </li>
                                    <li class="active">
                                        <strong>Responsive Tables</strong>
                                    </li>
                                </ol>
                            </div>

                        </div>
                    </div>
                    <div class="clearfix"></div>

                    <div class="col-lg-12">
                        <section class="box ">
                            <header class="panel_header">
                                <h2 class="title pull-left">Responsive Table - Focus & Select Columns</h2>
                                <div class="actions panel_actions pull-right">
                                    <i class="box_toggle fa fa-chevron-down"></i>
                                    <i class="box_setting fa fa-cog" data-toggle="modal" href="#section-settings"></i>
                                    <i class="box_close fa fa-times"></i>
                                </div>
                            </header>
                            <div class="content-body">    <div class="row">
                                    <div class="col-md-12 col-sm-12 col-xs-12">

                                        <div class="table-responsive" data-pattern="priority-columns">
                                            <table cellspacing="0" id="tech-companies-1" class="table table-small-font table-bordered table-striped">
                                                <thead>
                                                    <tr>
                                                        <th>Company</th>
                                                        <th data-priority="1">Last Trade</th>
                                                        <th data-priority="3">Trade Time</th>
                                                        <th data-priority="1">Change</th>
                                                        <th data-priority="3">Prev Close</th>
                                                        <th data-priority="3">Open</th>
                                                        <th data-priority="6">Bid</th>
                                                        <th data-priority="6">Ask</th>
                                                        <th data-priority="6">1y Target Est</th>
                                                        <th data-priority="6">Lorem</th>
                                                        <th data-priority="6">Ipsum</th>
                                                    </tr>
                                                </thead>
                                                <tbody>
                                                    <tr>
                                                        <th>GOOG <span class="co-name">Google Inc.</span></th>
                                                        <td>597.74</td>
                                                        <td>12:12PM</td>
                                                        <td>14.81 (2.54%)</td>
                                                        <td>582.93</td>
                                                        <td>597.95</td>
                                                        <td>597.73 x 100</td>
                                                        <td>597.91 x 300</td>
                                                        <td>731.10</td>
                                                        <td colspan="2">Spanning cell</td>
                                                    </tr>      
                                                    <tr>
                                                        <th>AAPL <span class="co-name">Apple Inc.</span></th>
                                                        <td>378.94</td>
                                                        <td>12:22PM</td>
                                                        <td>5.74 (1.54%)</td>
                                                        <td>373.20</td>
                                                        <td>381.02</td>
                                                        <td>378.92 x 300</td>
                                                        <td>378.99 x 100</td>
                                                        <td>505.94</td>
                                                        <td colspan="2">Spanning cell</td>
                                                    </tr>      
                                                    <tr>
                                                        <th>AMZN <span class="co-name">Amazon.com Inc.</span></th>
                                                        <td>191.55</td>
                                                        <td>12:23PM</td>
                                                        <td>3.16 (1.68%)</td>
                                                        <td>188.39</td>
                                                        <td>194.99</td>
                                                        <td>191.52 x 300</td>
                                                        <td>191.58 x 100</td>
                                                        <td>240.32</td>
                                                        <td colspan="2">Spanning cell</td>  
                                                    </tr>       
                                                    <tr>
                                                        <th>ORCL <span class="co-name">Oracle Corporation</span></th>
                                                        <td>31.15</td>
                                                        <td>12:44PM</td>
                                                        <td>1.41 (4.72%)</td>
                                                        <td>29.74</td>
                                                        <td>30.67</td>
                                                        <td>31.14 x 6500</td>
                                                        <td>31.15 x 3200</td>
                                                        <td>36.11</td>
                                                        <td colspan="2">Spanning cell</td>
                                                    </tr>      
                                                    <tr>
                                                        <th>MSFT <span class="co-name">Microsoft Corporation</span></th>
                                                        <td>25.50</td>
                                                        <td>12:27PM</td>
                                                        <td>0.66 (2.67%)</td>
                                                        <td>24.84</td>
                                                        <td>25.37</td>
                                                        <td>25.50 x 71100</td>
                                                        <td>25.51 x 17800</td>
                                                        <td>31.50</td>
                                                        <td>Non-spanning</td>
                                                        <td>Non-spanning</td>  
                                                    </tr>
                                                    <tr>
                                                        <th>CSCO <span class="co-name">Cisco Systems, Inc.</span></th>
                                                        <td>18.65</td>
                                                        <td>12:45PM</td>
                                                        <td>0.97 (5.49%)</td>
                                                        <td>17.68</td>
                                                        <td>18.23</td>
                                                        <td>18.65 x 10300</td>
                                                        <td>18.66 x 24000</td>
                                                        <td>21.12</td>
                                                        <td>Non-spanning</td>
                                                        <td>Non-spanning</td>  
                                                    </tr>      
                                                    <tr>
                                                        <th>YHOO <span class="co-name">Yahoo! Inc.</span></th>
                                                        <td>15.81</td>
                                                        <td>12:25PM</td>
                                                        <td>0.11 (0.67%)</td>
                                                        <td>15.70</td>
                                                        <td>15.94</td>
                                                        <td>15.79 x 6100</td>
                                                        <td>15.80 x 17000</td>
                                                        <td>18.16</td>
                                                        <td>Non-spanning</td>
                                                        <td>Non-spanning</td>         
                                                    </tr>
                                                    <!-- Repeat -->
                                                    <tr>
                                                        <th>GOOG <span class="co-name">Google Inc.</span></th>
                                                        <td>597.74</td>
                                                        <td>12:12PM</td>
                                                        <td>14.81 (2.54%)</td>
                                                        <td>582.93</td>
                                                        <td>597.95</td>
                                                        <td>597.73 x 100</td>
                                                        <td>597.91 x 300</td>
                                                        <td>731.10</td>
                                                        <td colspan="2">Spanning cell</td>
                                                    </tr>      
                                                    <tr>
                                                        <th>AAPL <span class="co-name">Apple Inc.</span></th>
                                                        <td>378.94</td>
                                                        <td>12:22PM</td>
                                                        <td>5.74 (1.54%)</td>
                                                        <td>373.20</td>
                                                        <td>381.02</td>
                                                        <td>378.92 x 300</td>
                                                        <td>378.99 x 100</td>
                                                        <td>505.94</td>
                                                        <td colspan="2">Spanning cell</td>
                                                    </tr>      
                                                    <tr>
                                                        <th>AMZN <span class="co-name">Amazon.com Inc.</span></th>
                                                        <td>191.55</td>
                                                        <td>12:23PM</td>
                                                        <td>3.16 (1.68%)</td>
                                                        <td>188.39</td>
                                                        <td>194.99</td>
                                                        <td>191.52 x 300</td>
                                                        <td>191.58 x 100</td>
                                                        <td>240.32</td>
                                                        <td colspan="2">Spanning cell</td>  
                                                    </tr>       
                                                    <tr>
                                                        <th>ORCL <span class="co-name">Oracle Corporation</span></th>
                                                        <td>31.15</td>
                                                        <td>12:44PM</td>
                                                        <td>1.41 (4.72%)</td>
                                                        <td>29.74</td>
                                                        <td>30.67</td>
                                                        <td>31.14 x 6500</td>
                                                        <td>31.15 x 3200</td>
                                                        <td>36.11</td>
                                                        <td colspan="2">Spanning cell</td>
                                                    </tr>      
                                                    <tr>
                                                        <th>MSFT <span class="co-name">Microsoft Corporation</span></th>
                                                        <td>25.50</td>
                                                        <td>12:27PM</td>
                                                        <td>0.66 (2.67%)</td>
                                                        <td>24.84</td>
                                                        <td>25.37</td>
                                                        <td>25.50 x 71100</td>
                                                        <td>25.51 x 17800</td>
                                                        <td>31.50</td>
                                                        <td>Non-spanning</td>
                                                        <td>Non-spanning</td>  
                                                    </tr>
                                                    <tr>
                                                        <th>CSCO <span class="co-name">Cisco Systems, Inc.</span></th>
                                                        <td>18.65</td>
                                                        <td>12:45PM</td>
                                                        <td>0.97 (5.49%)</td>
                                                        <td>17.68</td>
                                                        <td>18.23</td>
                                                        <td>18.65 x 10300</td>
                                                        <td>18.66 x 24000</td>
                                                        <td>21.12</td>
                                                        <td>Non-spanning</td>
                                                        <td>Non-spanning</td>  
                                                    </tr>      
                                                    <tr>
                                                        <th>YHOO <span class="co-name">Yahoo! Inc.</span></th>
                                                        <td>15.81</td>
                                                        <td>12:25PM</td>
                                                        <td>0.11 (0.67%)</td>
                                                        <td>15.70</td>
                                                        <td>15.94</td>
                                                        <td>15.79 x 6100</td>
                                                        <td>15.80 x 17000</td>
                                                        <td>18.16</td>
                                                        <td>Non-spanning</td>
                                                        <td>Non-spanning</td>         
                                                    </tr>
                                                    <!-- Repeat -->
                                                    <tr>
                                                        <th>GOOG <span class="co-name">Google Inc.</span></th>
                                                        <td>597.74</td>
                                                        <td>12:12PM</td>
                                                        <td>14.81 (2.54%)</td>
                                                        <td>582.93</td>
                                                        <td>597.95</td>
                                                        <td>597.73 x 100</td>
                                                        <td>597.91 x 300</td>
                                                        <td>731.10</td>
                                                        <td colspan="2">Spanning cell</td>
                                                    </tr>      
                                                    <tr>
                                                        <th>AAPL <span class="co-name">Apple Inc.</span></th>
                                                        <td>378.94</td>
                                                        <td>12:22PM</td>
                                                        <td>5.74 (1.54%)</td>
                                                        <td>373.20</td>
                                                        <td>381.02</td>
                                                        <td>378.92 x 300</td>
                                                        <td>378.99 x 100</td>
                                                        <td>505.94</td>
                                                        <td colspan="2">Spanning cell</td>
                                                    </tr>      
                                                    <tr>
                                                        <th>AMZN <span class="co-name">Amazon.com Inc.</span></th>
                                                        <td>191.55</td>
                                                        <td>12:23PM</td>
                                                        <td>3.16 (1.68%)</td>
                                                        <td>188.39</td>
                                                        <td>194.99</td>
                                                        <td>191.52 x 300</td>
                                                        <td>191.58 x 100</td>
                                                        <td>240.32</td>
                                                        <td colspan="2">Spanning cell</td>  
                                                    </tr>       
                                                    <tr>
                                                        <th>ORCL <span class="co-name">Oracle Corporation</span></th>
                                                        <td>31.15</td>
                                                        <td>12:44PM</td>
                                                        <td>1.41 (4.72%)</td>
                                                        <td>29.74</td>
                                                        <td>30.67</td>
                                                        <td>31.14 x 6500</td>
                                                        <td>31.15 x 3200</td>
                                                        <td>36.11</td>
                                                        <td colspan="2">Spanning cell</td>
                                                    </tr>      
                                                    <tr>
                                                        <th>MSFT <span class="co-name">Microsoft Corporation</span></th>
                                                        <td>25.50</td>
                                                        <td>12:27PM</td>
                                                        <td>0.66 (2.67%)</td>
                                                        <td>24.84</td>
                                                        <td>25.37</td>
                                                        <td>25.50 x 71100</td>
                                                        <td>25.51 x 17800</td>
                                                        <td>31.50</td>
                                                        <td>Non-spanning</td>
                                                        <td>Non-spanning</td>  
                                                    </tr>
                                                    <tr>
                                                        <th>CSCO <span class="co-name">Cisco Systems, Inc.</span></th>
                                                        <td>18.65</td>
                                                        <td>12:45PM</td>
                                                        <td>0.97 (5.49%)</td>
                                                        <td>17.68</td>
                                                        <td>18.23</td>
                                                        <td>18.65 x 10300</td>
                                                        <td>18.66 x 24000</td>
                                                        <td>21.12</td>
                                                        <td>Non-spanning</td>
                                                        <td>Non-spanning</td>  
                                                    </tr>      
                                                    <tr>
                                                        <th>YHOO <span class="co-name">Yahoo! Inc.</span></th>
                                                        <td>15.81</td>
                                                        <td>12:25PM</td>
                                                        <td>0.11 (0.67%)</td>
                                                        <td>15.70</td>
                                                        <td>15.94</td>
                                                        <td>15.79 x 6100</td>
                                                        <td>15.80 x 17000</td>
                                                        <td>18.16</td>
                                                        <td>Non-spanning</td>
                                                        <td>Non-spanning</td>         
                                                    </tr>
                                                    <!-- Repeat -->
                                                    <tr>
                                                        <th>GOOG <span class="co-name">Google Inc.</span></th>
                                                        <td>597.74</td>
                                                        <td>12:12PM</td>
                                                        <td>14.81 (2.54%)</td>
                                                        <td>582.93</td>
                                                        <td>597.95</td>
                                                        <td>597.73 x 100</td>
                                                        <td>597.91 x 300</td>
                                                        <td>731.10</td>
                                                        <td colspan="2">Spanning cell</td>
                                                    </tr>      
                                                    <tr>
                                                        <th>AAPL <span class="co-name">Apple Inc.</span></th>
                                                        <td>378.94</td>
                                                        <td>12:22PM</td>
                                                        <td>5.74 (1.54%)</td>
                                                        <td>373.20</td>
                                                        <td>381.02</td>
                                                        <td>378.92 x 300</td>
                                                        <td>378.99 x 100</td>
                                                        <td>505.94</td>
                                                        <td colspan="2">Spanning cell</td>
                                                    </tr>      
                                                    <tr>
                                                        <th>AMZN <span class="co-name">Amazon.com Inc.</span></th>
                                                        <td>191.55</td>
                                                        <td>12:23PM</td>
                                                        <td>3.16 (1.68%)</td>
                                                        <td>188.39</td>
                                                        <td>194.99</td>
                                                        <td>191.52 x 300</td>
                                                        <td>191.58 x 100</td>
                                                        <td>240.32</td>
                                                        <td colspan="2">Spanning cell</td>  
                                                    </tr>       
                                                    <tr>
                                                        <th>ORCL <span class="co-name">Oracle Corporation</span></th>
                                                        <td>31.15</td>
                                                        <td>12:44PM</td>
                                                        <td>1.41 (4.72%)</td>
                                                        <td>29.74</td>
                                                        <td>30.67</td>
                                                        <td>31.14 x 6500</td>
                                                        <td>31.15 x 3200</td>
                                                        <td>36.11</td>
                                                        <td colspan="2">Spanning cell</td>
                                                    </tr>      
                                                    <tr>
                                                        <th>MSFT <span class="co-name">Microsoft Corporation</span></th>
                                                        <td>25.50</td>
                                                        <td>12:27PM</td>
                                                        <td>0.66 (2.67%)</td>
                                                        <td>24.84</td>
                                                        <td>25.37</td>
                                                        <td>25.50 x 71100</td>
                                                        <td>25.51 x 17800</td>
                                                        <td>31.50</td>
                                                        <td>Non-spanning</td>
                                                        <td>Non-spanning</td>  
                                                    </tr>
                                                    <tr>
                                                        <th>CSCO <span class="co-name">Cisco Systems, Inc.</span></th>
                                                        <td>18.65</td>
                                                        <td>12:45PM</td>
                                                        <td>0.97 (5.49%)</td>
                                                        <td>17.68</td>
                                                        <td>18.23</td>
                                                        <td>18.65 x 10300</td>
                                                        <td>18.66 x 24000</td>
                                                        <td>21.12</td>
                                                        <td>Non-spanning</td>
                                                        <td>Non-spanning</td>  
                                                    </tr>      
                                                    <tr>
                                                        <th>YHOO <span class="co-name">Yahoo! Inc.</span></th>
                                                        <td>15.81</td>
                                                        <td>12:25PM</td>
                                                        <td>0.11 (0.67%)</td>
                                                        <td>15.70</td>
                                                        <td>15.94</td>
                                                        <td>15.79 x 6100</td>
                                                        <td>15.80 x 17000</td>
                                                        <td>18.16</td>
                                                        <td>Non-spanning</td>
                                                        <td>Non-spanning</td>         
                                                    </tr>
                                                    <!-- Repeat -->
                                                    <tr>
                                                        <th>GOOG <span class="co-name">Google Inc.</span></th>
                                                        <td>597.74</td>
                                                        <td>12:12PM</td>
                                                        <td>14.81 (2.54%)</td>
                                                        <td>582.93</td>
                                                        <td>597.95</td>
                                                        <td>597.73 x 100</td>
                                                        <td>597.91 x 300</td>
                                                        <td>731.10</td>
                                                        <td colspan="2">Spanning cell</td>
                                                    </tr>      
                                                    <tr>
                                                        <th>AAPL <span class="co-name">Apple Inc.</span></th>
                                                        <td>378.94</td>
                                                        <td>12:22PM</td>
                                                        <td>5.74 (1.54%)</td>
                                                        <td>373.20</td>
                                                        <td>381.02</td>
                                                        <td>378.92 x 300</td>
                                                        <td>378.99 x 100</td>
                                                        <td>505.94</td>
                                                        <td colspan="2">Spanning cell</td>
                                                    </tr>      
                                                    <tr>
                                                        <th>AMZN <span class="co-name">Amazon.com Inc.</span></th>
                                                        <td>191.55</td>
                                                        <td>12:23PM</td>
                                                        <td>3.16 (1.68%)</td>
                                                        <td>188.39</td>
                                                        <td>194.99</td>
                                                        <td>191.52 x 300</td>
                                                        <td>191.58 x 100</td>
                                                        <td>240.32</td>
                                                        <td colspan="2">Spanning cell</td>  
                                                    </tr>       
                                                    <tr>
                                                        <th>ORCL <span class="co-name">Oracle Corporation</span></th>
                                                        <td>31.15</td>
                                                        <td>12:44PM</td>
                                                        <td>1.41 (4.72%)</td>
                                                        <td>29.74</td>
                                                        <td>30.67</td>
                                                        <td>31.14 x 6500</td>
                                                        <td>31.15 x 3200</td>
                                                        <td>36.11</td>
                                                        <td colspan="2">Spanning cell</td>
                                                    </tr>      
                                                    <tr>
                                                        <th>MSFT <span class="co-name">Microsoft Corporation</span></th>
                                                        <td>25.50</td>
                                                        <td>12:27PM</td>
                                                        <td>0.66 (2.67%)</td>
                                                        <td>24.84</td>
                                                        <td>25.37</td>
                                                        <td>25.50 x 71100</td>
                                                        <td>25.51 x 17800</td>
                                                        <td>31.50</td>
                                                        <td>Non-spanning</td>
                                                        <td>Non-spanning</td>  
                                                    </tr>
                                                    <tr>
                                                        <th>CSCO <span class="co-name">Cisco Systems, Inc.</span></th>
                                                        <td>18.65</td>
                                                        <td>12:45PM</td>
                                                        <td>0.97 (5.49%)</td>
                                                        <td>17.68</td>
                                                        <td>18.23</td>
                                                        <td>18.65 x 10300</td>
                                                        <td>18.66 x 24000</td>
                                                        <td>21.12</td>
                                                        <td>Non-spanning</td>
                                                        <td>Non-spanning</td>  
                                                    </tr>      
                                                    <tr>
                                                        <th>YHOO <span class="co-name">Yahoo! Inc.</span></th>
                                                        <td>15.81</td>
                                                        <td>12:25PM</td>
                                                        <td>0.11 (0.67%)</td>
                                                        <td>15.70</td>
                                                        <td>15.94</td>
                                                        <td>15.79 x 6100</td>
                                                        <td>15.80 x 17000</td>
                                                        <td>18.16</td>
                                                        <td>Non-spanning</td>
                                                        <td>Non-spanning</td>         
                                                    </tr>
                                                </tbody>
                                            </table>
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
        <script src="js/rwd-table.min.js" type="text/javascript"></script><!-- OTHER SCRIPTS INCLUDED ON THIS PAGE - END --> 


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



