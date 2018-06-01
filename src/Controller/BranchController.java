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
import VO.BranchVO;

/**
 * Servlet implementation class BranchController
 */
@WebServlet("/BranchController")
public class BranchController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BranchController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String flag= request.getParameter("flag");
		if(flag.equals("SearchBranch"))
		{
			Search(request, response);
		}
		
		if(flag.equals("editBranch"))
		{
			editBranch(request, response);
		}
		
		if(flag.equals("deleteBranch"))
		{
			deleteBranch(request, response);
		}
	}

	private void deleteBranch(HttpServletRequest request,
			HttpServletResponse response) throws IOException {
		// TODO Auto-generated method stub
		int id=Integer.parseInt(request.getParameter("id"));
		BranchVO branchVO=new BranchVO();
		branchVO.setBranchId(id);
		
		BranchDAO branchDAO=new BranchDAO();
		branchDAO.deleteBranch(branchVO);
		Search(request, response);
	}

	private void editBranch(HttpServletRequest request,
			HttpServletResponse response) throws IOException {
		// TODO Auto-generated method stub
		int id= Integer.parseInt(request.getParameter("id"));
		
		BranchVO branchVO=new BranchVO();
		branchVO.setBranchId(id);
		
		BranchDAO branchDAO=new BranchDAO();
		List ls= branchDAO.editBranch(branchVO);
		
		HttpSession session=request.getSession();
		session.setAttribute("branchList", ls);
		
		response.sendRedirect("Project_Admin/update_branch.jsp");
		
		
		
	}

	private void Search(HttpServletRequest request, HttpServletResponse response) throws IOException {
		// TODO Auto-generated method stub
		
		BranchDAO Branchdao= new BranchDAO();
		List ls=new ArrayList();
		ls=Branchdao.searchBranch();
		HttpSession session= request.getSession();
		session.setAttribute("branchList", ls);
		response.sendRedirect("Project_Admin/branch_dataTable.jsp");
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String flag= request.getParameter("flag");
		if(flag.equals("InsertBranch"))
		{System.out.println(flag);
			String branchName= request.getParameter("BranchName");
			String branchDes= request.getParameter("BranchDescription");
			long branchCode = Long.parseLong(request.getParameter("BranchCode"));
			
			BranchVO branchVO=new BranchVO();
			branchVO.setBranchName(branchName);
			branchVO.setBranchDes(branchDes);
			branchVO.setBranchCode(branchCode);
			
			BranchDAO branchDAO=new BranchDAO();
			branchDAO.insertBranch(branchVO);
			
			response.sendRedirect("Project_Admin/manage_branch.jsp");
			
		}
		
		if(flag.equals("EditBranch"))
		{
		   update(request, response);	
		}

}

	private void update(HttpServletRequest request, HttpServletResponse response) throws IOException {
		// TODO Auto-generated method stub
		int branchID=Integer.parseInt(request.getParameter("BranchID"));
		String branchName= request.getParameter("BranchName");
		String branchDes= request.getParameter("BranchDescription");
		long branchCode = Long.parseLong(request.getParameter("BranchCode"));
		
		BranchVO branchVO=new BranchVO();
		branchVO.setBranchId(branchID);
		branchVO.setBranchName(branchName);
		branchVO.setBranchDes(branchDes);
		branchVO.setBranchCode(branchCode);
		
		BranchDAO branchDAO=new BranchDAO();
		branchDAO.updateBranch(branchVO);
		Search(request, response);
	}
}