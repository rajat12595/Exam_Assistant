package Controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import DAO.PostDAO;
import DAO.PostDAO;
import DAO.PostDAO;
import VO.PostVO;
import VO.PostVO;

/**
 * Servlet implementation class PostController
 */
@WebServlet("/PostController")
public class PostController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PostController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String flag=request.getParameter("flag");
		if(flag.equals("SearchPost"))
		{
			Search(request,response);
			System.out.println(flag);
		}
		
		if(flag.equals("editPost"))
		{
			editPost(request, response);
		}
		
		if(flag.equals("deletePost"))
		{
			deletePost(request, response);
		}
	}
	
	
	
	private void deletePost(HttpServletRequest request,
			HttpServletResponse response) throws IOException {
		// TODO Auto-generated method stub
		int id=Integer.parseInt(request.getParameter("id"));
		PostVO postVO=new PostVO();
		postVO.setPostId(id);
		
		PostDAO postDAO=new PostDAO();
		postDAO.DeletePost(postVO);
		Search(request, response);
	}

	private void editPost(HttpServletRequest request,
			HttpServletResponse response) throws IOException {
		// TODO Auto-generated method stub
		int id= Integer.parseInt(request.getParameter("id"));
		
		PostVO postVO=new PostVO();
		postVO.setPostId(id);
		
		PostDAO postDAO=new PostDAO();
		List ls= postDAO.EditPost(postVO);
		
		HttpSession session=request.getSession();
		session.setAttribute("postList", ls);
		
		response.sendRedirect("Project_Admin/manage_editpost.jsp");
		
		
		
	}


	private void Search(HttpServletRequest request, HttpServletResponse response) throws IOException {
		// TODO Auto-generated method stub
		PostDAO postDAO=new PostDAO();
		List ls=postDAO.SearchPost();
		HttpSession session=request.getSession();
		session.setAttribute("postList", ls);
		response.sendRedirect("Project_Admin/post_dataTable.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String flag= request.getParameter("flag");
		
		if(flag.equals("UpdatePost"))
		{
			Update(request,response);
		}
		if(flag.equals("InsertPost"))
		{
			System.out.println(flag);
		
			String postName= request.getParameter("PostName");
			String postDescription= request.getParameter("PostDescription");
			
			
			PostVO postVO=new PostVO();
			postVO.setPostName(postName);
			postVO.setPostDescription(postDescription);
			
			
			PostDAO postDAO=new PostDAO();
			postDAO.insertPost(postVO);
			
			response.sendRedirect("Project_Admin/manage_post.jsp");
		
	}

}

	private void Update(HttpServletRequest request, HttpServletResponse response) throws IOException {
		// TODO Auto-generated method stub
		
		int postid=Integer.parseInt(request.getParameter("postId"));
		String postName= request.getParameter("PostName");
		String postDescription= request.getParameter("PostDescription");
		
		
		PostVO postVO=new PostVO();
		postVO.setPostId(postid);
		postVO.setPostName(postName);
		postVO.setPostDescription(postDescription);
		
		
		PostDAO postDAO=new PostDAO();
		postDAO.updatePost(postVO);
		
		Search(request, response);
		
	}

}