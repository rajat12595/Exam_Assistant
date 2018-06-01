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

import com.sun.org.apache.bcel.internal.generic.BranchHandle;
import com.sun.org.apache.regexp.internal.recompile;

import VO.AddProfessorVO;
import VO.BranchVO;
import VO.ClassBlockVO;
import VO.ExamVO;
import VO.FacultyVO;
import VO.ScheduleVO;
import DAO.AddProfessorDAO;
import DAO.ClassBlockDAO;
import DAO.FacultyDAO;
import DAO.FacultyDAO;
import DAO.ExamDAO;
import DAO.ScheduleDAO;

/**
 * Servlet implementation class FacultyController
 */
@WebServlet("/FacultyController")
public class FacultyController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FacultyController() {
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
			Search(request,response);
			System.out.println(flag);
		}
		
		
		else if(flag.equals("Add"))
		{
			Add(request,response);
			System.out.println(flag);
		}
		
		
		else if(flag.equals("AddSchedule"))
		{
			AddSchedule(request,response);
			System.out.println(flag);
		}
		
		
		else if(flag.equals("SearchSchedule"))
		{
			SearchSchedule(request,response);
			System.out.println(flag);
		}
		
		else if(flag.equals("Delete"))
		{
			Delete(request, response);
			System.out.println(flag);
			
		}
		
		
		else if(flag.equals("DeleteSchedule"))
		{
			DeleteSchedule(request, response);
			System.out.println(flag);
			
		}
	}

	private void AddSchedule(HttpServletRequest request,
			HttpServletResponse response) throws IOException {
		// TODO Auto-generated method stub
		HttpSession session=request.getSession();
		
		AddProfessorDAO addProfessordao= new AddProfessorDAO();
		List lsp=new ArrayList();
		lsp=addProfessordao.SearchProfessor();
		session.setAttribute("professorlist", lsp);
		
		ExamDAO examDAO=new ExamDAO();
		List lse=examDAO.SearchExam();
		session.setAttribute("examlist", lse);
		
		response.sendRedirect("Project_Admin/enterFacultyShedule.jsp");
	}
	
	
	private void SearchSchedule(HttpServletRequest request, HttpServletResponse response) throws IOException {
		// TODO Auto-generated method stub
		
				

		ScheduleDAO scheduleDAO=new ScheduleDAO();
		List ls=scheduleDAO.SearchSchedule();
		HttpSession session=request.getSession();
		session.setAttribute("ScheduleList", ls);
		response.sendRedirect("Project_Admin/shedule_dataTable.jsp");
	}

	private void Search(HttpServletRequest request, HttpServletResponse response) throws IOException {
		// TODO Auto-generated method stub
		
				

		FacultyDAO facultyDAO=new FacultyDAO();
		List ls=facultyDAO.SearchFaculty();
		HttpSession session=request.getSession();
		session.setAttribute("FacultyList", ls);
		response.sendRedirect("Project_Admin/facultyShedule_dataTable.jsp");
	}
	
	
	private void Delete(HttpServletRequest request, HttpServletResponse response) throws IOException {
		// TODO Auto-generated method stub
		int facultyId=Integer.parseInt(request.getParameter("id"));
		FacultyVO facultyVO=new FacultyVO();
		facultyVO.setFacultyId(facultyId);
		FacultyDAO facultyDAO=new FacultyDAO();
		facultyDAO.DeleteFaculty(facultyVO);
		Search(request, response);
	}

	
	private void DeleteSchedule(HttpServletRequest request, HttpServletResponse response) throws IOException {
		// TODO Auto-generated method stub
		int scheduleId=Integer.parseInt(request.getParameter("id"));
		ScheduleVO scheduleVO=new ScheduleVO();
		scheduleVO.setScheduleId(scheduleId);
		ScheduleDAO scheduleDAO=new ScheduleDAO();
		scheduleDAO.DeleteSchedule(scheduleVO);
		SearchSchedule(request, response);
	}
	
	
	private void Add(HttpServletRequest request, HttpServletResponse response) throws IOException {
		// TODO Auto-generated method stub
		HttpSession session=request.getSession();
		AddProfessorDAO addProfessordao= new AddProfessorDAO();
		List lsp=new ArrayList();
		lsp=addProfessordao.SearchProfessor();
		session.setAttribute("professorlist", lsp);
		
		
		ExamDAO examDAO=new ExamDAO();
		List lse=examDAO.SearchExam();
		session.setAttribute("examlist", lse);
		
		ClassBlockDAO classBlockDAO=new ClassBlockDAO();
		List lsb=classBlockDAO.SearchClassBlock();
		session.setAttribute("classBlockList", lsb);
		
		response.sendRedirect("Project_Admin/allocateFaculty.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
		String flag=request.getParameter("flag");

		if(flag.equals("insertFaculty"))
		{
			System.out.println(flag);
			int name=Integer.parseInt(request.getParameter("id"));
			int exam= Integer.parseInt(request.getParameter("exam"));
			int classBlock= Integer.parseInt(request.getParameter("classBlock"));
			
			AddProfessorVO addProfessorVO=new AddProfessorVO();
			addProfessorVO.setAddProfessorId(name);
			
			ExamVO examVO=new ExamVO();
			examVO.setExamId(exam);
			
			ClassBlockVO classBlockVO= new ClassBlockVO();
			classBlockVO.setClassBlockId(classBlock);
			
			FacultyVO facultyVO=new FacultyVO();
			facultyVO.setAddProfessorVO(addProfessorVO);
			facultyVO.setClassBlockVO(classBlockVO);
			facultyVO.setExamVO(examVO);
			
			
			FacultyDAO facultyDAO=new FacultyDAO();
			facultyDAO.insertFaculty(facultyVO);
			
			
			response.sendRedirect("Project_Admin/allocateFaculty.jsp");
		}


		
		
		if(flag.equals("SFaculty"))
		{
			System.out.println(flag);
			int name=Integer.parseInt(request.getParameter("id"));
			int exam= Integer.parseInt(request.getParameter("exam"));
			String scheduleDescription= request.getParameter("ScheduleDescription");
			
			AddProfessorVO addProfessorVO=new AddProfessorVO();
			addProfessorVO.setAddProfessorId(name);
			
			ExamVO examVO=new ExamVO();
			examVO.setExamId(exam);
			
					
			ScheduleVO scheduleVO=new ScheduleVO();
			scheduleVO.setAddProfessorVO(addProfessorVO);
			scheduleVO.setExamVO(examVO);
			scheduleVO.setDescreiption(scheduleDescription);
			
			
			ScheduleDAO scheduleDAO=new ScheduleDAO();
			scheduleDAO.insertSchedule(scheduleVO);
			
			
			response.sendRedirect("Project_Admin/enterFacultyShedule.jsp");
		}
	}

}
