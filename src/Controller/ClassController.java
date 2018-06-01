package Controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;



import DAO.ClassDAO;

import VO.ClassVo;




/**
 * Servlet implementation class ClassController
 */
@WebServlet("/ClassController")
public class ClassController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ClassController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String flag=request.getParameter("flag");
		if(flag.equals("Search"))
		{
			System.out.println(flag);
			Search(request,response);
		}
		
		
		else if(flag.equals("Delete"))
		{
			Delete(request, response);
			System.out.println(flag);
		}
		
		
		else if(flag.equals("EditClass"))
		{
			Edit(request,response);
			System.out.println(flag);
		}
	}

	private void Edit(HttpServletRequest request, HttpServletResponse response) throws IOException {
		// TODO Auto-generated method stub
		int id=Integer.parseInt(request.getParameter("id"));
		ClassVo classVo=new ClassVo();
		classVo.setClassId(id);
		
		ClassDAO classDAO=new ClassDAO();
		List ls=classDAO.EditClass(classVo);
		HttpSession session=request.getSession();
		session.setAttribute("ProfessorList", ls);
		response.sendRedirect("Project_Admin/manage_editprofessor.jsp");
	}

	private void Delete(HttpServletRequest request, HttpServletResponse response) throws IOException {
		// TODO Auto-generated method stub
		int classId=Integer.parseInt(request.getParameter("id"));
		ClassVo classVo=new ClassVo();
		classVo.setClassId(classId);
		ClassDAO classDAO=new ClassDAO();
		classDAO.DeleteClass(classVo);
		Search(request, response);
	}

	private void Search(HttpServletRequest request, HttpServletResponse response) throws IOException {
		// TODO Auto-generated method stub
		
		ClassDAO classDAO=new ClassDAO();
		List ls=classDAO.SearchClass();
		HttpSession session=request.getSession();
		session.setAttribute("classList", ls);
		response.sendRedirect("Project_Admin/class_dataTable.jsp");
				}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String flag= request.getParameter("flag");
		if(flag.equals("insertClass"))
		{
			System.out.println(flag);
			int classNumber= Integer.parseInt(request.getParameter("classNumber"));
			String classDes= request.getParameter("classDes");
			int classCapacity = Integer.parseInt(request.getParameter("classCapacity"));
			int classFloor = Integer.parseInt(request.getParameter("classFloor"));
			
			ClassVo classVo=new ClassVo();
			
			classVo.setClassDes(classDes);
			classVo.setClassFloor(classFloor);
			classVo.setClassNumber(classNumber);
			classVo.setClassCapacity(classCapacity);
			
			ClassDAO classd=new ClassDAO();
			classd.insertClass(classVo);
			
			response.sendRedirect("Project_Admin/manage_class.jsp");
		}
		
	}

}
