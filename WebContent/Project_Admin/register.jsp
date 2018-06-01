<!DOCTYPE html>
<html><head><meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta charset="UTF-8">
    <title>Exam Assistant Login </title>
    
    
    
    
        <style>
      /* NOTE: The styles were added inline because Prefixfree needs access to your styles and they must be inlined if they are on local disk! */
      @import url(http://fonts.googleapis.com/css?family=Exo:100,200,400);
@import url(http://fonts.googleapis.com/css?family=Source+Sans+Pro:700,400,300);

body{
	margin: 0;
	padding: 0;
	background: #fff;
	font-weight: bold;
	color: #14b1e4;
	font-family: Arial;
	font-size: 16px;
	
}

.body{
	position: absolute;
	top: -10px;
	left: -20px;
	right: -40px;
	bottom: -40px;
	width: auto;
	height: auto;
	background-image: url(img/LJ4.jpg);
	background-size: cover;
	-webkit-filter: blur(5px);
	z-index: 0;
}

.grad{
	position: absolute;
	top: -20px;
	left: -20px;
	right: -40px;
	bottom: -40px;
	width: auto;
	height: auto;
	background: -webkit-gradient(linear, left top, left bottom, color-stop(0%,rgba(0,0,0,0)), color-stop(100%,rgba(0,0,0,0.65))); /* Chrome,Safari4+ */
	z-index: 1;
	opacity: 0.7;
}

.header{
	left:calc(50% - 100px);
	position: absolute;
	z-index: 2;
	top:10px;
	
}

.header div{
	float: left;
	color: #fff;
	font-family: 'Exo', sans-serif;
	font-size: 35px;
	font-weight: 200;
	font-weight: bold
}

.header div span{
	color: #5379fa !important;
}

.header2{
float:right;
}


.header2 div{
	float: left;
	color: #fff;
	font-family: 'Exo', sans-serif;
	font-size: 15px;
	font-weight: 200;
	font-weight: bold
}

.header2 div span{
	color: #5379fa !important;
}


.login{
	position: absolute;
	top:60px;
	height: 150px;
	width: 350px;
	padding: 10px;
	z-index: 2;
	left:42%;
}

.login input[type=text]{
	width: 250px;
	height: 15px;
	border: 1px solid rgba(255,255,255,0.6);
	border-radius: 2px;
	color: #000;
	background:transparent;
	font-family: 'Exo', sans-serif;
	font-size: 16px;
	font-weight: 400;
	padding: 4px;
}

.login input[type=date]{

	width: 250px;
	height: 15px;
	border: 1px solid rgba(255,255,255,0.6);
	border-radius: 2px;
	color: #000;
	font-family: 'Exo', sans-serif;
	font-size: 16px;
	font-weight: 400;
	padding: 4px;
	background:transparent;
}


.login input[type=tel]{

	width: 250px;
	height: 15px;
	border: 1px solid rgba(255,255,255,0.6);
	border-radius: 2px;
	color: #000;
	font-family: 'Exo', sans-serif;
	font-size: 16px;
	font-weight: 400;
	padding: 4px;
	background:transparent;
}

.login input[type=email]{
	width: 250px;
	height: 15px;
	border: 1px solid rgba(255,255,255,0.6);
	border-radius: 2px;
	color: #000;
	font-family: 'Exo', sans-serif;
	font-size: 16px;
	font-weight: 400;
	padding: 4px;
	background:transparent;


}
.login input[type=password]{
	width: 250px;
	height: 15px;
	border: 1px solid rgba(255,255,255,0.6);
	border-radius: 2px;
	color: #000;
	font-family: 'Exo', sans-serif;
	background:transparent;
	font-size: 16px;
	font-weight: 400;
	padding: 4px;
	margin-top: 10px;
}

.login input[type=button]{
	width: 260px;
	height: 35px;
	background: #fff;
	border: 1px solid #fff;
	cursor: pointer;
	border-radius: 2px;
	color: #a18d6c;
	font-family: 'Exo', sans-serif;
	font-size: 16px;
	font-weight: 400;
	padding: 6px;
	margin-top: 10px;
}

.login input[type=button]:hover{
	opacity: 0.8;
}

.login input[type=button]:active{
	opacity: 0.6;
}

.login input[type=text]:focus{
	outline: none;
	border: 1px solid rgba(255,255,255,0.9);
}

.login input[type=password]:focus{
	outline: none;
	border: 1px solid rgba(255,255,255,0.9);
}

.login input[type=button]:focus{
	outline: none;
}

::-webkit-input-placeholder{
   color: rgba(255,255,255,0.6);
}

::-moz-input-placeholder{
   color: rgba(255,255,255,0.6);
}
    </style>

    
        <script src="js/prefixfree.min.js"></script>

    
  </head>

  <body>

    <div class="body"></div>
		<div class="grad"></div>
		<div class="header">
			<div>Exam<span>  Assistant</span></div>
		</div>

		<div class="login">
	           <form action ="<%=request.getContextPath()%>/UserController" method="post">

				<input type="hidden" name="flag" value="InsertUser"/> 

                                            <div class="form-group">
                                              
               <label class="form-label" for="field-1">		First Name &nbsp &nbsp &nbsp</label>
                <input type="text" value="" class="form-control" name="fname" required>
                                            </div>
<br>

                                            <div class="form-group">
                                              
                                    <label class="form-label" for="field-1">	Last Name&nbsp &nbsp &nbsp</label>
                                    <input type="text" name="lname" value="" class="form-control" id="field-1" required>
                                            </div>
<br>

                                            <div class="form-group">
                                                <span class="desc"></span>
                                                <div class="controls">
                   <label class="form-label" for="field-1">Email</label><br>
                   <input type="email" name="email"  class="form-control" id="field-3"  required>
                                                </div>
                                            </div>
    <br>                                        
    
                                                <div class="form-group">
                                                <span class="desc"></span>
                                                <div class="controls">
                                                <label class="form-label" for="field-1">Password </label>   <br>
                                                <input title="Password must contain at least 6 characters, including UPPER/lowercase and numbers" type="password" name="pswd" class="form-control" id="field-2" pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{6,}" name="pwd1" onchange="form.cpwd.pattern = this.value;" required>
                                                </div>
                                            </div>
            <br>                                
                                            <div class="form-group">
                                             <label class="form-label" for="field-1">Confirm Password</label> 
                                              <input title="Please enter the same Password" type="password" name="cpswd" value="" class="form-control" id="field-21" pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{6,}" required>
              <br>                             
    
				<br>
                                            <div class="form-group">
                                                
                                                <div class="controls">
                                                Date Of Birth    <br>
                                                <input type="date" name="dob" class="form-control datepicker" data-format="dd/mm/yyyy" value="" placeholder="dd/mm/yyyy" required>
                                                </div>
                                            </div>
                                            
                <br>
                							
                                            <div class="form-group">
                                                <label class="form-label" for="field-2">Phone</label>
                                                <span class="desc"></span>
                                                <div class="controls">
                                                    <input type="text" value="" class="form-control" id="field-2" data-mask="phone"  placeholder="(999) 999-9999" name="Phone" required>
                                                </div>
                                            </div>
<br>
                                            <div class="form-group">
                                                <label class="form-label" for="field-5">Gender &nbsp &nbsp &nbsp &nbsp&nbsp</label>
                                                <span class="desc"></span>
                                                <select name="gender" class="form-control" required>
                                                    <option>Select</option>
                                                    <option value="M">Male</option>
                                                    <option value="F">Female</option>
                                                </select>
                                            </div>
    <br>                                        
                                            <div class="form-group">
                                                <label class="form-label" for="field-5">Department &nbsp</label>
                                                <span  class="desc"></span>
                                                <select name="dept" class="form-control " required>
                                                    <option>Select</option>
                                                    <option  value="IT">IT</option>
                                                    <option value="CE">CE</option>
                                                    <option value="EC">EC</option>
                                                    <option value="IC">IC</option>
                                                    <option value="ICT">ICT</option>
                                                    <option value="Civil">Civil</option>
                                                    <option value="Mechnical">Mechnical</option>
                                                    <option value="Auto">Auto</option>
                                                    
                                                </select>
                                            </div>
<br>
                                            <div class="form-group">
                                           Position &nbsp &nbsp &nbsp &nbsp     
                                                   <select name="position" class="form-control " required>
                                                    <option>Select</option>
                                                    <option  value="HOD">HOD</option>
                                                    <option value="External Faculty">External Faculty</option>
                                                     <option  value="Director">Director</option>
                                                   </select>
                                           
                                           
                                                </div>
              
<br>

        <br>                                    
                                        <input type="submit" value="Register"/> <div class="header2"><a class="a" href="login2.jsp"><div> <span>Login Here!</span></div></a>
		</div>
                                       </form>
               		
		
		</div>
    <script src="./Random Login Form_files/jquery.min.js"></script>

</body></html>