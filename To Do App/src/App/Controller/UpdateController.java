package App.Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import App.bo.app_bo_add;
import App.dao.App_dao_class;

/**
 * Servlet implementation class UpdateController
 */
@WebServlet("/UpdateController")
public class UpdateController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		
		int id=Integer.parseInt(request.getParameter("id"));
		
		
		String name=request.getParameter("name");
		String task=request.getParameter("task");
		String status=request.getParameter("status");
		
		app_bo_add ab=new app_bo_add();
		ab.setId(id);
		ab.setName(name);
		ab.setTask(task);
		ab.setStatus(status);
		App_dao_class.Update(ab);
	    response.sendRedirect("All_app_controller");
		     
		
		
	}

}
