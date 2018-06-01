<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
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
        <title>Feedback Form</title>
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
        <link href="css/datepicker.css" rel="stylesheet" type="text/css" media="screen"/>        <!-- OTHER SCRIPTS INCLUDED ON THIS PAGE - END --> 


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
                                <h1 class="title">Feedback Form</h1>                            </div>

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
                    <div class="col-lg-12 col-md-12 col-xs-12 col-sm-12">
                        <section class="box ">
                            
                            <div class="content-body">
                                <div class="row">
                                    <form action ="<%=request.getContextPath()%>/payslipgenerator" method="get">
                                        <div class="col-lg-8 col-md-8 col-sm-9 col-xs-12">

                                            <div class="form-group">
                                                <label class="form-label" for="field-1">Name</label>
                                                <span class="desc"></span>
                                                <div class="controls">
                                                    <input type="text" name="name" value="" class="form-control" id="field-1">
                                                </div>
                                            </div>
                                            
                                            <div class="form-group">
                                                <label class="form-label" for="field-5">Address</label>
                                                <!--  <span class="desc">e.g. "04/03/2015"</span> -->
                                                <div class="controls">
                                                	  	<textarea class="form-control autogrow" name="address" cols="5" id="field-5"></textarea>
                                                 </div>
                                            </div>
                                            
                                            <div class="form-group">
                                                <label class="form-label" for="field-1">Parent Institute Code</label>
                                                <span class="desc"></span>
                                                <div class="controls">
                                                    <input type="text" name="parentInstituteCode" value="" class="form-control" id="field-1">
                                                </div>
                                            </div>
                                            
                                            <div class="form-group">
                                                <label class="form-label" for="field-1">Internal Examinar Name</label>
                                                <span class="desc"></span>
                                                <div class="controls">
                                                    <input type="text" name="internalExaminarName" value="" class="form-control" id="field-1">
                                                </div>
                                            </div>
                                            
                                            <div class="form-group">
                                                <label class="form-label" for="field-1">Exam Center Code</label>
                                                <span class="desc"></span>
                                                <div class="controls">
                                                    <input type="text" name="examCenterCode" value="" class="form-control" id="field-1">
                                                </div>
                                            </div>
                                            
                                            <div class="form-group">
                                                <label class="form-label" for="field-1">Subject Name</label>
                                                <span class="desc"></span>
                                                <div class="controls">
                                                    <input type="text" name="subjectName" value="" class="form-control" id="field-1">
                                                </div>
                                            </div>
                                            
                                            <div class="form-group">
                                                <label class="form-label" for="field-1">Subject Code</label>
                                                <span class="desc"></span>
                                                <div class="controls">
                                                    <input type="text" name="subjectCode" value="" class="form-control" id="field-1">
                                                </div>
                                            </div>
                                            
                                            <div class="form-group">
                                                <label class="form-label" for="field-5">Date</label>
                                                <span class="desc">dd/mm/yyyy</span>
                                                <div class="controls">
                                                    <input type="text" value="date" class="form-control datepicker" data-format="dd/mm/yyyy" value="" name="ExamDate">
                                                </div>
                                            </div>
                                            
                                            <div class="form-group">
                                                <label class="form-label" for="field-1">Number Of Students appered in Prectical Exam</label>
                                                <span class="desc"></span>
                                                <div class="controls">
                                                    <input type="text" name="numberOfStudents" value="" class="form-control" id="field-1">
                                                </div>
                                            </div>
                                            
                                            <div class="form-group">
                                                <label class="form-label" for="field-1">Number Of Experiments done During Term</label>
                                                <span class="desc"></span>
                                                <div class="controls">
                                                    <input type="text" name="numberOfExperiments" value="" class="form-control" id="field-1">
                                                </div>
                                            </div>
                                            
                                            <div class="form-group">
                                                <label class="form-label" for="field-1">Knowledge Level</label>
                                                <span class="desc"></span>
                                        		<select class="form-control" name="knowledgeLevel">
                                                    
                                                    <option>----select----</option>
                                                    <option value="Excellent">Excellent</option>
                                                    <option value="VGood">V.Good</option>
                                                    <option value="Good">Good</option>
                                                    <option value="Poor">Poor</option>
                                                    
												</select>
                                		   </div>
                                		   
                                		   <div class="form-group">
                                                <label class="form-label" for="field-1">Skill Level</label>
                                                <span class="desc"></span>
                                        		<select class="form-control" name="skillLevel">
                                                    
                                                    <option>----select----</option>
                                                    <option value="Excellent">Excellent</option>
                                                    <option value="VGood">V.Good</option>
                                                    <option value="Good">Good</option>
                                                    <option value="Poor">Poor</option>
                                                    
												</select>
                                		   </div>
                                		   
                                		   <div class="form-group">
                                                <label class="form-label" for="field-1">Literature Survey</label>
                                                <span class="desc"></span>
                                        		<select class="form-control" name="literatureSurvey">
                                                    
                                                    <option>----select----</option>
                                                    <option value="Excellent">Excellent</option>
                                                    <option value="VGood">V.Good</option>
                                                    <option value="Good">Good</option>
                                                    <option value="Poor">Poor</option>
                                                    
												</select>
                                		   </div>
                                		   
                                		   <div class="form-group">
                                                <label class="form-label" for="field-1">If any Other Please Specify</label>
                                                <span class="desc"></span>
                                                <div class="controls">
                                                    <input type="text" name="ifAnyOther" value="" class="form-control" id="field-1">
                                                </div>
                                            </div>
                                            
                                            <div class="form-group">
                                                <label class="form-label" for="field-1">Availability of Separate Lab for the Subject</label>
                                                <span class="desc"></span>
                                        		<select class="form-control" name="availabilityOfLab">
                                                    
                                                    <option>----select----</option>
                                                    <option value="Yes">Yes</option>
                                                    <option value="No">No</option>
                                                    
												</select>
                                		   </div>
                                		   
                                		   <div class="form-group">
                                                <label class="form-label" for="field-1">Regular Lab Assistant appointed</label>
                                                <span class="desc"></span>
                                        		<select class="form-control" name="regularLabAssistant">
                                                    
                                                    <option>----select----</option>
                                                    <option value="Yes">Yes</option>
                                                    <option value="No">No</option>
                                                    
												</select>
                                		   </div>
                                		   
                                		   <div class="form-group">
                                                <label class="form-label" for="field-1">Laboratory Infrastructural Facility</label>
                                                <span class="desc"></span>
                                        		<select class="form-control" name="labInfrastructuralFacility">
                                                    
                                                    <option>----select----</option>
                                                    <option value="Excellent">Excellent</option>
                                                    <option value="VGood">V.Good</option>
                                                    <option value="Good">Good</option>
                                                    <option value="Poor">Poor</option>
                                                    
												</select>
                                		   </div>
                                		   
                                		   <div class="form-group">
                                                <label class="form-label" for="field-1">Laboratory Instruments</label>
                                                <span class="desc"></span>
                                        		<select class="form-control" name="labInstruments">
                                                    
                                                    <option>----select----</option>
                                                    <option value="Excellent">Excellent</option>
                                                    <option value="VGood">V.Good</option>
                                                    <option value="Good">Good</option>
                                                    <option value="Poor">Poor</option>
                                                    
												</select>
                                		   </div>
                                		   
                                		   <div class="form-group">
                                                <label class="form-label" for="field-1">Laboratory Equipments</label>
                                                <span class="desc"></span>
                                        		<select class="form-control" name="labEqipments">
                                                    
                                                    <option>----select----</option>
                                                    <option value="Excellent">Excellent</option>
                                                    <option value="VGood">V.Good</option>
                                                    <option value="Good">Good</option>
                                                    <option value="Poor">Poor</option>
                                                       
												</select>
                                		   </div>
                                		   
                                		   <div class="form-group">
                                                <label class="form-label" for="field-1">Laboratory Trainer Kits</label>
                                                <span class="desc"></span>
                                        		<select class="form-control" name="labTrainerKits">
                                                    
                                                    <option>----select----</option>
                                                    <option value="Excellent">Excellent</option>
                                                    <option value="VGood">V.Good</option>
                                                    <option value="Good">Good</option>
                                                    <option value="Poor">Poor</option>
                                                    
												</select>
                                		   </div>
                                		   
                                		   <div class="form-group">
                                                <label class="form-label" for="field-1">Laboratory Cleanliness</label>
                                                <span class="desc"></span>
                                        		<select class="form-control" name="labCleanliness">
                                                    
                                                    <option>----select----</option>
                                                    <option value="Excellent">Excellent</option>
                                                    <option value="VGood">V.Good</option>
                                                    <option value="Good">Good</option>
                                                    <option value="Poor">Poor</option>
                                                    
												</select>
                                		   </div>
                                		   
                                		   <div class="form-group">
                                                <label class="form-label" for="field-1">Cooperation of Principal</label>
                                                <span class="desc"></span>
                                        		<select class="form-control" name="cooperationOfPrinciple">
                                                    
                                                    <option>----select----</option>
                                                    <option value="Excellent">Excellent</option>
                                                    <option value="VGood">V.Good</option>
                                                    <option value="Good">Good</option>
                                                    <option value="Poor">Poor</option>
                                                    
												</select>
                                		   </div>
                                		   
                                		   <div class="form-group">
                                                <label class="form-label" for="field-1">Cooperation of HOD</label>
                                                <span class="desc"></span>
                                        		<select class="form-control" name="cooperationOfHod">
                                                    
                                                    <option>----select----</option>
                                                    <option value="Excellent">Excellent</option>
                                                    <option value="VGood">V.Good</option>
                                                    <option value="Good">Good</option>
                                                    <option value="Poor">Poor</option>
                                                    
												</select>
                                		   </div>
                                		   
                                		   <div class="form-group">
                                                <label class="form-label" for="field-1">Cooperation of Internal Examiner</label>
                                                <span class="desc"></span>
                                        		<select class="form-control" name="cooperationOfInternalExaminer">
                                                    
                                                    <option>----select----</option>
                                                    <option value="Excellent">Excellent</option>
                                                    <option value="VGood">V.Good</option>
                                                    <option value="Good">Good</option>
                                                    <option value="Poor">Poor</option>
                                                    
												</select>
                                		   </div>
                                		   <div class="form-group">
                                                <label class="form-label" for="field-1">Overall View for Student Performance</label>
                                                <span class="desc"></span>
                                        		<select class="form-control" name="overallView">
                                                    
                                                    <option>----select----</option>
                                                    <option value="Excellent">Excellent</option>
                                                    <option value="VGood">V.Good</option>
                                                    <option value="Good">Good</option>
                                                    <option value="Poor">Poor</option>
                                                    
												</select>
                                		   </div>
                                            
                                            <div class="form-group">
                                                <label class="form-label" for="field-5">Inovative Technique/Idea Observed related to Subject</label>
                                                
                                                <div class="controls">
                                                	  	<textarea class="form-control autogrow" name="inovativeIdea" cols="5" id="field-5"></textarea>
                                                 </div>
                                            </div>
                                   </div>

                                        <div class="col-lg-8 col-md-8 col-sm-9 col-xs-12 padding-bottom-30">
                                            <div class="text-left">
                                            <input type="hidden" value="insertpayslip" name="flag"/>
                                                <input type="submit" value="Submit"  class="btn btn-primary"/>
                                                <button type="button" class="btn">Cancel</button>
                                            </div>
                                        </div>
                                    </form>
                                </div>


                            </div>
                        </section></div>


                    
                </section>
            </section>
            <!-- END CONTENT -->
            

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
        <script src="js/datepicker.js" type="text/javascript"></script> <script src="js/autosize.min.js" type="text/javascript"></script><script src="js/jquery.inputmask.bundle.min.js" type="text/javascript"></script><!-- OTHER SCRIPTS INCLUDED ON THIS PAGE - END --> 


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



