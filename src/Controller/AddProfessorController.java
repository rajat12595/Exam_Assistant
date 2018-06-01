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

import DAO.AddProfessorDAO;
import DAO.BranchDAO;
import DAO.ExamDAO;
import VO.AddProfessorVO;
import VO.BranchVO;
import VO.ExamVO;

/**
 * Servlet implementation class AddProfessorController
 */
@WebServlet("/AddProfessorController")
public class AddProfessorController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddProfessorController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String flag=request.getParameter("flag");
		
		if(flag.equals("Add"))
		{
			Add(request,response);
			System.out.println(flag);
		}
		
		
		if(flag.equals("SearchProfessor"))
		{
			Search(request,response);
			System.out.println(flag);
		}
		
		if(flag.equals("EditProfessor"))
		{
			Edit(request,response);
			System.out.println(flag);
		}
		
		
		else if(flag.equals("Delete"))
		{
			Delete(request, response);
			System.out.println(flag);
		}
	}

	private void Delete(HttpServletRequest request, HttpServletResponse response) throws IOException {
		// TODO Auto-generated method stub
		int addProfessorId=Integer.parseInt(request.getParameter("id"));
		AddProfessorVO addProfessorVO=new AddProfessorVO();
		addProfessorVO.setAddProfessorId(addProfessorId);
		AddProfessorDAO addProfessorDAO=new AddProfessorDAO();
		addProfessorDAO.DeleteAddProfessor(addProfessorVO);
		Search(request, response);
	}
	
	
	private void Add(HttpServletRequest request, HttpServletResponse response) throws IOException {
		// TODO Auto-generated method stub
		HttpSession session=request.getSession();
		BranchDAO Branchdao= new BranchDAO();
		List ls=new ArrayList();
		ls=Branchdao.searchBranch();
		session.setAttribute("branchlist", ls);
		response.sendRedirect("Project_Admin/manage_addprofessor.jsp");
	}
	

	private void Edit(HttpServletRequest request, HttpServletResponse response) throws IOException {
		// TODO Auto-generated method stub
		int id=Integer.parseInt(request.getParameter("id"));
		AddProfessorVO addProfessorVO=new AddProfessorVO();
		addProfessorVO.setAddProfessorId(id);
		
		
		HttpSession session=request.getSession();
		BranchDAO Branchdao= new BranchDAO();
		List ls=new ArrayList();
		ls=Branchdao.searchBranch();
		session.setAttribute("branchlist", ls);

		
		AddProfessorDAO addProfessorDAO=new AddProfessorDAO();
		List ls1=addProfessorDAO.EditAddProfessor(addProfessorVO);
		session.setAttribute("ProfessorList", ls1);
		response.sendRedirect("Project_Admin/manage_editprofessor.jsp");
		
	}

	private void Search(HttpServletRequest request, HttpServletResponse response) throws IOException {
		// TODO Auto-generated method stub
		AddProfessorDAO addProfessorDAO=new AddProfessorDAO();
		List ls=addProfessorDAO.SearchProfessor();
		HttpSession session=request.getSession();
		session.setAttribute("professorList", ls);
		response.sendRedirect("Project_Admin/professor_dataTable.jsp");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String flag=request.getParameter("flag");
		if(flag.equals("InsertProfessor"))
		{
			System.out.println(flag);
			
			int addProfessorDepartement=Integer.parseInt(request.getParameter("AddProfessorDepartement")) ;
			String addProfessorName=request.getParameter("AddProfessorName");
			String addProfessorDateOfBirth=request.getParameter("AddProfessorDateOfBirth");
			String addProfessorGender=request.getParameter("AddProfessorGender");
			
			String addProfessorPosition=request.getParameter("AddProfessorPosition");
			String addProfessorEmail=request.getParameter("AddProfessorEmail");
			String addProfessorPhone=request.getParameter("AddProfessorPhone");
			String addProfessorPassword=request.getParameter("AddProfessorPassword");
			
			
			BranchVO branchVO=new BranchVO();
			branchVO.setBranchId(addProfessorDepartement);
			
			
			AddProfessorVO addProfessorVO=new AddProfessorVO();
			addProfessorVO.setAddProfessorName(addProfessorName);
			addProfessorVO.setAddProfessorDateOfBirth(addProfessorDateOfBirth);
			addProfessorVO.setBranchVO(branchVO);
			addProfessorVO.setAddProfessorPosition(addProfessorPosition);
			addProfessorVO.setAddProfessorEmail(addProfessorEmail);
			addProfessorVO.setAddProfessorPhone(addProfessorPhone);
			addProfessorVO.setAddProfessorPassword(addProfessorPassword);
			
			addProfessorVO.setAddProfessorGender(addProfessorGender);
			
			
			
			
			AddProfessorDAO addProfessorDAO=new AddProfessorDAO();
			addProfessorDAO.insertAddProfessor(addProfessorVO);
			
			response.sendRedirect("Project_Admin/manage_addprofessor.jsp");
			
		}
		
		if(flag.equals("EditProfessor"))
		{
			System.out.println(flag);
			
			update(request,response);
		}
	}

	private void update(HttpServletRequest request, HttpServletResponse response) throws IOException {
		// TODO Auto-generated method stub
		int addProfessorDepartement=Integer.parseInt(request.getParameter("AddProfessorDepartement")) ;
		
		Integer addProfessorId=Integer.parseInt(request.getParameter("AddProfessorId"));
		String addProfessorName=request.getParameter("AddProfessorName");
		String addProfessorDateOfBirth=request.getParameter("AddProfessorDateOfBirth");
		String addProfessorGender=request.getParameter("AddProfessorGender");
		
		String addProfessorPosition=request.getParameter("AddProfessorPosition");
		String addProfessorEmail=request.getParameter("AddProfessorEmail");
		String addProfessorPhone=request.getParameter("AddProfessorPhone");
		String addProfessorPassword=request.getParameter("AddProfessorPassword");
		String addProfessorConfirmPassword=request.getParameter("AddProfessorConfirmPassword");
		System.out.println(addProfessorDepartement);
		

		BranchVO branchVO=new BranchVO();
		branchVO.setBranchId(addProfessorDepartement);
		
		AddProfessorVO addProfessorVO=new AddProfessorVO();
		addProfessorVO.setAddProfessorId(addProfessorId);
		addProfessorVO.setAddProfessorName(addProfessorName);
		addProfessorVO.setAddProfessorDateOfBirth(addProfessorDateOfBirth);
		addProfessorVO.setBranchVO(branchVO);
		addProfessorVO.setAddProfessorPosition(addProfessorPosition);
		addProfessorVO.setAddProfessorEmail(addProfessorEmail);
		addProfessorVO.setAddProfessorPhone(addProfessorPhone);
		addProfessorVO.setAddProfessorPassword(addProfessorPassword);
		
		addProfessorVO.setAddProfessorGender(addProfessorGender);
		
		
		
		
		AddProfessorDAO addProfessorDAO=new AddProfessorDAO();
		addProfessorDAO.updateAddProfessor(addProfessorVO);
		
		Search(request, response);
	}

}
