package Filter;

import java.io.IOException;
import java.util.List;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import DAO.ClassBlockDAO;
import DAO.ClassDAO;
import DAO.LoginDAO;
import DAO.UserDAO;
import VO.LoginVO;
import VO.UserVO;



/**
 * Servlet Filter implementation class LoginFilter
 */
@WebFilter("/*")
public class LoginFilter implements Filter {

    /**
     * Default constructor. 
     */
    public LoginFilter() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		// place your code here

		// pass the request along the filter chain
		HttpSession session =((HttpServletRequest) request).getSession();
		RequestDispatcher requestDispatcher;
		String flag = request.getParameter("flag");
		
		String uri = ((HttpServletRequest)request).getRequestURI();
		
		if(uri.contains("register")||uri.contains("/css") || uri.contains("/js") && !uri.contains(".jsp") || uri.contains("/img")|| uri.contains("/fonts") ||uri.contains("/register.jsp") ||uri.contains("/UserController") || uri.contains("RegController"))
		{
			//System.out.println("inside reg");
			
			//requestDispatcher = request.getRequestDispatcher("/user/register.jsp");  
			//requestDispatcher.forward(request,response);  
			
			chain.doFilter(request,response);
			
		}
		
		else if (flag!= null && flag.equals("logout")) {
			//session.removeAttribute("userID");
			//System.out.println("logout in else if");
		
			session.invalidate();
			requestDispatcher = request.getRequestDispatcher("/Project_Admin/login2.jsp");
			requestDispatcher.forward(request, response);
			
		}
		else if(flag != null && flag.equals("login") )
		{
			//System.out.println("Login");
			
			String emailId = request.getParameter("emailId");
			String password = request.getParameter("password");
			System.out.println(emailId+""+password);
			
			LoginVO LoginVO = new LoginVO();
			LoginVO.setUsername(emailId);
			LoginVO.setPassword(password);
			
			LoginDAO loginDAO = new LoginDAO();
			List list =  loginDAO.authentication(LoginVO);
			
			if(list != null && list.size()>=1){
				
				//Iterator itr = list.iterator();
				
				//while(itr.hasNext()){
				LoginVO user=(LoginVO) list.get(0);
				
				long y = user.getLoginId();
				session.setAttribute("userID",y);
				
				System.out.println(user.getUserType());
			//	System.out.println(session.getAttribute("userId"));
				String type = user.getUserType();
				session.setAttribute("usertype",type);
				System.out.println(y);
				if(type.equalsIgnoreCase("admin"))
				{
					requestDispatcher = request.getRequestDispatcher("/Admin/index.jsp");  
					requestDispatcher.forward(request,response);
				}
				else if(type.equalsIgnoreCase("Director"))
				{
					UserVO userVO=new UserVO();
					userVO.setEmail(emailId);
					System.out.println(userVO.getFname());
					UserDAO userDAO=new UserDAO();
					List ls=userDAO.headerSearch(userVO);
					System.out.println(ls);
					if(ls!=null)
					session.setAttribute("loginobj", ls.get(0));
					
					//for chart
					ClassBlockDAO blockDAO = new ClassBlockDAO();
					session.setAttribute("lschart",blockDAO.searchForChart());
					
					ClassDAO classDAO = new  ClassDAO();
					List classls = classDAO.SearchClass();
					session.setAttribute("classtbl", classls);
					
					
					//
					
					
					
					
					
					requestDispatcher = request.getRequestDispatcher("/Project_Admin/index.jsp");  
					requestDispatcher.forward(request,response);
				}
				else if(type.equalsIgnoreCase("user"))
				{
					requestDispatcher = request.getRequestDispatcher("/user/index.jsp");  
					requestDispatcher.forward(request,response);
				}
				else
				{
					requestDispatcher = request.getRequestDispatcher("/Project_Admin/login2.jsp");  
					requestDispatcher.forward(request,response);  
				}
			}
			else
			{
				requestDispatcher = request.getRequestDispatcher("/Project_Admin/login2.jsp");
				requestDispatcher.forward(request,response);  		
			}	
		}
		else if(session.getAttribute("userID") != null)
		{
			String h = (String)session.getAttribute("usertype");
			//System.out.println("type = = = " + h);
			
			if(h!=null && h.equals("admin")){
				
			//System.out.println("chain");
			chain.doFilter(request,response);
			}
			
			else if(h!=null && h.equals("Director"))
			{
				//System.out.println("chain");
				chain.doFilter(request, response);
			}
			else if(h!=null && h.equals("user"))
			{
				//System.out.println("chain");
				chain.doFilter(request, response);
			}
			else
			{
				RequestDispatcher rd = request.getRequestDispatcher("/user/error.jsp");  
				rd.forward(request,response);
			}
		}
		else
		{
			RequestDispatcher rd = request.getRequestDispatcher("/Project_Admin/login2.jsp");  
			rd.forward(request,response);  
			
		}
	}


	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
