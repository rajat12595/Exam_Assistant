            <div class="page-sidebar ">

                <!-- MAIN MENU - START -->
                <div class="page-sidebar-wrapper" id="main-menu-wrapper"> 

                    <!-- USER INFO - START -->
                    <div class="profile-info row">

                        <div class="profile-image col-md-4 col-sm-4 col-xs-4">
                            <a href="ui-profile.html">
                                <img src="img/profile-university.jpg" class="img-responsive img-circle">
                            </a>
                        </div>

                        <div class="profile-details col-md-8 col-sm-8 col-xs-8">

                            <h4><b>Prof. ${sessionScope.username}</b>
                                

                                <!-- Available statuses: online, idle, busy, away and offline -->
                                <span class="profile-status online"></span>
                            </h4>

                            <p class="profile-title">Head of Engg.</p>

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
                                <i class="fa fa-graduation-cap"></i>
                                <span class="title">Exams</span>
                                <span class="arrow "></span>
                            </a>
                            <ul class="sub-menu" >
                                
                                <li>
                                    <a class="" href="<%=request.getContextPath()%>/ExamController?flag=hodSearch" >Search Exam</a>
                                </li>
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
                                   <a href="javascript:;">
                                		
                                		<span class="title">Faculty</span>
                                		<span class="arrow "></span>
                            		</a>
                                    <ul class="sub-menu" >
                                    		<a class="" href="enterFacultyShedule.jsp" >Faculty Schedule</a>
                                 	</ul>
                                </li>
                                
                                
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
                                    <a class="" href="<%=request.getContextPath()%>/ClassBlockController?flag=SearchBlock" >Search Block</a>
                                </li>
                                
                            </ul>
                        </li>
                        
                                                
                    </ul>

                </div>
                <!-- MAIN MENU - END -->



                


            </div>