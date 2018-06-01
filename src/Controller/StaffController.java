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
import DAO.StaffDAO;
import DAO.StaffDAO;
import VO.BranchVO;
import VO.StaffVO;
import VO.StaffVO;

/**
 * Servlet implementation class StaffController
 */
@WebServlet("/StaffController")
public class StaffController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StaffController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String flag=request.getParameter("flag");
		if(flag.equals("SearchStaff"))
		{
			Search(request,response);
			System.out.println(flag);
		}
		
		
		if(flag.equals("Add"))
		{
			Add(request,response);
			System.out.println(flag);
		}
		
		
		
		if(flag.equals("EditStaff"))
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
	int staffId=Integer.parseInt(request.getParameter("id"));
	StaffVO staffVO=new StaffVO();
	staffVO.setStaffId(staffId);
	StaffDAO staffDAO=new StaffDAO();
	staffDAO.DeleteStaff(staffVO);
	Search(request, response);
}

private void Edit(HttpServletRequest request, HttpServletResponse response) throws IOException {
	// TODO Auto-generated method stub
	int id=Integer.parseInt(request.getParameter("id"));
	StaffVO staffVO=new StaffVO();
	staffVO.setStaffId(id);
	
	StaffDAO staffDAO=new StaffDAO();
	List ls=staffDAO.EditStaff(staffVO);
	HttpSession session=request.getSession();
	session.setAttribute("StaffList", ls);
	response.sendRedirect("Project_Admin/manage_editstaff.jsp");
	
}


private void Add(HttpServletRequest request, HttpServletResponse response) throws IOException {
	// TODO Auto-generated method stub
	HttpSession session=request.getSession();
	BranchDAO Branchdao= new BranchDAO();
	List ls=new ArrayList();
	ls=Branchdao.searchBranch();
	session.setAttribute("branchlist", ls);
	response.sendRedirect("Project_Admin/manage_addStaffMember.jsp");
}


private void Search(HttpServletRequest request, HttpServletResponse response) throws IOException {
	// TODO Auto-generated method stub
	StaffDAO staffDAO=new StaffDAO();
	List ls=staffDAO.SearchStaff();
	HttpSession session=request.getSession();
	session.setAttribute("staffList", ls);
	response.sendRedirect("Project_Admin/staff_dataTable.jsp");
	
}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String flag=request.getParameter("flag");
		if(flag.equals("InsertStaff"))
		{
			System.out.println(flag);
			int staffDepartement=Integer.parseInt(request.getParameter("StaffDepatement")) ;
			String staffName=request.getParameter("StaffName");
			String staffDateOfBirth=request.getParameter("StaffDateOfBirth");
			String staffGender=request.getParameter("StaffGender");			
			String staffPosition=request.getParameter("StaffPosition");
			String staffEmail=request.getParameter("StaffEmail");
			String staffPhone=request.getParameter("StaffPhone");
			String staffPassword=request.getParameter("StaffPassword");
			
			System.out.println(staffPosition);
			BranchVO branchVO=new BranchVO();
			branchVO.setBranchId(staffDepartement);
			
			StaffVO staffVO=new StaffVO();
			
			staffVO.setBranchVO(branchVO);
			
			staffVO.setStaffName(staffName);
			staffVO.setStaffDateOfBirth(staffDateOfBirth);
			staffVO.setStaffPosition(staffPosition);
			staffVO.setStaffEmail(staffEmail);
			staffVO.setStaffPhone(staffPhone);
			staffVO.setStaffPassword(staffPassword);
			staffVO.setStaffGender(staffGender);
			
			StaffDAO staffDAO=new StaffDAO();
			staffDAO.insertStaff(staffVO);
			
			response.sendRedirect("Project_Admin/manage_addStaffMember.jsp");

		}	
	}
		
}
