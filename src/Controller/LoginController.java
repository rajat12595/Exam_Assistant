package Controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import VO.UserVO;
import DAO.UserDAO;

/**
 * Servlet implementation class LoginController
 */
@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginController() {
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
		String flag=request.getParameter("loginflag");
		if(flag.equals("checklogin"))
		{
			check(request,response);
		}
		
	}

	private void check(HttpServletRequest request, HttpServletResponse response) throws IOException {
		// TODO Auto-generated method stub
		String userlogin=request.getParameter("userlogin");
		String  passwordlogin=request.getParameter("passwordlogin");
		
		UserVO userVO=new UserVO();
		userVO.setEmail(userlogin);
		userVO.setPswd(passwordlogin);
		
		List ls;
		
		UserDAO userDAO=new UserDAO();
		ls=userDAO.loginSearch(userVO);
		
		HttpSession session=request.getSession();
		session.setAttribute("username",userlogin);
		if(ls.size()>= 1){
			
			session.setAttribute("userList", ls);
			response.sendRedirect("Project_Admin/index.jsp");
			System.out.println("login is done");
		}
		
		else{
			session.setAttribute("k", "yoo");
			System.out.println("login is wrong -> done");
			response.sendRedirect("Project_Admin/login2.jsp");
		}

		
		}
		
		
	}


