            <div class="page-sidebar ">

                <!-- MAIN MENU - START -->
                <div class="page-sidebar-wrapper" id="main-menu-wrapper"> 
                			

                    <!-- USER INFO - START -->
                    <div class="profile-info row">

                        <div class="profile-image col-md-4 col-sm-4 col-xs-4">
                            
                                <img src="img/LJIETLOGO.png" class="img-responsive img-circle">
                            
                        </div>

                        <div class="profile-details col-md-8 col-sm-8 col-xs-8">

                            <h4><b>Prof. ${sessionScope.loginobj.fname} ${sessionScope.loginobj.lname} </b>
                                

                                <!-- Available statuses: online, idle, busy, away and offline -->
                                <span class="profile-status online"></span>
                            </h4>

                            <p class="profile-title">${sessionScope.usertype }</p>

                        </div>

                    </div>
                    <!-- USER INFO - END -->



                    <ul class='wraplist'>	


                        <li class=""> 
                            <a href="index.jsp">
                                <i class="fa fa-dashboard"></i>
                                <span class="title">Dashboard</span>
                            </a>
                        </li>
                        
                     
                        <li class=""> 
                            <a href="javascript:;">
                                <i class="fa fa-university"></i>
                                <span class="title">Branch </span>
                                <span class="arrow "></span>
                            </a>
                            <ul class="sub-menu" >
                                <li>
                                    <a class="" href="manage_branch.jsp" >Add Branch</a>
                                </li>
                                <li>
                                    <a class="" href="<%=request.getContextPath()%>/BranchController?flag=SearchBranch" >Search Branch</a>
                                </li>
                            </ul>
                        </li>
                        
                        
                        <li class=""> 
                            <a href="javascript:;">
                                <i class="fa fa-book"></i>
                                <span class="title">Semester</span>
                                <span class="arrow "></span>
                            </a>
                            <ul class="sub-menu" >
                                
                                <li>
                                    <a class="" href="<%=request.getContextPath()%>/SemesterController?flag=Add">Add Semester</a>
                                </li>
                                <li>
                                    <a class="" href="<%=request.getContextPath()%>/SemesterController?flag=SearchSemester" >Search Semester</a>
                                </li>
                            </ul>
                        </li>
                        
                        
                        
                        <li class=""> 
                            <a href="javascript:;">
                                <i class="fa fa-graduation-cap"></i>
                                <span class="title">Exams</span>
                                <span class="arrow "></span>
                            </a>
                            <ul class="sub-menu" >
                                
                                <li>
                                    <a class="" href="<%=request.getContextPath()%>/ExamController?flag=Add" >Add Exam</a>
                                </li>
                                <li>
                                    <a class="" href="<%=request.getContextPath()%>/ExamController?flag=Search" >Search Exam</a>
                                </li>
                               <!--  <li>
                                    <a class="" href="uni-course-info.html" >Course Info</a>
                                </li> -->
                            </ul>
                        </li>
                        
                        <li class=""> 
                            <a href="javascript:;">
                                <i class="fa fa-users"></i>
                                <span class="title">Staff</span>
                                <span class="arrow "></span>
                            </a>
                            <ul class="sub-menu" >
                                
                                
                                <li>
                                    <a class="" href="<%=request.getContextPath()%>/StaffController?flag=Add" >Add Staff Member</a>
                                </li>
                                <li>
                                    <a class="" href="<%=request.getContextPath()%>/StaffController?flag=SearchStaff" >Search Staff Member</a>
                                </li>
                                <li>
                                   <a href="javascript:;">
                                		
                                		<span class="title">Faculty</span>
                                		<span class="arrow "></span>
                            		</a>
                                    <ul class="sub-menu" >
                                    		<a class="" href="<%=request.getContextPath()%>/FacultyController?flag=AddSchedule" >Add Schedule</a>
                                    		<a class="" href="<%=request.getContextPath()%>/FacultyController?flag=SearchSchedule" >View Schedule</a>
                                    		<a class="" href="<%=request.getContextPath()%>/FacultyController?flag=Add" >Add Allocation</a>
                                    		<a class="" href="<%=request.getContextPath()%>/FacultyController?flag=Search" >View Allocation</a>
                                    		
                                	</ul>
                                </li>
                                
                                <li>
                                   <a href="javascript:;">
                                		
                                		<span class="title">Post</span>
                                		<span class="arrow "></span>
                            		</a>
                                    <ul class="sub-menu" >
                                    		<a class="" href="manage_post.jsp" >Add Post</a>
                                    		<a class="" href="<%=request.getContextPath()%>/PostController?flag=SearchPost" >Search Post</a>
                                	</ul>
                                </li>
                                <li>
                                   <a href="javascript:;">
                                		
                                		<span class="title">Wages</span>
                                		<span class="arrow "></span>
                            		</a>
                                    <ul class="sub-menu" >
                                    		<a class="" href="<%=request.getContextPath()%>/WagesController?flag=Add" >Add Wages</a>
                                    		<a class="" href="<%=request.getContextPath()%>/WagesController?flag=SearchWages" >Search Wages</a>
                                	</ul>
                                </li>
                                </li>
                            </ul>
                        </li>
                        
                       
                        <li class=""> 
                            <a href="javascript:;">
                                <i class="fa fa-users"></i>
                                <span class="title">Professors</span>
                                <span class="arrow "></span>
                            </a>
                            <ul class="sub-menu" >
                                
                                <li>
                                    <a class="" href="<%=request.getContextPath()%>/AddProfessorController?flag=Add" >Add Professor</a>
                                </li>
                                <li>
                                    <a class="" href="<%=request.getContextPath()%>/AddProfessorController?flag=SearchProfessor" >Search Professor</a>
                                </li>
                                
                            </ul>
                        </li>
                        
                        <li class=""> 
                            <a href="javascript:;">
                                <i class="fa fa-graduation-cap"></i>
                                <span class="title">Class</span>
                                <span class="arrow "></span>
                            </a>
                            <ul class="sub-menu" >
                                
                                <li>
                                    <a class="" href="manage_class.jsp" >Add Class</a>
                                </li>
                                <li>
                                    <a class="" href="<%=request.getContextPath()%>/ClassController?flag=Search" >Search Class</a>
                                </li>
                               <!--  <li>
                                    <a class="" href="uni-course-info.html" >Course Info</a>
                                </li> -->
                            </ul>
                        </li>
                        
                        <li class=""> 
                            <a href="javascript:;">
                                <i class="fa fa-university"></i>
                                <span class="title">Block</span>
                                <span class="arrow "></span>
                             </a>
                            <ul class="sub-menu" >
                               
                                <li>
                                    <a class="" href="<%=request.getContextPath()%>/ClassBlockController?flag=Add" >Add Block</a>
                                </li>
                                <li>
                                    <a class="" href="<%=request.getContextPath()%>/ClassBlockController?flag=SearchBlock" >Search Block</a>
                                </li>
                                
                            </ul>
                        </li>
                        
                        <li class=""> 
                            <a href="javascript:;">
                                <i class="fa fa-bar-chart"></i>
                                <span class="title">Feedback Form</span>
                                <span class="arrow "></span>
                            </a>
                            <ul class="sub-menu" >
                                <li>
                                    <a class="" href="add_payslip.jsp" >Add Feedback</a>
                                </li>
                                <li>
                                    <a class="" href="<%=request.getContextPath()%>/payslipgenerator" >View Feedback</a>
                                </li>
                                                            </ul>
                        </li>
                        
                        
                        
                                                
                        
                    </ul>

                </div>
                <!-- MAIN MENU - END -->



                


            </div>