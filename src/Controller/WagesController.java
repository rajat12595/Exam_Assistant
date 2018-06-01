package Controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import DAO.PostDAO;
import DAO.ExamDAO;
import DAO.WagesDAO;
import VO.ExamVO;
import VO.PostVO;
import VO.WagesVO;

/**
 * Servlet implementation class WagesController
 */
@WebServlet("/WagesController")
public class WagesController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public WagesController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String flag= request.getParameter("flag");
		System.out.println(flag);
		
		
		if(flag.equals("Add"))
		{
			Add(request,response);
			System.out.println(flag);
		}
		
		
		
		if(flag.equals("EditWages"))
		{
			Edit(request,response);
			System.out.println(flag);
			
		}
		
		
		if(flag.equals("DeleteWages"))
		{
			Delete(request,response);
			System.out.println(flag);
		}
		
		if(flag.equals("SearchWages"))
		{
			Search(request,response);
			System.out.println(flag);
			
		}
		
	}

	
	private void Add(HttpServletRequest request, HttpServletResponse response) throws IOException {
		// TODO Auto-generated method stub
		HttpSession session=request.getSession();
		PostDAO postdao= new PostDAO();
		List ls=new ArrayList();
		ls=postdao.SearchPost();
		session.setAttribute("postlist", ls);
		response.sendRedirect("Project_Admin/manageWages.jsp");
	}
	
	
	
	
	private void Delete(HttpServletRequest request, HttpServletResponse response) throws IOException {
		// TODO Auto-generated method stub
		
		int wagesId=Integer.parseInt(request.getParameter("id"));
		WagesVO wagesVO=new WagesVO();
		wagesVO.setWagesId(wagesId);
		WagesDAO wagesDAO=new WagesDAO();
		wagesDAO.DeleteWages(wagesVO);
		Search(request, response);
		
	}

	private void Search(HttpServletRequest request, HttpServletResponse response) throws IOException {
		// TODO Auto-generated method stub
		WagesDAO wagesDAO=new WagesDAO();
		List ls=wagesDAO.SearchWages();
		HttpSession session=request.getSession();
		session.setAttribute("wagesList", ls);
		response.sendRedirect("Project_Admin/wages_dataTable.jsp");

		
		}

	private void Edit(HttpServletRequest request, HttpServletResponse response) throws IOException {
		// TODO Auto-generated method stub
		int id=Integer.parseInt(request.getParameter("id"));
		WagesVO wagesVO=new WagesVO();
		wagesVO.setWagesId(id);
		WagesDAO wagesDAO=new WagesDAO();
		List ls=wagesDAO.EditWages(wagesVO);
		HttpSession session=request.getSession();
		session.setAttribute("WagesList", ls);
		response.sendRedirect("Project_Admin/manage_editWages.jsp");
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String flag= request.getParameter("flag");
		if(flag.equals("UpdateWages"))
		{
			System.out.println(flag);
			String wagesPost= request.getParameter("WagesPost");
			String wagesAmount= request.getParameter("WagesAmount");
			int id=Integer.parseInt(request.getParameter("WagesId"));
			WagesVO wagesVO=new WagesVO();
			wagesVO.setWagesId(id);

			
			
			//wagesVO.setWagesPost(wagesPost);
			wagesVO.setWagesAmount(wagesAmount);
			
			
			WagesDAO wagesDAO=new WagesDAO();
			wagesDAO.UpdateWages(wagesVO);
			Search(request, response);
			//response.sendRedirect("Project_Admin/manage_editWages.jsp");

		} 
		
		if(flag.equals("InsertWages"))
		{
			System.out.println(flag);
			int wagesPost=Integer.parseInt(request.getParameter("WagesPost")); 
			String wagesAmount= request.getParameter("WagesAmount");
			
			PostVO postVO=new PostVO();
			postVO.setPostId(wagesPost);
			
			WagesVO wagesVO=new WagesVO();
			wagesVO.setPostVO(postVO);
			wagesVO.setWagesAmount(wagesAmount);
			
			
			WagesDAO wagesDAO=new WagesDAO();
			wagesDAO.insertWages(wagesVO);
			
			response.sendRedirect("Project_Admin/manageWages.jsp");
			//Search(request, response);
		}
	}

	

}
