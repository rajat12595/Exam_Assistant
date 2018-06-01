package Controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.LoginDAO;
import DAO.UserDAO;
import VO.LoginVO;
import VO.UserVO;

/**
 * Servlet implementation class UserController
 */
@WebServlet("/UserController")
public class UserController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String flag=request.getParameter("flag");
		System.out.println("Controller");
		if(flag.equals("InsertUser"))
		{
			System.out.println("Controller2");
			
			insert(request,response);
			System.out.println("Controller3");
		}
		
	}

	private void insert(HttpServletRequest request, HttpServletResponse response) throws IOException {
		// TODO Auto-generated method stub
		String fname=request.getParameter("fname");
		String lname=request.getParameter("lname");
		String email=request.getParameter("email");
		String pswd=request.getParameter("pswd");

		String department=request.getParameter("department");
		String dob=request.getParameter("dob");
		long phone=Long.parseLong(request.getParameter("Phone"));
		String position=request.getParameter("position");
		
		
		LoginVO loginVO=new LoginVO();
		loginVO.setUsername(email);
		loginVO.setPassword(pswd);
		loginVO.setUserType(position);
		LoginDAO loginDAO=new LoginDAO();
		loginDAO.insertUser(loginVO);
		
		UserVO userVO=new UserVO();
		userVO.setDepartment(department);
		userVO.setDob(dob);
		userVO.setEmail(email);
		userVO.setFname(fname);
		userVO.setLname(lname);
		userVO.setPhone(phone);
		userVO.setPosition(position);
		userVO.setPswd(pswd);
		
		UserDAO userdao=new UserDAO();
		userdao.insertUser(userVO);
		
		response.sendRedirect("Project_Admin/login2.jsp");
		
	}

}
