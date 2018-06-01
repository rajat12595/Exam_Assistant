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
import javax.websocket.Session;






import DAO.BranchDAO;
import DAO.SemesterDAO;
import VO.BranchVO;
import VO.ClassVo;
import VO.SemesterVO;

/**
 * Servlet implementation class SemesterController
 */
@WebServlet("/SemesterController")
public class SemesterController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SemesterController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String flag=request.getParameter("flag");

		if(flag.equals("EditSemester"))
		{
			Edit(request,response);
			System.out.println(flag);
		}
		
		if(flag.equals("Add"))
		{
			Add(request,response);
			System.out.println(flag);
		}

		if(flag.equals("SearchSemester"))
		{
			Search(request,response);
			System.out.println(flag);
		}
		
		if(flag.equals("DeleteSemester"))
		{
			Delete(request,response);
			System.out.println(flag);
		}
	}
	

	private void Add(HttpServletRequest request, HttpServletResponse response) throws IOException {
		// TODO Auto-generated method stub
		HttpSession session=request.getSession();
		BranchDAO Branchdao= new BranchDAO();
		List ls=new ArrayList();
		ls=Branchdao.searchBranch();
		session.setAttribute("branchlist", ls);
		response.sendRedirect("Project_Admin/manage_semester.jsp");
	}

	private void Delete(HttpServletRequest request, HttpServletResponse response) throws IOException {
		// TODO Auto-generated method stub
		int semId=Integer.parseInt(request.getParameter("id"));
		SemesterVO semesterVO=new SemesterVO();
		semesterVO.setSemId(semId);
		SemesterDAO semesterDAO=new SemesterDAO();
		semesterDAO.DeleteSemester(semesterVO);
		Search(request, response);
	}

	private void Edit(HttpServletRequest request, HttpServletResponse response) throws IOException, NumberFormatException {
		// TODO Auto-generated method stub\
		int id=Integer.parseInt(request.getParameter("id"));
		//System.out.println(id);
		SemesterVO semesterVO=new SemesterVO();
		semesterVO.setSemId(id);
		SemesterDAO semesterDAO=new SemesterDAO();
		List ls=semesterDAO.EditSemester(semesterVO);
		HttpSession session=request.getSession();
		
		BranchDAO Branchdao= new BranchDAO();
		List lsb=new ArrayList();
		lsb=Branchdao.searchBranch();
		session.setAttribute("branchlist", lsb);
		session.setAttribute("SemesterList", ls);
		response.sendRedirect("Project_Admin/manage_editsemester.jsp");
		
	}

	private void Search(HttpServletRequest request, HttpServletResponse response) throws IOException {
		// TODO Auto-generated method stub
		SemesterDAO semesterDAO = new SemesterDAO();
		List ls=semesterDAO.SearchSemester();
		HttpSession session=request.getSession();
		session.setAttribute("SemesterList", ls);
		
		response.sendRedirect("Project_Admin/semester_dataTable.jsp");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String flag= request.getParameter("flag");
		if(flag.equals("UpdateSemester"))
		{
		
			update(request,response);
			
		}
		if(flag.equals("insertSemester"))
		{
			System.out.println(flag);
			int semBranch=Integer.parseInt(request.getParameter("SemBranch")) ;
			String semDes= request.getParameter("SemDes");
			String semName= request.getParameter("SemName");
			
			BranchVO branchVO=new BranchVO();
			branchVO.setBranchId(semBranch);
			
			
			SemesterVO semvo=new SemesterVO();
			
			semvo.setSemDes(semDes);
			semvo.setSemName(semName);
			semvo.setBranchVO(branchVO);
			
			
			SemesterDAO semdao=new SemesterDAO();
			semdao.insertSemester(semvo);
			
			response.sendRedirect("Project_Admin/manage_semester.jsp");
		}
		
	}

	private void update(HttpServletRequest request, HttpServletResponse response) throws IOException {
		// TODO Auto-generated method stub
		int ID=Integer.parseInt(request.getParameter("semesterId"));
		
		int semBranch=Integer.parseInt(request.getParameter("SemBranch")) ;
		String semDes= request.getParameter("SemDes");
		String semName= request.getParameter("SemName");
		
		
		BranchVO branchVO=new BranchVO();
		branchVO.setBranchId(semBranch);
		
		
		SemesterVO semvo=new SemesterVO();
		
		semvo.setSemId(ID);
		semvo.setBranchVO(branchVO);
		semvo.setSemDes(semDes);
		semvo.setSemName(semName);
		
		
		SemesterDAO semdao=new SemesterDAO();
		semdao.updateSemester(semvo);
		
		Search(request, response);

		
	}

}
