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

import DAO.BranchDAO;
import DAO.ExamDAO;
import DAO.ClassBlockDAO;
import DAO.ClassDAO;
import VO.ClassBlockVO;
import VO.ClassVo;
import VO.ExamVO;

/**
 * Servlet implementation class ClassBlockController
 */
@WebServlet("/ClassBlockController")
public class ClassBlockController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ClassBlockController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String flag=request.getParameter("flag");
		if(flag.equals("SearchBlock"))
		{
			System.out.println(flag);
			Search(request,response);
		}
		
		if(flag.equals("Add"))
		{
			Add(request,response);
			System.out.println(flag);
		}
		
		if(flag.equals("EditClassBlock"))
		{
			System.out.println(flag);
			Edit(request,response);
		}
		
				
		if(flag.equals("DeleteClassBlock"))
		{
			System.out.println(flag);
			Delete(request,response);
		}
	}

	
	private void Delete(HttpServletRequest request, HttpServletResponse response) throws IOException {
		// TODO Auto-generated method stub

		int id=Integer.parseInt(request.getParameter("id"));
		//System.out.println(id);
		ClassBlockVO blockVO=new ClassBlockVO();
		blockVO.setClassBlockId(id);
		ClassBlockDAO blockDAO=new ClassBlockDAO();
		blockDAO.DeleteClassBlock(blockVO);
		Search(request, response);

		
	}

	private void Edit(HttpServletRequest request, HttpServletResponse response) throws IOException {
		// TODO Auto-generated method stub
		
		
		HttpSession session=request.getSession();
		ClassDAO Classdao= new ClassDAO();
		List ls=new ArrayList();
		ls=Classdao.SearchClass();
		session.setAttribute("classlist", ls);
		
		
		ExamDAO Examdao= new ExamDAO();
		List ls1=new ArrayList();
		ls1=Examdao.SearchExam();
		session.setAttribute("examlist", ls1);
		int id=Integer.parseInt(request.getParameter("id"));
		//System.out.println(id);
		ClassBlockVO blockVO=new ClassBlockVO();
		blockVO.setClassBlockId(id);
		ClassBlockDAO blockDAO=new ClassBlockDAO();
		List ls2=blockDAO.EditClassBlock(blockVO);
		session.setAttribute("ClassBlockList", ls2);
		response.sendRedirect("Project_Admin/manage_editclassBlocks.jsp");
		
	}
	
	private void Add(HttpServletRequest request, HttpServletResponse response) throws IOException {
		// TODO Auto-generated method stub
		
		
		HttpSession session=request.getSession();
		ClassDAO Classdao= new ClassDAO();
		List ls=new ArrayList();
		ls=Classdao.SearchClass();
		session.setAttribute("classlist", ls);
		
		
		ExamDAO Examdao= new ExamDAO();
		List ls1=new ArrayList();
		ls1=Examdao.SearchExam();
		session.setAttribute("examlist", ls1);
		response.sendRedirect("Project_Admin/manage_classBlocks.jsp");
		
	}

	private void Search(HttpServletRequest request, HttpServletResponse response) throws IOException {
		// TODO Auto-generated method stub
		ClassBlockDAO classBlockDAO=new ClassBlockDAO();
		List ls=classBlockDAO.SearchClassBlock();
		HttpSession session=request.getSession();
		session.setAttribute("classBlockList", ls);
		response.sendRedirect("Project_Admin/classBlock_dataTable.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String flag=request.getParameter("flag");
		
		if(flag.equals("UpdateClassBlock"))
		{
			System.out.println(flag);
			update(request,response);
		}
		
		
		
		if(flag.equals("InsertClassBlock"))
		{
			System.out.println(flag);
			int classBlockExam=Integer.parseInt(request.getParameter("ClassBlockExam"));
			int classBlockNumber=Integer.parseInt(request.getParameter("ClassBlockNumber"));
			String classBlockTitle= request.getParameter("ClassBlockTitle");
			String classBlockSize= request.getParameter("ClassBlockSize");
			String classBlockDescription= request.getParameter("ClassBlockDescription");
			
			ClassVo classVO=new ClassVo();
			classVO.setClassId(classBlockNumber);
			
			ExamVO examVO=new ExamVO();
			examVO.setExamId(classBlockExam);
			
			ClassBlockVO classBlockVO=new ClassBlockVO();
			classBlockVO.setExamVO(examVO);
			classBlockVO.setClassVo(classVO);
			classBlockVO.setClassBlockTitle(classBlockTitle);
			classBlockVO.setClassBlockSize(classBlockSize);
			classBlockVO.setClassBlockDescription(classBlockDescription);
			ClassBlockDAO classBlockDAO=new ClassBlockDAO();
			classBlockDAO.insertClassBlock(classBlockVO);
			
			response.sendRedirect("Project_Admin/manage_classBlocks.jsp");
			
		}
	}
	
	private void update(HttpServletRequest request, HttpServletResponse response) throws IOException {
		// TODO Auto-generated method stub
		
		int ID=Integer.parseInt(request.getParameter("classBlockId"));
		int classBlockExam=Integer.parseInt(request.getParameter("ClassBlockExam"));
		int classBlockNumber=Integer.parseInt(request.getParameter("ClassBlockNumber"));
		String classBlockTitle= request.getParameter("ClassBlockTitle");
		String classBlockSize= request.getParameter("ClassBlockSize");
		String classBlockDescription= request.getParameter("ClassBlockDescription");
		
		ClassVo classVO=new ClassVo();
		classVO.setClassId(classBlockNumber);
		
		ExamVO examVO=new ExamVO();
		examVO.setExamId(classBlockExam);
		
		
		ClassBlockVO classBlockVO=new ClassBlockVO();
		classBlockVO.setClassBlockId(ID);
		classBlockVO.setExamVO(examVO);
		classBlockVO.setClassVo(classVO);
		classBlockVO.setClassBlockTitle(classBlockTitle);
		classBlockVO.setClassBlockSize(classBlockSize);
		classBlockVO.setClassBlockDescription(classBlockDescription);
		
		ClassBlockDAO classBlockDAO=new ClassBlockDAO();
		classBlockDAO.updateClassBlock(classBlockVO);
		

		Search(request,response);
	}

}
