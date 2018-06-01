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

import jdk.internal.org.objectweb.asm.tree.IntInsnNode;
import DAO.BranchDAO;
import DAO.ExamDAO;
import DAO.SemesterDAO;
import VO.ExamVO;
import VO.SemesterVO;
import VO.BranchVO;

/**
 * Servlet implementation class ExamController
 */
@WebServlet("/ExamController")
public class ExamController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ExamController() {
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
		
		if(flag.equals("EditExam"))
		{
			Edit(request,response);
			System.out.println(flag);
			
		}
		
		if(flag.equals("Add"))
		{
			Add(request,response);
			System.out.println(flag);
		}
		
		if(flag.equals("Search"))
		{
			Search(request, response);
			System.out.println(flag);
			
		}
		
		if(flag.equals("hodSearch"))
		{
			Search(request, response);
			System.out.println(flag);
			response.sendRedirect("Project_Admin/hod_exam_dataTable.jsp");
		}
		
		else if(flag.equals("Delete"))
				{
			Delete(request, response);
			System.out.println(flag);
			Search(request, response);
				}
		
		else if (flag.equals("loadState"))
		{
			loadState(request, response);
		}
	}
	
	
	
	protected void loadState(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {

		int countryId=Integer.parseInt(request.getParameter("countryId"));
		
		BranchVO branchVO=new BranchVO();
		branchVO.setBranchId(countryId);
		
		ExamDAO examDAO=new ExamDAO();
		List list = examDAO.LoadSemester(branchVO);
		
		HttpSession session=request.getSession();
		session.setAttribute("semesterlist", list);
		
		response.sendRedirect("Project_Admin/JSON/loadSemester.jsp");
		
	}
	
	
	private void Add(HttpServletRequest request, HttpServletResponse response) throws IOException {
		// TODO Auto-generated method stub
		HttpSession session=request.getSession();
		BranchDAO Branchdao= new BranchDAO();
		List lsb=new ArrayList();
		lsb=Branchdao.searchBranch();
		session.setAttribute("branchlist", lsb);
		SemesterDAO semesterDAO=new SemesterDAO();
		List lss=semesterDAO.SearchSemester();
		session.setAttribute("semesterlist", lss);
		
		response.sendRedirect("Project_Admin/manage_exam.jsp");
	}
	
	
	

	private void Edit(HttpServletRequest request, HttpServletResponse response) throws IOException {
		// TODO Auto-generated method stub

		int id=Integer.parseInt(request.getParameter("id"));
		//System.out.println(id);
		ExamVO examVO=new ExamVO();
		examVO.setExamId(id);
		ExamDAO examDAO=new ExamDAO();
		List ls=examDAO.EditExam(examVO);
		HttpSession session=request.getSession();
		session.setAttribute("ExamList", ls);
		response.sendRedirect("Project_Admin/manage_editexam.jsp");
	}

	private void Delete(HttpServletRequest request, HttpServletResponse response) throws IOException {
		// TODO Auto-generated method stub
		int examId=Integer.parseInt(request.getParameter("id"));
		ExamVO examVO=new ExamVO();
		examVO.setExamId(examId);
		ExamDAO examDAO=new ExamDAO();
		examDAO.DeleteExam(examVO);
		//Search(request, response);
		
	}

	private void Search(HttpServletRequest request, HttpServletResponse response) throws IOException {
		// TODO Auto-generated method stub
		ExamDAO examDAO=new ExamDAO();
		List ls=examDAO.SearchExam();
		HttpSession session=request.getSession();
		session.setAttribute("examList", ls);
		response.sendRedirect("Project_Admin/exam_dataTable.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String flag= request.getParameter("flag");
		
		if(flag.equals("UpdateExam"))
		{
			update(request,response);
		}
		
		
		if(flag.equals("InsertExam"))
		{
			System.out.println(flag);
			int examBranch=Integer.parseInt(request.getParameter("countryId"));
			int examSemester=Integer.parseInt(request.getParameter("stateId"));;
			String examTitle= request.getParameter("ExamTitle");
			String examDescription= request.getParameter("ExamDescription");
			String examDate= request.getParameter("ExamDate");
			String examTimeSlot= request.getParameter("ExamTimeSlot");		
			
			BranchVO branchVO=new BranchVO();
			branchVO.setBranchId(examBranch);
			
			SemesterVO semesterVO=new SemesterVO();
			semesterVO.setSemId(examSemester);
			
			
			ExamVO examVO=new ExamVO(); 	
			examVO.setBranchVO(branchVO);
			examVO.setSemesterVO(semesterVO);
			examVO.setExamTitle(examTitle);
			examVO.setExamDescription(examDescription);
			examVO.setExamDate(examDate);
			examVO.setExamTimeSlot(examTimeSlot);
			
			
			ExamDAO examDAO=new ExamDAO();
			examDAO.insertExam(examVO);
			response.sendRedirect("Project_Admin/manage_exam.jsp");

			
		}
	}

	private void update(HttpServletRequest request, HttpServletResponse response) throws IOException {
		// TODO Auto-generated method stub
		int ID=Integer.parseInt(request.getParameter("examId"));
		
		int examBranch=Integer.parseInt(request.getParameter("countryId"));
		int examSemester=Integer.parseInt(request.getParameter("stateId"));
		String examTitle= request.getParameter("ExamTitle");
		String examDescription= request.getParameter("ExamDescription");
		String examDate= request.getParameter("ExamDate");
		String examTimeSlot= request.getParameter("ExamTimeSlot");		
		ExamVO examVO=new ExamVO(); 	
		
		BranchVO branchVO=new BranchVO();
		branchVO.setBranchId(examBranch);
		
		SemesterVO semesterVO=new SemesterVO();
		semesterVO.setSemId(examSemester);
		
		
		examVO.setExamId(ID);
		examVO.setBranchVO(branchVO);
		examVO.setSemesterVO(semesterVO);
		examVO.setExamTitle(examTitle);
		examVO.setExamDescription(examDescription);
		examVO.setExamDate(examDate);
		examVO.setExamTimeSlot(examTimeSlot);
		ExamDAO examDAO=new ExamDAO();
		examDAO.updateExam(examVO);
		Search(request, response);
		
	}

}
